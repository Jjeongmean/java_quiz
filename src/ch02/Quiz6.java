package ch02;

public class Quiz6 {
    public static void main(String[] args) {
        byte byteValue = 10;
        float floatValue = 2.5F;
        double doubleValue = 2.5;

        //int타입으로 해야하는데 byte로 받고 있어 int로 변경해주어야함
        // byte + byte = int형으로 자동타입 변환
        //byte result1 = byteValue + byteValue;
        int result1 = byteValue + byteValue;

        // int + byte = int형으로 자동타입 변환
        int result2 = 5 + byteValue;

        // int + float = float형으로 자동타입 변환
        // 정수보다 실수의 허용범위가 더 크다 ➡ 허용범위가 더 큰쪽으로 타입변환이 일어난다
        float result3 = 5 + floatValue;

        // int + double = double형으로 자동타입 변환
        double result4 = 5 + doubleValue;


    }
}
