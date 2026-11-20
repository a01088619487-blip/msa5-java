package org.example.e07exception;

import java.io.FileWriter;
import java.io.IOException;

public class E07Exception {
    public static void main(String[] args) {
        try {
            System.out.println("트라이 시작");     // 실행 1
            throw  new RuntimeException("아아아아 ㅏ에러에옹"); //Exception();도가능   이걸 추가하닝 결과가
            //트라이 시작 -> 캐치 시작->아아아아 ㅏ에러에에옹->캐치 끝 ->파이널리 결과값이 도출됨


            // 오류형을 이제 내볼거임
            //double result = 10 / 0; // 예외 발생
            // 자바 같은경우에는 나누기 0하면 예외가 나올거임 그래서  끝남!
            // 이로인해 콘솔 반응은

           // System.out.println("트라이 끝");   // 예외가 없을 대만 실행
            // 위에 시작하고 이상이 없을경우에 트라이 끝으로 바로 끝남 밑으로 실행 XX


        }catch (ArithmeticException e ){ //예외 종료를 캐치하고싶다 할때???
            System.out.println("ArithmeticException 발생"); // IF문 처럼 동작한다

        }catch (Exception e){ //  칸에 “ArithmeticException을 부모 타입 Exception으로 받음
            // (다형성)” 이용해서 받아왔다?..
            System.out.println("캐치 시작"); //실행 2
            // 이제 디버깅으로 이용해서 사용하면 여기서 오류가 뜸!
            // e:"java.lang.ArithmeticException:/by "
            System.out.println(e.getMessage()); //  (Exception e)다양성을 이용해서 받아왔다?..
            System.out.println("캐치 끝"); // 실행 3
        }finally { // 필요시에 finally{} 사용하고 필요없으면 생략가능
            // 그리고 파이널리는 오류가 안 나와도 진행함
            System.out.println("파이널리"); // 실행 4
        }

        // Try with Resource
        //자바 렝기쥐 안에선 리소스란 개념은 외부에 있는 파일에 접근해서 가져오는 걸 리소스라고 한다
        // 이거 많이 쓰인다고함

        //여기 아래는 Try with Resource를 사용하면 좋은 예시인건가 =ㅅ=;
        FileWriter file = null;
        try {
            //파일을 쓰기 모드로 불러오는 처리
            file = new FileWriter("text.txt"); //"text.txt" 파일이 있으면 해당위치에 맞춰서 그파일을 열고
            //"text.txt" 파일이 없으면 파일을 생성해서 만들어둔다!
            file.write("Hi...JAVA!!");
        }catch (IOException e) {//  IOException 읜 00의 인풋 약자?
            e.printStackTrace();
        }finally {
            //file.close(); // 자바스크립트 할대 스코프가 여러개있었다고 하는데.. 흠흠
            //자바에서 글러블 스코프를 잘 쓰일일은없지만 프로파티에서 블로그에 넣어둔다?
            //클래스단위나 메소드 단위가 된다 중괄호 안에잇는 영역
            //현재 close()가 오류가 나는 이유 : Unhandled exception 예외를 잡아두지않앗다
            //그래서 이걸 try-catch문으로 감싸줘야함 너무 복잡한뒈?..
            try {
                if (file != null){
                    file.close();
                }

            } catch (IOException e){
                e.printStackTrace();
            }
        //  file = new FileWriter("text.txt"); 이파일을 에러가낫을땐 파일 진행이 안되어잇을거임 그럼 바로 캐취로가고
            //파일은 null로 잡혀잇는 상태이다
            // 그래서 hijava를 실행하게 할려면 try문에 if문을 추가 작성...한다?.. 예외 발생이 생길수 있기때문에 작성
            //이렇게 하면 에러가 안나타나고 안전하게 프로그램 실행할 수 있다?
        }

        // 이 위에껄 try문으로 바꾸면..?
        try(FileWriter file1 = new FileWriter("text.txt")){
            //이걸 로 하면  FileWriter file = null;을 밖에 썻던걸 안에 사용할수있음
            file1.write("안녕안냥!");
        }catch (IOException e){
            e.printStackTrace(); //Try with Resource를 사용하면
            // 오픈하기위한 리소를 받아주고 닫아주고 하는? 자동으로 처리해줌..

        }
    }
}
