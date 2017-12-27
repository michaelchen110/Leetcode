import java.util.*;

public class FirstUniqueCharacterinaString {
	public static void main(String[] args) {
		FirstUniqueCharacterinaString tester = new FirstUniqueCharacterinaString();
		tester.unitTest();
	}
	public void unitTest() {
        String s = "eee";
        System.out.println(firstUniqChar(s));
	}
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int first = -1;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = map.getOrDefault(ch[i], 0);
            if (count == 0) map.put(ch[i], 1);
            else map.put(ch[i], 2);
        }
        for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i]) == 1) return i;
        }
        return -1;
    }
}
