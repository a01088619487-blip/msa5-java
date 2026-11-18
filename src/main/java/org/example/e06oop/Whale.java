package org.example.e06oop;
//고래  클래스
public class Whale {
    // 필드 (Field) 변수
    public  String name = "고래"; //인스턴스 변수  왜인가? Whale이라는 ㅁㅁㅁ하위하는 변수?
   // public  static int age = 20; // 클래스 변수
    // static 의 키워드는 인스턴스를 직접적으로 안만들어도 접근이 가능하다.
    //미리 나이 20을 올려놔서 사용이 가능함 MainOOP에 확인해볼것.
    // 근데 왜 static으로 다 안쓸까? 무거운 용량이라서 컴퓨터가 터진다..하드웨어 펑펑
    // 내가 쓸려고하는게 맞을까라는 의문점이 많아짐.




    //생성자 메소드
    Whale (){}

    //메소드 (Method) 함수
    public void swimming(){
        System.out.println("고래가 헤엄칩니다." );

    }

}
