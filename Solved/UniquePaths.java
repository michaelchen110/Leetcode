import java.util.*;

public class UniquePaths {
	public static void main(String[] args) {
		UniquePaths tester = new UniquePaths();
		tester.unitTest();
	}
	public void unitTest() {
        System.out.println(uniquePaths(1, 10));
	}
    public int uniquePaths(int m, int n) {
        int p = m + n - 2;
        int q = Math.min(m, n) - 1;
        double paths = 1;
        for (int i = 1; i <= q; i++) {
            paths = paths * (p - i + 1) / i;
        }
        return (int) paths;
    }
}
