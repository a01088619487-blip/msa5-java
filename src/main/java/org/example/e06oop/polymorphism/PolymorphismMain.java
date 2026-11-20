package org.example.e06oop.polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        Whale whale1 = new Whale();
        Mammal whale2 = new Whale();
        // 이렇게 Whale을  중복해서 불러도 오류가 안난다??
        //상속관계 있을때의 whale과 monkey가 mammal에게 상속 관계일때 부모형태의 걸로 사용할 수 있다
        // 이것이 다형성!


        Monkey monkey1 = new Monkey();
        Mammal monkey2 = new Monkey();

        Saba saba1 = new Saba();
        //Mammal saba2 = new Saba(); //다형성이라두 !! Saba는 Mammal에게 상속받는 상태가아님
        // 부모님 과 상속관계가 아니기 때문에 사용할수 없다

        //      -------------------------------------

        //원숭이Monkey랑 고래Whale를 상속받고있는 포유를 부를때
        Mammal[] arr = new Mammal[5];
        arr[0] = new Whale();
        arr[1] = new Monkey();
        //  이것을 한 이유가 Mammal라는곳으로 통해서! Whale과 Monkey의 데이터 타입하나로 묶어서 담을수있다.
        // 그리고 클래스를추가 될땐 loop문을 통해 사용한다 보통은 어레이리스트라는걸  사용한다고함

        //      -------------------------------------
        // UpCasting
        // 업 캐스팅: 자식 클래스가 부모클래스 타입을 캐스팅 되는것->자식 객체를 부모 타입으로 보는 것
        //  - 부모 클래스로 캐스팅 되면 자식클래스에 있는 멤버에는 접근이 불가
        Mammal upCasting1 = new Whale();
        // whale1.birth().swimming()이 나올수잇는걸 확인할수 있는데
        // upCasting1.birth(); 만 나오는걸 확인할수 잇음 swimming에 접근 조차 할수없다

        // Down Casting
        // 다운캐스팅 : 업캐스팅 한 인스턴스를 다시 본인의 데이터 타입으로 캐스팅하는것
        Whale downCasting1 = (Whale) upCasting1;
        //  (Whale) upCasting1의 (Whale) 은 데이터 타입을 문법하겟다는 말임 클래스가 아님
        downCasting1.swimming();
        // 다운캐스팅을 하게되면 원래 타입(Whale)으로 돌아오면 Whale의 멤버도 쓸 수 있다

        //Mammal mammal1 = new Mammal();
        //Whale whale3 =(Whale) mammal1; // 컴파일은 되지만, 실행(런타임)하면 오류가 난다
        // 원래 객체가 하위 클래스가 아니면 불가능하다

    }


}
