package com.hack.bulgaria.glob;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.esotericsoftware.wildcard.Paths;

public class Glob {
	private String expresion;
	private Type type;

	public Glob(String pExpresion) {
		setExpresion(pExpresion);
		findType(pExpresion);
	}

	private void findType(String pExpresion) {
		if (pExpresion.contains("**.")) {
			type = Type.FILEINCURRENTANDDECENDANTDIR;
			return;
		} else if (pExpresion.contains("*.") || pExpresion.contains("?*.")) {
			type = Type.FILEINCURRENTFOLDER;
			return;
		} else if (pExpresion.contains("{")&&pExpresion.contains("}")) {
			type = Type.MATCINARRAY;
			return;
		} else if (pExpresion.contains("*")){
			type= Type.SERCHINSTRING;
			return;
		} else if (pExpresion.contains("?")){ 
			type = Type.SINGLEWHILDCARDSYMBOL;
			return;
		}else type=Type.EXACTMATCH;

	}

	public String getExpresion() {
		return expresion;
	}

	public void setExpresion(String expresion) {
		this.expresion = expresion;
		findType(expresion);
		
	}

	public boolean matches(String input) {
		try {
			switch (type) {
		
			case CONTAINSEXPRINNAME:
				return containsExpresionInName(input);
			case EXACTMATCH:
				return exactMatch(input);
			case FILEINCURRENTANDDECENDANTDIR:
				return fileInCurrDirAndDecendant(input);
			case FILEINCURRENTFOLDER:
				return !fileInCurrentFolder(input).isEmpty();
			case MATCINARRAY:
				return contains(input);
			case SERCHINSTRING:
				return serchInString(input);
			case SINGLEWHILDCARDSYMBOL:
				return setchSingleWildCard(input);
			default:
				break;
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean setchSingleWildCard(String input) {
		if(input.length()!=expresion.length()){
			return false;
			}
		StringBuilder builderInput=new StringBuilder(input);
		StringBuilder builderExpresion=new StringBuilder(expresion);
		for(int i=0;i<expresion.length();i++){
			if(expresion.charAt(i)=='?'){
				builderExpresion.deleteCharAt(i);
				builderInput.deleteCharAt(i);
			}
		}
		return (builderExpresion.toString()).equals(builderInput.toString());
	}

	private boolean serchInString(String input) {
		if(expresion.startsWith("*")){
			input = input.substring(input.indexOf(expresion.charAt(1)));
		}
		if(expresion.endsWith("*")){
			input=input.substring(0,input.lastIndexOf(expresion.length()-2));
		}
		String temp=input;
		List<String>parts =Arrays.asList( expresion.split("\\*"));
		for(int i=0;i<parts.size();i++){
			if(i==parts.size()-1){
				if(temp.endsWith(parts.get(i))){
					temp="";
				}
			}
			if(input.contains(parts.get(i))&&parts.get(i).length()!=0){
				temp = temp.substring(temp.indexOf(parts.get(i))+1);
			}
			
		}
		return temp.length()==0;
	}

	private List<File> fileInCurrentFolder(String input) {
		Paths paths = new Paths(input);
		List<File> files= new ArrayList<>();
		for (File file : paths.getFiles()) {
			String name = file.getName();
			String test = expresion.substring(expresion.indexOf("."));
			if (name.contains(test)) {
				files.add(file);
				
			}
		}
		return files;
	}

	private boolean fileInCurrDirAndDecendant(String input) throws IOException {
		String fileExtension = expresion.substring(expresion.indexOf("."));
		File path = new File(input);
		FileTreeWalker walker = new FileTreeWalker(fileExtension);
		Files.walkFileTree(path.toPath(), walker);
		return walker.isFound();
	}

	private boolean exactMatch(String input) {
		Paths paths = new Paths(input);
		for(File file: paths.getFiles()){
			if(expresion.equals(file.getName())){
				return true;
			}
		}
		return false;
	}

	private boolean containsExpresionInName(String input) {
		List<File> files = fileInCurrentFolder(input);
		for(File file:files){
			String name = expresion.substring(0,expresion.lastIndexOf(".")).replaceAll("*", "");
			if(file.getName().equals(name)){
				return true;
			}
		}
		return false;
	}

	private boolean contains(String input) {
		List<String> list = new ArrayList<>();
		String predicate = expresion.substring(0,expresion.indexOf("{"));
		String content = expresion.substring(expresion.indexOf("{")+1,expresion.lastIndexOf("}"));
		list=Arrays.asList(content.split(","));
		for(String current : list){
			if((predicate+current).equals(input)){
				return true;
			}
		}
		return false;
	}
	
}
