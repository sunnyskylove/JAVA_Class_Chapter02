package com.ohgiraffers.section02.assignment;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 대입연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다.*/
        /* 필기.
        *    대입연산자와 산술 복합 대입 연산자.
        *   '=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입 함
        *   '+=': 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
        *   '-=': 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
        *   '*=': 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
        *   '/=': 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
        *   '%=': 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함
        * */
        // 산술 복합 대입연산자는 산술표기를 좀 더 간단히 표현하기 위한 수단

        int num = 12;

        num = num + 3;   //최종 num의 값이다.
        System.out.println("num = " + num);  //num=15

        num += 3;       // num = num + 3; 과 같은 의미다. (얘도 누적되어서 연산됨..??), num =18
        System.out.println("num = " + num);

        num -= 5;       // num = num - 5;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num %= 2;
        System.out.println("num = " + num);

        /* 주의 사항*/
        /* 필기
        *   산술 복합 대입연산의 작성 순서에 주의해야 한다.
        *   산술 대입 연산자가 아닌 '-5'를 num 변수의 공간에 대입을 한 것이다.
        *   */
        num =- 5;
        System.out.println("num = " + num);
        // 여기에선 대입연산자가 되버림. 다시 초기화 된것이다. num= -5
        // 따라서 반드시 순서 표시 잘해야한다..!!

    }
}
