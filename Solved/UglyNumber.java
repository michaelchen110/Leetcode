import java.util.*;

public class UglyNumber {
	public static void main(String[] args) {
		UglyNumber tester = new UglyNumber();
		tester.unitTest();
	}
	public void unitTest() {
        int ugly = 12;
        System.out.println(isUgly(ugly));
	}
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        int[] factors = {2, 3, 5};
        for (int factor: factors) {
            while (num > 1 && num%factor ==  0) {
                num = num/factor; 
            }
        }
        if (num == 1) return true;
        else return false;
    }
}
