package org.example.e06oop;

import org.example.e06oop.inheritance.FlyingFish;
import org.example.e06oop.inheritance.Whale;

//해당 클래스가 위치하고잇는 주소
public class MainOOP {
    public static void main(String[] args) {
        //int [] inArr = new int [3]; //사용 준비가된 인스턴스 3
        //만드는 과정을  인스턴스화
        // whale클래스를 인스턴스 화 해야함
        // Strubg whale = new Whale(); 이건 불가능 타입이 다르기때문에 String으로 넣어야하는데 Whale 되엇기때문에
       // Whale whale = new Whale(); // Whale 서버를 옮겨서 오류가 낫엇음 디폴트값이라 사용불가(디폴트는 같은서버에가능)
        // whale 데이터타입(클레스명)  whale변수명 =대입명상자 new Whale(); 인스턴스 생성문법;
        // 변수명은 객체가 담아져잇는고 new Whale중 Whale 누르면 작동하지만 new는 작동안함 -> 이유 new가 키워드라서
        //메모리 주소가 레퍼런스타입(객체 테이터타입)이된다?
        //접근하는 법
        //객체가 아주 큰 용량의 데이터이다.

        // FlyingFish 출력하고싶을때 인스턴스 화
        //FlyingFish flyingFish = new FlyingFish();
        // System.out.println(whale.name);
        // whale.swimming();
        // whale.name = "돌고래"; //접근해서 네임 변경 가능함
        // System.out.println(whale.name); //변경된걸 확인할수잇다.
        //System.out.println(Whale.age); // 위에 인스턴스하 안하면 빨간줄로 바뀌지만
        // static으로 만든 age는 접근이 바로 가능하게 바꿈 클래스 메소드 이다.
        // 여기까지가 클래스 불러오는 방법

        AccessModifier accessModifier = new AccessModifier();
        accessModifier.fnProtected();


        // 오버로딩 (Overloading)
        //메소드의 시그니처가 다르거나, 동일한 이름을 가지는 메소드를 중복하여 정의 [같은 클래스 안에서 이름 같고 파라미터 다름]
        System.out.println();
        System.out.println(OverLoadingOOP.add(1)); //a ->2
        System.out.println(OverLoadingOOP.add(1,2)); //a,b->3


        //생성자 메소드 (ConstructOOP)
        ConstructOOP constructOOP = new ConstructOOP();


        // -----------------------
        // 상속
        FlyingFish flyingFish = new FlyingFish("날치","바다");
        // 동물 생성자 -> 날치 생성자가 출력되는걸 확인할수 있음
        System.out.println(flyingFish.breath()); //날치 이/가 숨을 쉽니다.
        System.out.println(flyingFish.flying()); //날치 이/가 날아갑니다.
        System.out.println(flyingFish.living()); //날치 이/가 바다에서 삽니다.
        // living 에서
        // @Override
        // public  String living(){
        //     return  "수정했다.";} 으로 하여 수정햇다로 결과 출력 변경된걸 확인 가능

        // Whale 상속
        Whale whale = new Whale("고래","바다");
        // Whale 결과 값
        System.out.println(whale.breath()); //고래 이/가 숨을 쉽니다.
        System.out.println(whale.swimming()); //고래 이/가 헤엄칩니다.
        System.out.println(whale.living()); //고래 이/가 바다에서 삽니다.
        System.out.println(whale.eat());//고래 의 먹이는 새우입니다.

    }

}
