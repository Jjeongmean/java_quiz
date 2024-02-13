package ch04;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        // 1-1: int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식

        /*
        int x = 17;
        if ( 10 < x && x < 20 ) {
           // System.out.println(x);
        }
         */

        //1-2 : char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
        /*
        char ch = "x";
        if (ch!= ' ' || ch!='\t') { // !(ch == ' ' || ch =='\t') 또는 ch!=' ' && ch !='\t'
           //System.out.println(ch);

        }
        */

        //1-3: char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
        /*
        char ch = "X";
        if (ch == "X" || ch == "x") {
            // System.out.println(ch);
        }
        */

        //1-4: char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
        /*
        //char ch = 8;
        if (0 <= ch && ch <=9) {
            System.out.println(ch);
        }
        */
         
        //1-5: char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
        /*
        //char ch = "A";
        if ((ch>= "A" && ch<="Z") || (ch>="a" && ch<="z")) {
             System.out.println(ch);
        }
         */

        //1-6: int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
       /*
        //int year = 8;
        if ((year % 400==0) || (year % 4==0 && year % 100!=0)) {
            System.out.println(year);
        }
        */

        //1-7:  boolean형 변수 powerOn가 false일 때 true인 조건식
        // if (!powerOn) or if(powerOn==false)

        //1-8: 문자열 참조변수 str이 “yes”일 때 true인 조건
        /*
        if(str.equals("yes") or "yes".equals(str)
         */



    }
}
