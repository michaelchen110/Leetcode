public class Searcha2DMatrix {
	public static void main(String[] args) {
		Searcha2DMatrix tester = new Searcha2DMatrix();
		tester.unitTest();
	}
	public void unitTest() {
		int[][] m = {
					  {1,   3,  5,  7},
					  {10, 11, 16, 20},
					  {23, 30, 34, 50}
				  };
		int target = 50;
		System.out.println(searchMatrix(m, target));
	}
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0 || matrix[0].length == 0) return false;
		return bs_y(matrix, 0, matrix.length-1, target); 
    }
	public boolean bs_y(int[][] matrix, int low, int high, int target) {
		if (low > high) return false;
		int mid = (low+high)/2;
		if (target < matrix[mid][0]) {
			return bs_y(matrix, low, mid-1, target);
		}
		else if (target > matrix[mid][matrix[mid].length-1]) {
			return bs_y(matrix, mid+1, high, target);
		}
		else {
			return bs_x(matrix[mid], 0, matrix[mid].length, target);
		}
	}
	public boolean bs_x(int[] matrix, int low, int high, int target) {
		if (low > high) return false;
		int mid = (low+high)/2;
		if (target < matrix[mid]) {
			return bs_x(matrix, low, mid-1, target);
		}
		else if (target > matrix[mid]) {
			return bs_x(matrix, mid+1, high, target);
		}
		else {
			return true;
		}
	}
}
