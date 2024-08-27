package com.ohgiraffers.변수연습용;

public class training3 {

    public static void main(String[] args) {


        // 문제 : 한 학생이 온라인 쇼핑몰에서 두 개의 아이템을 구매하려고 합니다. 첫 번째 아이템의 가격은 15.75달러이고, 두 번째 아이템의 가격은 23.40달러입니다. 학생은 이 두 아이템의 합계 가격과, 10%의 할인을 받았을 때의 최종 가격을 계산하고 싶어합니다.이를 계산하기 위해 변수와 실수를 사용하세요.

        // 변수에서의 실수 선언
        double sum = 15.75;
        double dum = 23.40;
        double dic = 0.10;

        // 합계 계산
        double totalPrice = sum + dum;

        //할인 금액 계산
        double discountAmount = totalPrice - dic;

        // 할인 후 최종 가격
        double finalPrice = totalPrice - sum;


        // 결과 출력
        System.out.println("두 아이템의 합계 가격: " + totalPrice);
        System.out.println("10% 할인 후 최종 가격: " + finalPrice);



    }

}
