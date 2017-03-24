import java.util.*;

public class LongestIncreasingPathinaMatrix {
	public static void main(String[] args) {
		LongestIncreasingPathinaMatrix tester = new LongestIncreasingPathinaMatrix();
		tester.unitTest();
	}
	public void unitTest() {
		int[][] nums = {
			{9,9,4},
			{6,6,8},
			{2,1,1}
			/* {3,4,5}, */
			/* {3,2,6}, */
			/* {2,2,1} */
		};
		/* int[][] nums = {}; */
		System.out.println(longestIncreasingPath(nums));
	}
    public int longestIncreasingPath(int[][] matrix) {
		int max = 0; 
		if (matrix == null || matrix.length == 0) return max;
		int[][] dp = new int[matrix.length][matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				max = Math.max(max, dfs(dp, matrix, Integer.MIN_VALUE, i, j));
			}
		}
		/* for (int[] row : dp)  */
		/*     System.out.println(Arrays.toString(row)); */
		return max;
    }
	private int dfs(int[][] dp, int[][] matrix, int start, int i, int j) {
		if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) return 0;
		else if (matrix[i][j] <= start) return 0; 
		else if (dp[i][j] > 0) return dp[i][j];
		else {
			int max = 1; 
			max = Math.max(max, dfs(dp, matrix, matrix[i][j], i+1, j)+1);
			max = Math.max(max, dfs(dp, matrix, matrix[i][j], i-1, j)+1);
			max = Math.max(max, dfs(dp, matrix, matrix[i][j], i, j+1)+1);
			max = Math.max(max, dfs(dp, matrix, matrix[i][j], i, j-1)+1);
			dp[i][j] = max;
			return max;
		}
	}
}
