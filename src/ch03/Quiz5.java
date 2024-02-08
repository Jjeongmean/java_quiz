package ch03;

public class Quiz5 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area1 = ((double)(lengthTop+lengthBottom) * height / 2  );
        System.out.println(area1);
        double area2 = (lengthTop+lengthBottom) * height / 2.0;
        System.out.println(area2);
        //정확한 실수의 값을 얻고싶다면 정수로 먼저 계산 후 실수로 변경



    }
}
