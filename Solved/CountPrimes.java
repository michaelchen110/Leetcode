import java.util.*;

public class CountPrimes {
	public static void main(String[] args) {
		CountPrimes tester = new CountPrimes();
		tester.unitTest();
	}
	public void unitTest() {
        System.out.println(countPrimes(100));
	}
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        int count = 0;
        Arrays.fill(prime, true);
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    prime[i*j] = false;
                } 
            }
        }
        return count;
    }
}
