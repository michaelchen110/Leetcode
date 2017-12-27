import java.util.*;

public class RotateImage {
	public static void main(String[] args) {
		RotateImage tester = new RotateImage();
		tester.unitTest();
	}
	public void unitTest() {
        int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
	}
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][len - j - 1];
                matrix[i][len - j - 1] = tmp;
            }
        }        
        for (int i = 1; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}
