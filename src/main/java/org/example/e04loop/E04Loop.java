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
        String gugu = "";
        for (int num= 2 ; num < 10; num++){
                if (num == 2){
                     gugu = "구구단 2단" ;
                    int i =  1++ ;
                }
            System.out.println(gugu,"%d *",num);
        }

    }
}



