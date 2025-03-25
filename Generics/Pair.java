package Generics;

public class Pair<K,V> {
    private K key;
    private V vlaue;
    
    public Pair(K key, V vlaue) {
        this.key = key;
        this.vlaue = vlaue;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVlaue() {
        return vlaue;
    }

    public void setVlaue(V vlaue) {
        this.vlaue = vlaue;
    }

    
}
