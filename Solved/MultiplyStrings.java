public class MultiplyStrings {
	public static void main(String[] args) {
		MultiplyStrings tester = new MultiplyStrings();
		tester.unitTest();
	}
	public void unitTest() {
		String n1 = "123";
		String n2 = "55";
		System.out.println(multiply(n1,n2));
	}
    public String multiply(String num1, String num2) {
		int carry = 0, mul, idx, tmp;
		StringBuilder sb = new StringBuilder("0");
		for (int n1 = num1.length()-1; n1 >= 0; n1--) {
			for (int n2 = num2.length()-1; n2 >= 0; n2--) {
				idx = num1.length()-1-n1 + num2.length()-1-n2;
				tmp = sb.length() > idx ? sb.charAt(sb.length()-1-idx) - '0' : 0;	
				mul = (tmp + carry + (num1.charAt(n1) - '0')*(num2.charAt(n2) - '0'))%10;
				carry = (tmp + carry +(num1.charAt(n1) - '0')*(num2.charAt(n2) - '0'))/10;
				System.out.println(sb.toString() + " idx: "+idx);
				System.out.println("carry: "+carry + " +tmp :" +tmp+ " + "+num1.charAt(n1) + " * " + num2.charAt(n2));
				System.out.println("carry: "+carry+" mul:"+mul);
				if (sb.length() > idx) sb.setCharAt(idx, (char) (mul+'0'));
				else sb.append(mul);
				System.out.println(sb.toString());
				System.out.println();
			}
			while (carry > 0) {
				sb.append(carry%10);
				carry /= 10;
			}
		}
		sb.reverse();
		/* if (carry > 0) sb.insert(0, carry); */
		return sb.toString();
    }
}
