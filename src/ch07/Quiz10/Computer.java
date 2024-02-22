package ch07.Quiz10;

public class Computer extends Machine{
    @Override
    public void powerOn() {
        super.powerOn();
    }

    @Override
    public void powerOff() {
        super.powerOff();
    }

    @Override
    public void work() {

    }
// 메소드 생성 후 오버라이딩를 안했기 때문

    /*
    답: work() 추상 메소드를 자식 클래스에서 재정의(오버라이딩) 하지 않아서 오류 발생.
    풀이: 만약 재정의하지 않는다면 public abstract class Computer extends Machine{}과 같이 추상 클래스로 선언해야함
     */
}
