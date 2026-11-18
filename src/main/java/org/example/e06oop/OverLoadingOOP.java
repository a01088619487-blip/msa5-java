package org.example.e06oop;

public class OverLoadingOOP {
    public static int add (int a) {  //(int a):  시그니처
        return a+1 ;
    }
    public  static int add (int a, int b){
        return  a+ b;
    // 똑같은 이름의 add인데 갯수가 달라서 오류가 안뜬다? 파라미터가(시그니처) 다른것들을 오버로딩이라고한다.
    }
}
