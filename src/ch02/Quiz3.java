package ch02;

public class Quiz3 {
    public static void main(String[] args) {
        char ch = 'B';
        System.out.println("ch: " + (int)ch); // 66-
        
        //char형 + char형 = int형으로 자동 타입변환이 일어난다
        System.out.println('A' + 'B'); // char 타입 연산

        System.out.println("1" +"2"); // 문자열(String) 연산

        System.out.println("char형 1의 유니코드: " + (int)'1');
        System.out.println("char형 2의 유니코드: " + (int)'2');

        // char형 + int형 = int형으로 자동 타입변환이 일어난다
        System.out.println('1' + 2);

        // char형 + int형 = int형으로 자동 타입변환이 일어난다
        System.out.println('1' + '2');

        // String형 + 다른타입 = 항상 문자열(로 인식)
        System.out.println('J' + "ava"); //
    }
}
