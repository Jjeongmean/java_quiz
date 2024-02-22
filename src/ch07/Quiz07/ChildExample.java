package ch07.Quiz07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
    // 출력 답:
    //Parent(String nation) call
    //Parent() call
    //Child(String name) call
    //Child() call

    /*
     풀이:
       this()는 같은 클래스의 다른 생성자를 호출할 때 사용한다.
    1. main의 Child child = new Child()에서 public Child()로 이동
    2. this("홍길동")실행 전에 자동으로 생성되는 기본 부모 생성자 호출 ➡ super()
    3. public Parent()로 이동하여 this("대한민국")으로 public Parent(String nation)으로 이동
    4. ①Parent(String nation) call 출력
    5. 다시 public Parent()로 돌아온 후 ②Parent() call 출력
    6. 다시 public Child()로 돌아온 후 this("홍길동")을 통해 public Child(String name)으로 이동
    7. ③Child(String name) call 출력
    8. 다시 public Child()로 돌아온 후 ④Child() call 출력

    */
    
