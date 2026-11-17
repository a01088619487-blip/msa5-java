package org.example.e03if;

public class E03If {
    public static void main(String[] args) {


        // IF로 만들어주세요.
        // 성적
        // 범위 :
        //		100   : A+
        //		90이상 100미만 : A    90~99
        //		80이상 90미만 : B   80~89
        //		70이상 80미만 : C   70~79
        //		60이상 70미만 : D   60~69
        //		60미만: F
        //출력 문구 : "당신의 점수는 XXX점 입니다. <등급>"
        int num13 = 70;
        if (num13 == 100 ){
            System.out.printf("당신의 점수는 %d 점 입니다 <A+등급>",num13);
        } else if (num13 >=90) {
            //num13 >=90 && num13 <99에 이미 위에 100이 있으므로 num13 <99 적을필요가없다
            System.out.printf("당신의 점수는 %d 점 입니다 A등급",num13);
        }   else if(num13 >=80) {
            System.out.printf("당신의 점수는 %d 점 입니다 B등급",num13);

        }else if(num13 >=70) {
            //     System.out.printf("당신의 점수는 %d 점 입니다 C등급",num13);
            //이런 식으로 해도 되지만 등급 짜기가 귀찮음.  그래서 String 빈문자열을 선언 해주는것이 가장 좋다.
            // if(조건문){조건의 참이면 실행할 처리}

        }
        // 선생님이 해주시는거
        int score = 50;
        String grade ="";  //String grade; 로 선언해도 되지만 조건이없을경우에 에러가 나올수잇다
        // 그래서 빈문자열을 넣는게 좋다.

        if (score == 100){
            grade = "A+";
        } else if (score >= 90) {
            grade = "A";
        }else if (score >= 80) {
            grade = "B";
        }else if (score >= 70) {
            grade = "C";
        }else if (score >= 60) {
            grade = "D";
        }else  {
            grade = "F";
        }

        //   System.out.printf("당신의 점수는 %d점 입니다. <%s>",score,grade);

        // 0~100의 숫자가 아닐경우 오동작한다.
        //해당 현상을 아래처럼 수정하시오
        // 0~100의 숫자가 아닐경우,"유요한 점수가 아닙니다." 출력
        // 그 외 패턴은 기존과 동일
        int num12 = 110;
        String grade2 = "";

        if (num12 >= 0 && num12 <= 100) {

            if (num12 == 100) {
                grade2 = "A+";
            } else if (num12 >= 90) {
                grade2 = "A";
            } else if (num12 >= 80) {
                grade2 = "B";
            } else if (num12 >= 70) {
                grade2 = "C";
            } else if (num12 >= 60) {
                grade2 = "D";
            } else {
                grade2 = "F";
            }

            System.out.printf("당신의 점수는 %d입니다.<%s등급>", num12, grade2);

        } else {
            System.out.println("유효한 점수가 아닙니다.");
        }

        // 선생님이 해주시는거 2트
        int score1 = 101;
        String grade3 ="";

        if(score1 < 0 || score1 > 100) {
            System.out.println("유효한 점수가 아닙니다.");
        } else {
            if(score1 == 100) {
                grade3 = "A+";
            } else if(score1 >= 90) {
                grade3 = "A";
            } else if(score1 >= 80) {
                grade3 = "B";
            } else if(score1 >= 70) {
                grade3 = "C";
            } else if(score1 >= 60) {
                grade3 = "D";
            } else {
                grade3 = "F";
            }

            System.out.printf("당신의 점수는 %d점 입니다. <%s>", score1, grade3);
        }
        // Switch 문
        int num = 1 ;
        switch (num) {
            case 1:
                System.out.println("1등");
                break;  // breack 를 안넣은 상태이면 실행한걸 안멈추고 다음 콘솔로그 진행함
            case 2 :
                System.out.println("2등");
                break;
            case 3 :
                System.out.println("3등");
                break;
            default:
                System.out.println("등수 외");
                break; // 마지막은 필요없긴한데 붙이는 습관 또한 괜찮다.
        }




        // switch를 이용하여 작성
        // 1등이면 금상, 2등이면 은상, 3등이면 동상, 4등이면 장려상, 그 외는 노력상
        // 을 출력해 주세요.
        String rank = "";
        switch (rank){
            case "1등" :
                System.out.println("금상");
                break;
            case "2등" :
                System.out.println("은상");
                break;
            case "3등" :
                System.out.println("동상");
                break;
            case "4등" :
                System.out.println("장려상");
                break;
            default:
                System.out.println("노력상");




        }
    }
}
