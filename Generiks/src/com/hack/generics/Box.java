package com.hack.generics;

public class Box<T> {
    private T data;
    public Box(T pData){
        setData(pData);
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
public static void main(String[] args) {
    Box<String> string=new Box<String>("test");
    System.out.println(string.getData());
    Box<Integer> integer=new Box<Integer>(6);
    System.out.println(integer.getData());
}
}
