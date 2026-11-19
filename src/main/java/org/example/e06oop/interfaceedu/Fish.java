package org.example.e06oop.interfaceedu;

abstract public class Fish  {
    protected String name;
    protected String residence;

    Fish(String name, String residence){  //public 이거 왜뺀거징?
        this.name = name;
        this.residence = residence;
    }
    abstract String residence();

    public  String birth(){
        return  String.format("%s이/가 알을 낳습니다.",this.name);
    }
}