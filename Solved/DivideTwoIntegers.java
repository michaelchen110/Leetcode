import java.util.*;

public class DivideTwoIntegers {
	public static void main(String[] args) {
		DivideTwoIntegers tester = new DivideTwoIntegers();
		tester.unitTest();
	}
	public void unitTest() {
		System.out.println(divide(100, 6));
	}
	public int divide(int dividend, int divisor) {
		int h = 0;
		int result = 0;
		while (((1<<(31-h))&divisor) == 0) h++;
		while (dividend > divisor) {
			int high = h;
			int low = 0;
			while(low <= high) {
				int mid = (low+high)/2;
				if ((divisor<<mid) <= dividend && dividend <= (divisor<<(mid+1))) {
					result += 1<<mid;
					dividend -= divisor<<mid;
					break;
				}
				else if (dividend < (divisor<<mid)) low = mid+1; 
				else if (dividend > (divisor<<mid)) high = mid-1;
			}
		}
		return result;
	}
}
