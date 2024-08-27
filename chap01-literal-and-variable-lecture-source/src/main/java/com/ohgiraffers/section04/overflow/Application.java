package com.ohgiraffers.section04.overflow;

public class Application {


    public static void main(String[] args) {

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */

        /* 필기.
         * 자료형 별 최대 범위를 벗어나는 경우를
         * 오버플로우 라고 한다.
         */

        /* 목차. 1. 오버플로우 */
        byte num1 = 127;

        System.out.println("num1 = " + num1); // 127 : byte 의 최대 저장 범위

        num1++;    // num + 1; 1 증가

        System.out.println("num1 overflow 확인하기: " + num1); // 오버플로우 발생

        /* 목차. 2. 언더플로우 */
        byte num2 = -128; // byte 자료형의 최소값

        System.out.println("num2 = " + num2);

        num2--; // num2 - 1과 같은 의미, 1 감소

        System.out.println("num2 underflow 확인하기: " + num2); // 언더플로우 발생

        /* 오버플로우랑 언더플로우가 발생 했으나, 컴파일 에러나 런타임 에러가 발생하지 않았다.
         * 그렇기 때문에 최대 값 혹은 최소값의 범위를 고려해서 코드를 작성해야 한다는 의미이다.
         */

        int firstNum = 1000000; // 100만
        int secondNum = 700000; // 70만
        // 7천억
        // 양수 21억 정도까지 저장 가능.

        int multi = firstNum * secondNum; // 오버플로우 발생
        long longmulti = (long) firstNum * secondNum; // 오버플로우 방지

        System.out.println("multi = " + multi); // 오버플로우로 잘못된 값
        System.out.println("longmulti = " + longmulti); // 올바른 값


        long result = (long) firstNum * secondNum;
        // 강제 형 변환을 이용한 결과값 출력해보기. 다음 section 에서 나옵니다
        System.out.println("result = " + result);



    }






}
