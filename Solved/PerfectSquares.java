import java.util.*;

public class PerfectSquares{
	public static void main(String[] args) {
		int n = 13;
		System.out.println(numSquares(n));
	}
    public int numSquares(int n) {
		int[] dp = new int[n+1];
		for (int i = 0; i <= n; i++) {
			if (i*i <= n+1) dp[i*i] = 1;
			dp[i] = dp[i] == 1 ? 1 : Integer.MAX_VALUE;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j*j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[j*j] + dp[i-j*j]);
			}
		}
		return dp[n];
	}
    /* public int numSquares(int n) { */
	/*     ArrayList<Integer> compute = new ArrayList<>(); */
	/*     compute.add(0, Integer.MAX_VALUE); */
	/*     for (int i = 1; i <= n; i++) { */
	/*         if (Math.sqrt(i)%1 == 0) */
	/*             compute.add(i, 1); */
	/*         else */
	/*             compute.add(i, Integer.MAX_VALUE); */
	/*     } */
	/*     return dp(n, compute); */
    /* } */
	/* private int dp(int n, ArrayList<Integer> compute) { */
	/*     if (compute.get(n) == Integer.MAX_VALUE) { */
	/*         for (int i = 1; i <= (int) Math.sqrt(n); i++) { */
	/*             int tmp = dp(i*i, compute) + dp(n-i*i, compute); */
	/*             if (tmp  < compute.get(n)) compute.set(n, tmp); */
	/*         } */
	/*     } */
	/*     return compute.get(n); */
	/* } */
}
