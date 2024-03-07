package ch12.Quiz07;

public class IntergerCompareExample {
    public static void main(String[] args) {
        // -127 ~ 128 사이의 숫자는 값으로 비교 그외엔 주소로 비교한다.
        Integer obj1 = 100; // 값 비교
        Integer obj2 = 100; //값 비교
        Integer obj3 = 300; //주소 비교
        Integer obj4 = 300; //주소 비교

        System.out.println(obj1.equals(obj2));
        System.out.println(obj3.equals(obj4) );
    }


}
