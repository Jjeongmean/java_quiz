package ch02;

public class Quiz11 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte)i;
        ch = (char)b; // 음수부호를 가지는 byte는 음수를 사용하지 않은 char형으로 자동타입 변환을 할수없다
        short s = (short)ch; // 음수부호문제, char형이 short 보다 가용범위가 크므로 자동타입 변환X
        //i = (int)ch;
        i= ch; // char형은 int보다 허용범위가 작으므로 자동타입변환 발생


    }
}
