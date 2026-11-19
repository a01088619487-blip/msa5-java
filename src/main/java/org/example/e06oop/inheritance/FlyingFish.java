package org.example.e06oop.inheritance;

public class FlyingFish extends Anmal {//extends Anmal 부모 클래스 추가!
    public FlyingFish(String name, String residence) {
      super(name,residence); //부모껄 이용할려고 할때 super()을 이용하면된다.
        System.out.println("날치 생성자");
    }

    public String flying(){
        return  String.format("%s 이/가 날아갑니다.",super.name);
    } // this.name 는 현재 부모가 가지고있어사 사용이 불가능하다
    // syper.name을 써도..Anmal-> private String name;에  private라서 사용이 불가능하다 그럴땨
    // private 에서 protected로 교체하면 됨 protected String name 과 protected String residence; 교체함.
   //중복되는건 지움 living breath


    //오버라이딩(OVerriding) : 부모에게 상속받은 메소드를 자식이 재정의 하여 사용
    // 흥흥 나 상속 받은거  싫어! 할때
    @Override // @Override 어노 테이션 이라고 불림
    // @Override 이거 없어도 동작은 가능하지만 넣는 이유는 우리가 읽기때문에 적는게 가장 좋다
    // 구버전에선 어노테이션을 안썻으면 오류가 낫음 지금은 많은 업데이트가 되어버림.
    public  String living(){
        return  "수정했다.";
    }

}
