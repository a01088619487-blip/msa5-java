package org.example.e04loop;

public class E04Loop {
    public static void main(String[] args) {
        // for(초기값; 조건; 증감 연산)
        for (int i = 0 ; i < 5; i++){
            System.out.println(i);  // 5되면 멈춤. 초기값은 0  그래서 첫출력값은 0->1->2->3->4 에서 멈춤

        }

        // 다시 1부터 5까지 찍을수 잇게! 하는방법?
        for (int i = 0 ; i < 5; i++){
            System.out.println(i+1);
        }
        for (int i = 1 ; i < 6; i++){
            System.out.println(i+1);
        }

        for (int i = 0; i < 2; i++){
            System.out.println(i);
            for (int z = 0; z < 5; z++){
                System.out.print(z);
                System.out.printf("i값: %d, z값: %d%n",i,z);
            }// 0,01234 -> 1,01234
            System.out.println();
        }

        // 구구단 2~9단을 출력
        // 예시)
        // ** 2단 **     // ** 3단 **
        // 2 X 1 = 2    // 3 X 1 = 3
        // 2 X 2 = 4    // 3 X 2 = 6
        // ...          // ...
        // 9 X 8 = 72
        // 9 X 9 = 81

        for (int i = 2; i <= 9; i++) {
            System.out.printf("%d단%n", i);
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

        // 내가 만들고 싶은거  if문
        int i = 2; // 2단
        int j = 1; // 곱셈

        while (i <= 9){
            if (j == 1){
                System.out.println(i + "단");
            }
            System.out.println(i + " x " + j + " = " + (i * j));
            j++;
            if ( j >9 ){
                j = 1;
                i++;
                System.out.println();
            }
        }
        //경은님 버전
//        for(int i = 2; i < 10; i++){
//            System.out.println(" " + i + "단 ");
//            for(int j = 1; j < 10; j++){
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//            System.out.println("================================");
//        }

    }
}
