package com.hack.generics;

public class Pair<T,E> {
    private T data1;
    private E data2;
    public Pair(T tData,E eData){
        data1=tData;
        data2=eData;
    }
    public T getData1() {
        return data1;
    }
    public void setData1(T data1) {
        this.data1 = data1;
    }
    public E getData2() {
        return data2;
    }
    public void setData2(E data2) {
        this.data2 = data2;
    }
    @Override
    public String toString(){
        return "<"+ data1.toString()+data2.toString()+">";
    }
    public static void main(String[] args) {
        Pair pair=new Pair<>(3,"abv");
        System.out.println(pair.toString());
        
    }
}
