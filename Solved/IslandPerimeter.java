import java.util.*;

public class IslandPerimeter {
	public static void main(String[] args) {
		IslandPerimeter tester = new IslandPerimeter();
		tester.unitTest();
	}
	public void unitTest() {
        int[][] grid = {{}};
        int[][] grid = {{0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}};
        System.out.println(islandPerimeter(grid));
	}
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) perimeter += count(grid, i, j);
            }
        }
        return perimeter;
    }
    private boolean isValid(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return false;
        return true;
    }
    private int count(int[][] grid, int i, int j) {
        int count = 0;
        int[] y = {0, -1, 0, 1};
        int[] x = {1, 0, -1, 0};
        for (int p = 0; p < 4; p++) {
            int v = i + y[p];
            int h = j + x[p];
            boolean valid = isValid(grid, v, h);
            if (valid && grid[v][h] == 0 || !valid) count++;
        }
        return count;
    }
}
