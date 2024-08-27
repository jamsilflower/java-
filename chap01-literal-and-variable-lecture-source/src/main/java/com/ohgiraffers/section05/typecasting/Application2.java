package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args) {

        /* title. 강제 형변환 규칙에 대해 이해 할 수 있다.*/

        /* comment.
        * 강제형변환 (명시적 형변환)
        * 바꾸려는 자료형으로 캐스트 연산자 => ()를 이용하여 형변환된다
        * ex) (바꿀 자료형) 값;
         */

        /* comment.
        * 자동형 변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
        * 1. 강제 형변환의 규칙
        * 1-1. 큰 자료형에서 작은 자료형으로 변경시 강제 형변환 필요.
        * 1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다
        * 1-3. 문자형을 int 미만 크기의 변수에 저장 할 때 강제 형변환 필요.
        * 1-4. 논리형은 강제 형변환 규칙도 제외.
         */
        // () 반드시 이걸 넣어서 미리 알려줘야 한다(큰곳에서 작은곳)
        //실수 에서 정수는 반드시해라
        // 논리는 안된다




        /* index. 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환. */
        /* index. 1-1-1. 정수 끼리의 강제 형변환 */

        long lnum = 8;
        //int inum = lnum; // 데이터 손실 가능성을 컴파일러가 알려줌.( 알트 +엔터 =정보수정 추천)

        int inum = (int)lnum; //(int)를 넣어서 데이터가 날아갈지 라도 강제로 바꾸다.

        short snum = (short)inum;
        byte bnum = (byte)snum;


        /* index. 1-2. 실수를 정수로 변경 시  */
        //float fnum = 4.0; // 4byte
        //long lnum2 = ()fnum; // 작은 곳에서 큰 곳으로 옮겨도 실수는 정수로 강제 변경이 안된다

        // 소수점이 날아가기 때문에(실수를 정수로 변경하게되면 소수점이 날아간다)

        //long lnum2 = (long) fnum;


        /* index. 1-3. 문자형을 int 미만의 크기의 변수에 저장할때  강제형변환 */

        char ch2 = 'a'; //2
        //short snum2 = ch2;
        // 같은 2 바이트 인데 왜 강제로 해야할까? -> 문자는 음수가 없기 때문에
        // sign bit (부호결정 공간) 도 값을 저장 할 수 있는 공간으로 사용한다.

        /* index. 1-4. 논리는 application1에서 한 자동변형과 같이
        *강제 형변환규칙도 제외된다 */






    }



}
