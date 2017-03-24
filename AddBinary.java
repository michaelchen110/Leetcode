import java.util.*;

public class AddBinary {

	public static void main(String[] args) {
		AddBinary tester = new AddBinary();
		tester.unitTest();
	}
	public void unitTest() {
		String a = "";
		String b = "";
		System.out.println(addBinary(a, b));
	}
    public String addBinary(String a, String b) {
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = a.length()-1, j = b.length()-1; i>=0 || j>=0; i--, j--) {
			int b1 = i < 0 ? 0 : a.charAt(i) - '0';
			int b2 = j < 0 ? 0 : b.charAt(j) - '0';
			int sum = (carry + b1 + b2)%2;
			carry = (carry + b1 + b2)/2;
			sb.append(sum);
		}
		if(carry == 1) sb.append(carry);
		return sb.reverse().toString();
    }
}
