import java.util.*;

public class ReverseWordsinaStringII {
	public static void main(String[] args) {
		ReverseWordsinaStringII tester = new ReverseWordsinaStringII();
		tester.unitTest();
	}
	public void unitTest() {
        //String s = "the sky is blue";
        String s = "";
        char[] str = s.toCharArray();
        reverseWords(str);
        System.out.println(Arrays.toString(str));
	}
    public void reverseWords(char[] str) {
        if (str.length == 0) return;

        int start = 0, end = 0;
        reverse(str, 0, str.length-1);
        while (end < str.length) {
            while (end < str.length && str[end] != ' ') end++;
            reverse(str, start, end-1);
            end++;
            start = end;
        }
    }
    private void reverse(char[] str, int start, int end) {
        while (start < end) {
            char tmp = str[start];
            str[start] = str[end];
            str[end] = tmp;
            start++;
            end--;
        }
    }
}
