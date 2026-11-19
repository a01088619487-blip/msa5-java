package org.example.e06oop.interfaceedu;

abstract class Mammal {
    protected  String name;
    protected  String residence;
    // 여기 코드를  우클릭 후 제넌런트 클릭후 컨스트런트?누르면 필드 가 자동으로 만들수 있다!

    Mammal(String name, String residence){
        this.name = name;
        this.residence = residence;
    }

    public abstract String residence();
        public String birth(){
        return String.format("%s이/가 출산을합니다.",this.name);
    }



}
