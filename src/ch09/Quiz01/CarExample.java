package ch09.Quiz01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        //인스턴스 클래스는 바깥 클래스의 객체가 생성되어야만 객체 생성 가능
        Car.Tire tire = myCar.new Tire();

        //정적 클래스는 바깥 클래스의 객체가 생성되어있지 않아도 객체 생성 가능
        Car.Engine engine = myCar.new Engine();
    }
}
