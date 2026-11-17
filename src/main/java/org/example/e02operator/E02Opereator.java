package org.example.e02operator;

public class E02Opereator {
    public static void main(String[] args) {   //main 치면 나옴
        // 대입 연산자
        int num1 = 2;
        int num2 = 5;



        // 산술 연산자
        System.out.println(num1 + num2);  // 더하기 7
        System.out.println(num1 - num2);  // 빼기 -3
        System.out.println(num1 / num2);  // 나누기 0    고급상수가 0.4이지만...   0...2가 나온다
        System.out.println(num1 * num2);  // 곱하기 10
        System.out.println(num1 % num2);  // 나머지값 2
        //sout 치면 자동으로 완성 System.out.println

        // 산술 대입 연산자
        int num3 = 1; // 1
        num3 = num3 + 3 ; // 1+3 =4
        num3 += 3;  // 4+3 =7
        num3 -= 3;  // 7-3 =4
        num3 /= 3;  // 4/3 =1
        num3 *= 3;  // 1*3 =3
        num3 %= 3;  // 3%3 = 0

        // 증감 연산자
        int num5 = 0;
        System.out.println(num5++); // 0
        System.out.println(++num5); // 2

        //  비교 연산자
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        // 문자열의 비교
        String str1 = "str1";
        String str2 = "str1";
        String str3 = new String("str1");
        System.out.println(str1.equals(str2));// true
        // equals 가 무조건 있어야지 가능함.
        // str1 == str2 로 해도  true가 나오긴 하지만 추천은 안함
        System.out.println(str1 == str3); // false  절대 비교 연산자 사용 하지 말자!!
        // 기본적으로 저장하는 값이 주소값임.
        //별개의 주소값을 만들엇기때문에 str1 레퍼런스 값과 str3 레퍼런스값을비교하는데 1도 주소값 3도 주소값을 가지고잇어서
        // 강제적으로 새로운 객체를 생성햇기때문에 주소값이 다르기때문에 false 값이 나온다.
        System.out.println(str3);

        String str4 = str3;
        String str5 = str3;

        // 논리 연산자
        int num10 = 0;
        int num11 = 2;
        System.out.println(num10 > 0 && num11 <= 11); // and 연산자
        System.out.println(num10 > 0 || num11 <= 11); // or 연산자
        // System.out.println(num10 > 0 ! num11 <= 11); // 이건 틀린 방법인가?
        System.out.println(!(num10>0)); //true  not연산자

        //삼향연산자
        //true or false 만 나오는 경우에만 좋다 그러면 if연산자 쓰는게 좋은거 아닌강?'ㅅ'
        String result = num1 > num2 ? "num1 크다" : "num1 작다"; // num1작다 false
        System.out.println(result);





    }
}
