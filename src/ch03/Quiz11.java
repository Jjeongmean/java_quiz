package ch03;

public class Quiz11 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b); // ↔ int c = a + b; byte끼리 연산시에 int형이 되므로 강제타입변환

        char ch = 'A';
        ch = (char) (ch + 2);

        float f = (float) 3 / 2; // 정수 연산의 결과는 정수
        long l = 3000 * 3000 * 3000L;
        float f2 = 0.1f;

        double d = 0.1;
        boolean result = (float) d==f2; //강제타입변환 비교연산시 반드시 실수의 타입을 맞춰야한다

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);

        /*
         byte c = a + b; => byte c = (byte)(a+b); // byte  강제타입변환
         ch = ch + 2; => ch = (char)(ch+2);
         float f = 3/2; => float f = 3/2f; // 컴파일러는 실수 리터럴을 double타입 인식. F or f를 붙여야함
         long l = 3000 * 3000 * 3000; => long l = 3000 * 3000 * 3000L;
         //int * int * int
         // 정수 값을 int타입으로 인식. L or l을 붙여야함


         */
    }
}
