package ch13.Quiz01;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String , String> container1 = new Container<>();
        container1.set("홍길동");

        String str = container1.get();

        Container<Integer, String> container2 = new Container<>();
        container2.set(6);

        int value = container2.get();

    }
}
