package org.example.e06oop;

public class ConstructOOP {
    private  String name;
    private  int age;
    // 생성자(Constructor)메소드
    // 클래스를 인스턴스화 할 때, 최초 1회만 실행되는 메소드
    // 주로 객체의 초기화 또는 인스턴스 생성 시, 실행되어야 할 작업을 위해 사용

    // 기본 생성자 : 개발자가 생성자를 별도로 정의하지 않으면 자동으로 생성되는 생성자
    public  ConstructOOP(){
        this("무명",20); // this()메소드 사용할때 추가엿음.
    }//메소드 형태와 유사하지만 return 타입이 없다

    // 커스텀 생성자
    public  ConstructOOP(String name){ // Overloading과 비슷함.
        // this() 기본생성자 호출이 생략되어잇는 상태.
        // 내가 가지고잇는 필드에 접근하고싶을때
        // this 참조 변수 : 클래스 자기 자신을 가리킨다.
        this.name = name;
    }

    public ConstructOOP(String name, int age){
        //this.name = name; // 이미 위에 있어서 다르게 적을거임  이때 사용하는게
        //this()메소드를 사용할거다  기본생성자에 "this("무명",20);"추가할거임 원래는 먼저 작성해야햇던거 같음.
        this(name); //원래 위에 처럼 생략이 되어잇는데 내가 age를 접근하기 위해서 불러오면서
        // 순서를 this() 메소드를 위에 작성해야한다
        this.age = age;

    }

}
