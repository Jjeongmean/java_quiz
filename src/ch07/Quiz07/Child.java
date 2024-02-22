package ch07.Quiz07;

public class Child extends Parent{
    public String name;

    public Child() {
        //1.부모 생성자를 먼저 실행하므로 public Parent() 생성자 실행
        
        this("홍길동"); //4.Child(String name) 생성자 실행 후 Child(String name) call 출력
        // 5. Child() call 출력
        System.out.println("Child() call"); 
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }

}
