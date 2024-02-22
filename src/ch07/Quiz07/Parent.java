package ch07.Quiz07;

public class Parent {
    public String nation;

    public Parent() {
        //매개변수 String 타입 생성자는 public Parent(String nation)이기에 이동한다.
        this("대한민국"); // 2. public Parent(String nation) 생성자 실행 후 출력

        //3. Parent() call 출력
        System.out.println("Parent() call");
    }

    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }

}
