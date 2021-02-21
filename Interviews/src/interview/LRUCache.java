package interview;
import java.util.*;

public class LRUCache {

    private int capacity;
    private LinkedHashMap<Integer,Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>();
    }

    public int get(int key) {
        Integer value = this.map.get(key);
        if (value == null) {
            value = -1;
        } else {
            this.set(key, value);
        }
        return value;
    }

    public void set(int key, int value) {
        if (this.map.containsKey(key)) {
            this.map.remove(key);
        } else if (this.map.size() == this.capacity) {
            Iterator<Integer> it = this.map.keySet().iterator();
            it.next();
            it.remove();
        }
        map.put(key, value);
    }
    
    public static void main(String Args[]) {
    	LRUCache cache = new LRUCache(4);
    	cache.set(5, 7);
    	cache.set(8, 20);
    	cache.get(5);       // returns 7
    	cache.set(3, 6);    // evicts key 8
    	cache.get(8);       // returns -1 (not found)
    	cache.set(4, 12);   // evicts key 5
    	cache.get(5);       // returns -1 (not found)
    	cache.get(3);       // returns 6
    	cache.get(4);  
    	
    }
}