package com.hackbulgaria.corejava;

public class FaultyProblem3 {
    
    public String reverseEveryWordInString(String sentence){
      StringBuilder res=new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word: words){
         res.append( word.replace(word, reverse(word))).append(" ");
            
        }
        return res.deleteCharAt(res.length()-1).toString();
    }

    private CharSequence reverse(String word) {
        return Utils.reverseMe(word);
    }
}
