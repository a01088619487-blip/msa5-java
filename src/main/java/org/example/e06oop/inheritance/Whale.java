package org.example.e06oop.inheritance;
//고래  클래스
//public class Whale {
    // 필드 (Field) 변수
    //public  String name = "고래"; //인스턴스 변수  왜인가? Whale이라는 ㅁㅁㅁ하위하는 변수?
   // public  static int age = 20; // 클래스 변수
    // static 의 키워드는 인스턴스를 직접적으로 안만들어도 접근이 가능하다.
    //미리 나이 20을 올려놔서 사용이 가능함 MainOOP에 확인해볼것.
    // 근데 왜 static으로 다 안쓸까? 무거운 용량이라서 컴퓨터가 터진다..하드웨어 펑펑
    // 내가 쓸려고하는게 맞을까라는 의문점이 많아짐.
    //
    //
    //
    //
     //생성자 메소드
    // Whale (){} ->접근 제시자 디폴트 (11/19 현재 나랑같은 패키지가 아니라서 에러가나온거임 그래서 주석으로 지움!)

    //메소드 (Method) 함수
    //public void swimming(){
    //    System.out.println("고래가 헤엄칩니다." );

    //}   이거 죄다 지우기로햇엇음


    public class Whale extends Anmal{
        public Whale(String name, String residence){
            super(name,residence);
            System.out.println("고래 생성자");
        }

        public String swimming(){
            return  String.format("%s이/가 헤엄칩니다.",super.name);
        }
        public String eat(){
            return  String.format("%s의 먹이는 새우입니다.",super.name);
        }

    }

