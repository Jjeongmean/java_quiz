package ch07.Quiz08;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.run();
        tire.run();
    }
}

/*
답:
 스노우 타이어가 굴러갑니다.
 스노우 타이어가 굴러갑니다.

풀이:
부모 타입으로 자동타입변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능하다.
비록 변수는 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로 한정된다.
그러나, 자식 클래스에서 오버라이딩된 메소드가 있다면 부모 메소드 대신 오버라이딩된 메소드가 호출된다.
이는 [다형성] 과 관련있다.




 */

