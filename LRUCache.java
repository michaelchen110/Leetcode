import java.util.*;

public class LRUCache {
	public static void main(String[] args) {
		LRUCache tester = new LRUCache(10);
		tester.unitTest();
	}
	public void unitTest() {
		LRUCache cache = new LRUCache(2);
		cache.put(1,1);
		cache.put(2,2);
		cache.get(1);
		cache.put(3, 3);
		cache.get(2);       // returns -1 (not found)
		cache.put(4, 4);    // evicts key 1
		cache.get(1);       // returns -1 (not found)
		cache.get(3);       // returns 3
		System.out.println(cache.get(4));
	}

	int cap;
	Map<Integer, Integer> cache;
    public LRUCache(int capacity) {
		cap = capacity;
		cache = new LinkedHashMap<Integer, Integer>() {
			protected boolean removeEldestEntry(Map.Entry eldest) {
				return size() > cap;
			}
		};
    }
    public int get(int key) {
		return cache.getOrDefault(key, -1);
    }
    public void put(int key, int value) {
		cache.put(key, value);
	}
}


