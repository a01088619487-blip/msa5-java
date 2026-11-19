package org.example.e06oop.abstactclass;

public abstract class Mammal { //추상메소드 는 abstract 이거 추가하면된다.
    protected  String name;
    protected  String residence;

    public String breath(){
        return  String.format("%s이/가 숨을 쉽니다.",this.name);
    }

    /** 자바독 Java Doc
     *  매서드나 클래스가 어떤 역할 하는지 설명할때 사용
     *
     * @return
     */



    // abstract() 추상 메소드 : 상속 관계에서 자식 클래스에게 특정 기능을 반드시 구현 하도록 강제하는 메소드
    public abstract String living(); // 구현부가 없는 상태를 추상메소드 선언문만 있는 상태!
    //related problem이 에러가 생김 (상속한 Monkey에 에러가 생김! 반드시 선언해야한다는 에러가 나옴)
    //반드시 상속할때 구현해야하는  깜박해서 기능을 안넣을때 ! 그 실수를 코드레벨 단계에서 알수 있도록 구현해야되
    //지정래야한다고 말해줌?? 그리고 거기에 implement 가 나옴 거기서 클릭 하면 @Override 를 만들어주면서 작업할수있게 도와줌.\
    //당분간은 쓰진않을거 같음?~ 이렇게 동작하는 군?~ 이라는 느낌으로???
    //그리고 다른곳엔 놓치면 끝이다 여기 이프로그램이  친절한거 =ㅅ=;; ?







}
