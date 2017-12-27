import java.util.*;

public class SumofTwoIntegers {
	public static void main(String[] args) {
		SumofTwoIntegers tester = new SumofTwoIntegers();
		tester.unitTest();
	}
	public void unitTest() {
        int a = 10;
        int b = 20;
        System.out.println(getSum(a, b));
	}
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1; 
            a = a ^ b;     
            b = carry;
        }
        return a;
    }
}
