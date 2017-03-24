import java.util.*;

public class CountAndSay {
	public static void main(String[] args) {
		CountAndSay tester = new CountAndSay();
		tester.unitTest();
	}
	public void unitTest() {
		System.out.println(countAndSay(4));
	}
    public String countAndSay(int n) {
        String sequence = "1";
        for (int i = 0; i < n-1; i++) {
            StringBuilder sb = new StringBuilder();
            char tmp = sequence.charAt(0);
            int count = 0;
            for (char ch : sequence.toCharArray()) {
                if (ch == tmp) count++;
                else {
                    sb.append(count+""+tmp);
                    count = 1;
                    tmp = ch;
                }
            }
			sb.append(count+""+tmp);
            sequence = sb.toString();
        }
		return sequence;
    }
}
