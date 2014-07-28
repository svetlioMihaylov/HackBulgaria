package Impl;

import java.util.Stack;

public class BracketCorrect {
    private Stack<Character> stack;
    private char first;
    public BracketCorrect ()
    {
        stack=new Stack<Character>();
    }
  
    public boolean add(char what)
    {
        if(stack.size()==0)
        {
       if(what==')')
       
           return false;
       else if(what=='(');
       {
           stack.push(what);
           return true;
           
       }
      
        }
       if(what==')')
       {
           if(stack.peek()=='(')
               stack.pop();
       }
       else stack.push(what);
       
        return true;
    }
    public int size()
    {
        return stack.size();
    }
    public boolean check(String what)
    {
        int i=0;
       while(add(what.charAt(i)))
       {
           i++;
       }
       return this.size()==0&&what.length()==i;
       
    }
    public String last() {
       return stack.peek().toString();
    }
    public String checkFirst() {
        
        return stack.get(0).toString();
    }
}
