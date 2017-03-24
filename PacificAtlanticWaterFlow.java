import java.util.*;

public class PacificAtlanticWaterFlow {
	public static void main(String[] args) {
		PacificAtlanticWaterFlow tester = new PacificAtlanticWaterFlow();
		tester.unitTest();
	}
	public void unitTest() {
		/* int[][] matrix = {}; */
		int[][] matrix = {
			{1, 2, 2, 3, 5},
			{3, 2, 3, 4, 4},
			{2, 4, 5, 3, 1},
			{6, 7, 1, 4, 5},
			{5, 1, 1, 2, 4}
		};
		List<int[]> res = pacificAtlantic(matrix);
		for (int[] r : res)
			System.out.println(Arrays.toString(r));
	}
    public List<int[]> pacificAtlantic(int[][] matrix) {
		List<int[]> result = new LinkedList<>();
		if (matrix.length == 0 || matrix[0].length == 0) return result;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (flow(matrix, matrix[i][j], i, j) == 3) result.add(new int[]{i,j});
			}
		}
		return result;
	}
	private int flow(int[][] matrix, int high, int i, int j) {
		if (i < 0 || j < 0) return 2;
		if (i >= matrix.length || j >= matrix[0].length) return 1;
		if (high < matrix[i][j]) return 0;
		int cur = matrix[i][j];
		matrix[i][j] = Integer.MAX_VALUE;
		int ocean = flow(matrix, cur, i+1, j) |
					flow(matrix, cur, i-1, j) |
					flow(matrix, cur, i, j+1) |
					flow(matrix, cur, i, j-1);
		matrix[i][j] = cur;
		return ocean;
	}
}
