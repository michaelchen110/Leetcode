import java.util.*;

public class Numberof1Bits {
	public static void main(String[] args) {
		Numberof1Bits tester = new Numberof1Bits();
		tester.unitTest();
	}
	public void unitTest() {
		System.out.println(hammingWeight(11));
	}
    public int hammingWeight(int n) {
		int num = 0;
		while (n != 0) {
			num += n&1;
			n >>>= 1;
		}
		return num;
    }
}
