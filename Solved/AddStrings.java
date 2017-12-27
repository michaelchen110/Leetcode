public class AddStrings {
	public static void main(String[] args) {
		AddStrings tester = new AddStrings();
		tester.unitTest();
	}
	public void unitTest() {
		String n1 = "", n2 = "23423";
		System.out.println(addStrings(n1, n2));
	}
    public String addStrings(String num1, String num2) {
		int carry = 0, sum;
		StringBuilder sb = new StringBuilder();
		for (int n1 = num1.length()-1, n2 = num2.length()-1; n1 >= 0 || n2 >= 0; n1--, n2--) {
			sum = n1 < 0 ? 0 : num1.charAt(n1) - '0';
			sum = n2 < 0 ? sum : sum + num2.charAt(n2) - '0';
			sum += carry;
			carry = sum/10;	
			sb.insert(0, sum%10);
		}
		if (carry > 0) sb.insert(0, carry);
		return sb.toString();
	}
}
