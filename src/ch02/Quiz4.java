package ch02;

public class Quiz4 {
    public static void main(String[] args) {
        byte byteValue = 10;
        char charValue = 'A';

        int intValue1 = byteValue;
        int intValue2 = charValue;
        
        // 서로 가용범위가 달라서 자료손실이 일어날수있다
        // 특히 short 는 최상위 부호비트를 음수를 표현한는데 사용한다
        //short shortValue = charValue; // 자료 손실발생
        double doubleValue = byteValue;

    }
}
