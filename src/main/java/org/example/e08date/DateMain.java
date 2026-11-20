package org.example.e08date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateMain {
    public static void main(String[] args) { // 이미 메소드가 발현되어잇다.

        LocalDateTime now = LocalDateTime.now(); //static메스소드라 가능하다
        //현재 시간 획득!
        System.out.println(now); // 2026-11-20 T 15:03:22

        LocalDateTime targetDate = LocalDateTime.of(2026,11,1,11,30,40);
        // 2026[Date]/11[Month]/01[dayOfMonth] /11[hour]/30[minute]/40[second]
        // moth.NOVEMBER 써도되는건 이미 상수가 만들어져잇다
        //특정 시간 지정 가능! 내가 맞춰서 작성하면 지정되어잇는 해당 메소드를 찾아서 자동으로 완성한다함


        //ISO 표준 시계열 문자열 ->날짜 객체
        // 그리고 of메소드 말고 또 다른 방법 이 있음
        LocalDateTime parsedDate1 = LocalDateTime.parse("2026-11-01T11:30:12");//ISO표기법  bd할때 양식이랑 비슷하다?
        //2026-11-01T -> T뒤부터 는 타임 이라는 뜻

        // ISO 표준 시계열 이외의 문자열 -> 날짜 객체 (포멧터를 이용 )
        // 그리고 이걸 내가 배운거에 커스텀 한 표기법
        String date = "2026-11-01 11:30:12"; //db에서 받아온 파일!
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // MM은 구분을 위해 대문자 소문자  HH대문자가 24시간, hh소문자가 12시간 표기법
        LocalDateTime parsedDate2 = LocalDateTime.parse(date,dateTimeFormatter);
        //별도로 인식시켜서 시키는 방법
        System.out.println(parsedDate1); // 2026-11-01 T 11:30:12
        System.out.println(parsedDate2); // 2026-11-01 T 11:30:12

        LocalDate now2 = LocalDate.now();
        System.out.println(now2);//2026-11-20
        // DateFormat dateFormat = DateFormat...? 위에랑 똑같이 어찌 만들징.. 없는뎅

        // ------------------------
        // 날짜 계산
        // 오늘로부터 하루뒤에 날짜
        //저장할 공간을 먼저 만들기
        LocalDateTime addOneDayFormNow = now.plusDays(1L); //그리고 -빼기 기능도 있음! now.minusDays(1L);
        // L을 붙인 이유가 long days이라 L을 붙여줌
        // 안붙여도 1로만 쳐도  인식은 해주지만 붙이는 게 가장 좋다
        //  불변 객체(immutable) 값이 변하지않는

        //now.plusDays(-1L) 해도 가능은함 now.plusDays(-1L)은 안쓰는게좋음
        System.out.println(now); // 2026-11-20 T 15:37:33.23401200
        System.out.println(addOneDayFormNow); // 2026-11-21 T 15:37:33.23401200 이렇게 하루가 더해진걸 확인가능
        //그럼 그 long타입이 최대가 얼마까지 가능할까?? 라는 궁금증이 생기넹


        // --------------------------------------
        // 상대적인 날짜 계산(TemporalAdjusters)
        // 지금달의 첫번째 일을 가져오고싶을대 메소드
        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);//26-11-01T15:58:14.504439800
        // 지금달의 마지막 일을 가져오고싶을대 메소드
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfMonth);//2026-11-30T16:01:14.621197700


        LocalDateTime firstDayOfMonth2 = now.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
         System.out.println(firstDayOfMonth2); //2026-11-26T16:07:22.934692700
        // 결과값이 현재기준인 now라  지금 기준의 다음주 목요일이 나오는거다~~
        //그래서 내가  다음번 목요일이 언제 일가? (1일의 기준으로) 할시!!
        //이걸 그냥 바로 불러보고싶을때 코드 만들기 귀찮잖아용? 바로 콘솔로그로 불러와보는 형식은! 밑에꺼다.
        System.out.println(firstDayOfMonth.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));
        //2026-11-05T16:07:06.263161600


        // --------------------
        // 두 날짜 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2025,9,10);

        System.out.println(d1.isBefore(d2)); // false
        //isBefore : 과거냐 과거가아니냐 물어보는 참거짓값
        System.out.println(d1.isAfter(d2)); // true
        // .isAfter :
        System.out.println(d1.isEqual(d2)); //false
        //. .isEqual :




        // Period 객체 : 두 날짜의 연/월/일을 단위로 분해해서 각각의 차를 구하는 객첵
        // 객체 진짜 비교 가능한것!
        // 두날짜데이터를 계산한 결과!
        Period p1 = Period.between(d1,d2);
        //비교 하고싶은 객체!
        // 우리가 직접적으로 찍을수가 없어서
        // 두날짜 차이를 저장한게 p1 임
        System.out.println(p1.getYears()); // -1
        // 콘솔로그엔 이걸 연도 기준으로 가져온다는소리
        // 그러고 위에만 하면 안되니(마이너스라 XX) Math.abs이용하여 양수로써 가져오기위해 바꿈
        System.out.println(Math.abs(p1.getYears())); // 1 Years
        System.out.println(Math.abs(p1.getMonths())); //2 Months
        System.out.println(Math.abs(p1.getDays())); // 10 Days
        //이걸 1년 2월 10일 차이난다는걸 콘솔로그로 표현하고싶으면 무엇을 사용하면 될까? 라는 궁금증이 생김.
        //1년 2개월 10일


        // 일수로 확인하는법! 우리가 제일 많이 쓰이는 방식
        //  ChronoUnit 객체
        long untilDays= d1.until(d2, ChronoUnit.DAYS); // long unit을 반환함
        System.out.println(untilDays); // -436Days
        //이걸 음수로 사용하기때문 양수로 바꿔줄거임
        System.out.println(Math.abs(untilDays)); // 463Days
        // 그럼 이건 대체로 언제 사용하는거지 자주 쓰인다고 하는뎅??-> 포인트 날짜 ,환불기준, 등등.....
        // 이때 사용하는게 Until 메소드라고 한다.
        // now 메소드에도 until메소드가 잇다


        // LocalDateTime -> LocalDate 추출
        LocalDate extractLocalDateFromNow = now.toLocalDate();
        System.out.println(extractLocalDateFromNow); // 2026-11-20
        //어흑 이름이너무길다..ㅠㅠㅠ 왜길게 적어야하는게 맞다고 하는거징..;ㅅ..
        //format는 문자열만 추출 가능하고
        // 지금꺼랑 format 차이도... 알아보기







        //※디프리케이드기능?? = 과거에 쓰는거엿는데 이제 현재 더좋은 기술이 생겨서  과거꺼를 안쓰는 것을 말한다..
        // 실제로 사용하면 동작은 함! 왜냐 쓰고잇던 시스템들이 잇기 때문에 조만간 버전업 하면서 없앨꺼에용 그러니 준비기간 드림용!
        //그럼 나중에 없어져서 못써짐 근데 안바꾸면 기능 먹통됨 ㄷㄷㄷㄷ
        // 디프리케이드 가 된것들은 명령어에 취소선이 끄여잇음!!









    }
}
