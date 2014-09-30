package com.hack.bulgaria.glob;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileTreeWalker extends SimpleFileVisitor<Path> {
	private String extension;
	private boolean found;
	public FileTreeWalker(String pExtension) {
		this.extension=pExtension;
	}
@Override
public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
		throws IOException {
	if(file.endsWith(extension)){
		setFound(true);
		return null;
	}
	return FileVisitResult.CONTINUE;
}
public boolean isFound() {
	return found;
}
public void setFound(boolean found) {
	this.found = found;
}
}
