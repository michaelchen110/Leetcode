import java.util.*;

public class NumberofIslands {
	public static void main(String[] args) {
		NumberofIslands tester = new NumberofIslands();
		tester.unitTest();
	}
	public void unitTest() {
		char[][] grid = {
			{'1', '1', '0', '0', '0'},
			{'1', '1', '0', '0', '0'},
			{'0', '0', '1', '0', '0'},
			{'0', '0', '0', '1', '1'},
		};
		System.out.println(numIslands(grid));
	}
    public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
		int count = 0;
		List<List<Boolean>> check = new ArrayList<>();
		for (int i = 0; i < grid.length; i++) {
			check.add(i, new ArrayList<Boolean>());
			for (int j = 0; j < grid[0].length; j++) {
				check.get(i).add(j, false);
			}
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1' && !check.get(i).get(j)) {
					count++;
					dfs(grid, check, i, j);
				}
			}
		}
		return count;
    }
	private void dfs(char[][] grid, List<List<Boolean>> check, int i, int j) {
		if ( i<0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || check.get(i).get(j)) return;
		check.get(i).set(j, true);
		dfs(grid, check, i-1, j);
		dfs(grid, check, i+1, j);
		dfs(grid, check, i, j-1);
		dfs(grid, check, i, j+1);
	}
	private void union(
}
