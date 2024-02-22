package ch07.Quiz06;

public class Child extends Parent {
    public int studentNo;

    public Child(String name, int studentNo) {
        super(name); // 추가
        this.name = name;
        this.studentNo = studentNo;
    }
    // this.name = name; ➡ super(name);
    //답:부모 생성자를 올바르게 호출하지 않았다. Child에서 this.name = name;을 super(name); 으로 바꿔야한다
    //풀이: 모든 객체는 생성자를 호출해야만 생성된다. 부모 객체도 예외는 아니다.
    //      부모 생성자는 자식 생성자의 맨 첫줄에 숨겨져 있는 super()에 의해 호출된다



}
