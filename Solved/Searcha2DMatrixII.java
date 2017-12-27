public class Searcha2DMatrixII {
	public static void main(String[] args) {
		Searcha2DMatrixII tester = new Searcha2DMatrixII();
		tester.unitTest();
	}
	public void unitTest() {
		int[][] m =
				{
				  {1,   4,  7, 11, 15},
				  {2,   5,  8, 12, 19},
				  {3,   6,  9, 16, 22},
				  {10, 13, 14, 17, 24},
				  {18, 21, 23, 26, 30}
				};
		int[][] n = {{1 ,2 ,3 ,4 ,5},
					 {6 ,7 ,8 ,9 ,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};  
		int[][] o = {{1,3,5}};
		System.out.println(searchMatrix(o, 3));
	}
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0 || matrix[0].length == 0) return false;
		return binarySearch(matrix, target, 0, matrix.length-1, 0, matrix[0].length-1);	
    }
	private boolean binarySearch(int[][] matrix, int target, int low, int high, int left, int right) {
		int i = (low+high)/2;
		int j = (left+right)/2;
		if (low > high || left > right || low == high && left == right && target != matrix[i][j]) return false; 
		else if (target == matrix[i][j]) {
			return true;
		}
		else if (target < matrix[i][j]) {
			return binarySearch(matrix, target, low, i-1, left, j-1)
				 ||binarySearch(matrix, target, i, high, left, j-1) 
				 ||binarySearch(matrix, target, low, i-1, j, right);
		}
		else {
			return binarySearch(matrix, target, i+1, high, left, j)
				 ||binarySearch(matrix, target, i+1, high, j+1, right) 
				 ||binarySearch(matrix, target, low, i, j+1, right);
		}
	}
}
