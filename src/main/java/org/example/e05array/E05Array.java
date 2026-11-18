package org.example.e05array;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        int [] arr =new int [3]; // 길이 3의 인트 배열을 생성 및 초기화
        // 초기화 - 내가 지정한 변수에 어떠한 값이 들어가 있는 상태?
        arr[0] =  1;
        arr[1] = 2;
        arr[2] = 3;
        //경고 최대한 무시하지 않기
        //프로젝트에선 배열을 쓸 일이 많이 없다 [고정된값을 배열에선 사용 할순잇음?]
        // arr[2] = '';은 경고문이 안뜨지만 arr[2]=""; 이는 경고문이 뜬다
        // -> 그럼 안뜨면 사용이 가능한건인가??'ㅅ'
        //바이럴의 코드 알아보기
        // 각각 언어이 프로그래밍 마다 특화된 언어가 잇다 C샾하고 java하고 가장 비슷하다
        // C#에 대해 함 알아보기  주로는 파이썬이  외국에서 많이 쓰임 AI때문에?


        int[] arr2 = {1,2,3}; //길이3의 잉크배열의 각각의 넣어주는 방식 자바클래스는 [] 엿지만 자바는 {}
//        System.out.println(arr); 이건 자바가 권리하는 arr의 주소다.
//        최상위 객체에 받는다? 시스템 아웃 프린트의 메소들의 객체의 안에있는 메소들이 자동으로 실행이된다
        // 부모님꺼 ㄹ내가 쓸수잇다
        // System.out.println(arr.toString());
//        System.out.println(Arrays); // 이걸사용해야 벌수릿다?
//        System.out.println(Arrays.toString(arr));
        // 디버깅 모드를 잘사용하면 볼수잇다


        //배열의 복사
        int[] ariginArr = {1, 5 , 9};
        int [] copyArr = ariginArr;
        copyArr[0] = 999;  // 얕은 복사
        //오리진을 유지하면서 카피



        // System.arraycopy() 이용해서 메소드 깊은 복사
        int [] originArrSystem = {1,2,3};
        int [] copyArrSystem = new int [originArrSystem.length *2];  //길이의 잘부를때는
        //length 라는 길이 정함 이렇게되면 length[3]*2 이므로 6길이가 된다.

        //loop문을 사용한 깊은 복사가 있음.
        System.arraycopy(
                originArrSystem
                 ,
                0, //srcPos
                copyArrSystem,
                0, // dest pos
                originArrSystem.length
        );
        copyArrSystem[0] = 999;
        //내가 원하는만큼 방을 늘리거나 줄이거나 할수있다.
        // 다차원 배열을 사용했을대 깊은 복사가 가능한가용 ??'ㅅ' ;;
        //연본 포지션?

        // Arrays.copyof() 이용해서 깊은 복사
        int[] originArrArrays = {1,2,3}; //originArrArrays[1,2,3]
        int[] copyArrArrays = new int[originArrArrays.length*2]; //copyArrArrays[999,2,3]
        //Arrays.copyOf(originArrArrays, originArrArrays.length); 에 앞에 copyArrArrays 추가
        copyArrArrays=Arrays.copyOf(originArrArrays, originArrArrays.length);//originArrArrays[1,2,3]
        copyArrArrays[0] = 999; //  copyArrArrays[999,2,3]

        //오리진을 보호하기 위한 복사! 원본과 똑같은 형태로만 복사한다

        // 직접 구현해보자
        int[] originFor = {1,2,3};
        int[] copyFor = new int[originFor.length * 2];
        for(int i = 0; i < originFor.length; i++){
            copyFor[i] = originFor[i]; //이  메소드를 구현한게
            // copyArrArrays=Arrays.copyOf(originArrArrays, originArrArrays.length)
        }
        int idx = 0;
        for(int val : originFor) {
            copyFor[idx] = val;
            idx++;

            //다차원 배열
           //이것도 깊은 카피가 가능하다
           int [][] multiArr = {
                   {1,2,3},
                   {4,5,6},
                   {7,8,9}
           };
            System.out.println(multiArr[1][1]); // 5


            // -------------------------------
            // 배열의 API
            int[] arr3 = {1,2,3};
            int[] arr4 = {1,2,3};
            //배열의 길이
            System.out.println(arr3.length);  //길이  3

            //Arrays.equals(배열1,배열2)배열이 같은지 비교
            System.out.println(Arrays.equals(arr3,arr4)); //true

            // 다차원 배열은 equals로 못함
            // Arrrays.deepEquals(배열1,배열2) : 다차원 배열의 비교
            int [] [] deepArr1 = {{1,2,3},{4,5,6}};
            int [] [] deepArr2 = {{1,2,3},{4,5,7}};
            System.out.println(Arrays.deepEquals(deepArr1,deepArr2)); // fasle
           // System.out.println(Arrays.equals(deepArr1,deepArr2));false 라고 뜨는데 오류가 뜸 잘못나올수 있다고 알려줌
            //다차원 배열은 굳이 안씀 그냥 1차원으로 바꾼 후에 사용함!
            //인식의 의해 오류가 나타날 수 있는 잠재적 코드라 잘안쓴느거임!

            //Arrays.sort(arr): 배열의 정렬을 해주는 메소드 오름차순으로 정렬
            int[] sortArr = {43,6,7,8,4,34,2};
            // 원본을 수정하는 메소드라
            Arrays.sort(sortArr);
            System.out.println(Arrays.toString(sortArr));// [2,4,6,7,8,34,43]
            //이건 왠만해서 안씀 성능이슈가 일어나고 원본을 수정하는 메소드라
            //오도 바이저에서 정렬해서 가져오는게 일반적인 처리


            

        }
    }

}
