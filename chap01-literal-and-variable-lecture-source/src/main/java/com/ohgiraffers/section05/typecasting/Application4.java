package com.ohgiraffers.section05.typecasting;

public class Application4 {

    public static void main(String[] args) {
        
        //강제 형변환을 어느 상황에 쓰는 지 예시 수업
        
        /* title. 형변환시 주의점을 이해하고 사용할수있다. */
        
        
        /* comment. 
        * 형변환 시 주의점.
        * 데이터 손실!!!!!!!!!
        * index. 1. 의도하지 않은 데이터 손실 */
        int inum = 290;  // 1byte =-126 ~ 127
        byte bnum = (byte) inum;

        System.out.println("bnum = " + bnum);
        
        
        
        /* index.2. 의도한 데이터 손실 */
        
        double height = 175.5; //실수
        int floorhight = (int) height; // (int)를 넣어서 실수를 정수로 강제 변환해서 0.5를 날려버림
        // double = 실수


        System.out.println("floorhight = " + floorhight);
        
        
    }
    
    
}
