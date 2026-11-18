package org.example.e06oop;
// 접근제어 지시자
public class AccessModifier {
    // default : 같은 패키지에 소속 된 클래스에서만 접근 가능
        //public class AccessModifier {에  public만 지우면 됨
        //같은 패키지 네에서만 가능하다
    String strDefault ="Defult";

    // public: 클래스 내/외부 어디에서나 접근 가능
    public  String strPuvlic = "Puvlic";

    // private : 클래스 내부에서만 접근 가능 오로지 본인만 가능
    private String strPrivate = "Private";

    // protected : 같은 패키지 / 클래스 내부 / 자식클래스에서 접근 가능  - 현재로썬 많이 안쓰임.
    protected String strProtected = "Protected";
    //이건 좀 다르게 해야 가능한듯

    void fnDefault() {
        System.out.println("Default Fn");
    }
    public void fnPublic(){
        System.out.println("Public Fn");
    }

    private void fnPrivate(){
        System.out.println("Private Fn");
    }

    protected void fnProtected(){
        System.out.println("Protected Fn");
    }


}
