package org.example.e01datatype;

public class E01DataType {
//     1   int b = 2 ;
    public void execute(){
//         둘다 함수 매소드는 객체안에 정의된 함수  자바는 기본 메소드 형태이다.
//      1  int a = 1 ;
        boolean bool = true;
        bool = false;
        //bool =1; // 선언할때의 데이터 타입과 다를 경우 , 타입 에러가 발생한다.
        System.out.println(bool);
        System.out.println(bool);
        System.out.printf("현재 변수 bool의 값은 %s",bool); //문자열을 합치고 싶을때 사용 하는 기능인데 자주 쓰이진않는다
        // 현재는 한글이 깨져서 나옴.

        // 변수 선언
      //  int age = 1 ;  // 변수값  변환
        int age ;  // 변수 선언
        age = 1 ;
        char ch = 'a'; // char는 '' 로 쓰임! 딱 한글자[문자]
        // "" 문자 String 타입이 된다.
        String str = "a";

        // 상수
        final String USER_NAME ="길동이";//단어 다 대문자로 쓰임 그다음 _ 언더바
        //USER_NAME = "ssse"  // 이렇게 넣으면 'Cannot assign a value to final variable 'USER_NAME'' 가 나옴
        // 이미 내가 길동이라는 값을 넣어서  할달 할수 없다고!


        // Underscore 표기법
        int num = 1_020_304_010;  // 컴퓨터는 숫자로 읽히지만 사용자가 자리수 표현하기 편해서 사용가능. 3자리
        // 일반적인 표기법이다.

        // 두 변수의 값을 스와핑 해보자
        int swap1 = 1;
        int swap2 = 2;
        // swap1 를 2로 swap2 를 1로  값을 바꾸는 형식
        int swap ;   // 새로운 값을 만들어서  swap1 값을 저장하는 공간을 둠.
        swap = swap1 ;
                //int swap = swap1 로도 가능하다
        swap1 = swap2;
        swap2 = swap;

        // 데이터 타입
        boolean bool2 = true;

        byte bt = -128;  //Provided: int
        short sh = 32767; //
        int integer = 2147483647;
        long longer = 2147483648L;
        //  int 타입까지는 괜찮지만 인트보다 2147483648 큰숫자를 넣으면 에러가 난다 그래서 적을때 가장뒤에 'L'을 붙여줄것
        // 소문자 l을 사용하면 기본 인트로도 인식할수잇음 때문이라는디 ?
        //상수
        double db = 3.141592;
        float ft = 3.141592F; // float 타입은 반드시 가장 뒤에 'F' 붙여줄것 안하면 W?로 인식?
        char ch1 = 'g';

     }
}
//contst fn = () => 1;
//const test = [1,2,3,4,54];
//test ,map();