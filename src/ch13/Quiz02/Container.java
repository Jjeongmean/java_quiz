package ch13.Quiz02;

public class Container<K, V> {
    private K key;
    private V value;

    public void set(K key, V value) { // K, V = String
        this.key = key;
        this.value =value;
    }

    public K getKey() {
        return key;
    }

    public void set(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
