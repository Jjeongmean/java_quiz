package ch13.Quiz01;

public class Container<N, V> {
    private N name;
    private V value;



    public N get() {
        return name;
    }

    public void set(N name) {
        this.name = name;
    }

}
