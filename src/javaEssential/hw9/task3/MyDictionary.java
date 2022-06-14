package javaEssential.hw9.task3;

import java.util.ArrayList;
import java.util.List;

public class MyDictionary <K,V>{
    private List<Entry> list;

    public MyDictionary(){
        this.list = new ArrayList<>();
    }

    public MyDictionary(int count){
        this.list = new ArrayList<>(count);
    }

    public void add(K key, V value ){
        list.add(new Entry<>(key,value));
    }

    public Entry get(int index){
        return list.get(index);
    }

    @Override
    public String toString() {
        return "MyDictionary{" +
                "list=" + list +
                '}';
    }

    static class Entry <K,V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return  "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}
