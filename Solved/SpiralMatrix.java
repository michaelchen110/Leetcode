import java.util.*;

public class SpiralMatrix {
	public static void main(String[] args) {
		SpiralMatrix tester = new SpiralMatrix();
		tester.unitTest();
	}
	public void unitTest() {
        int[][] matrix = {            
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 },
            { 10, 11, 12 }
        };
        List<Integer> list = spiralOrder(matrix);
        System.out.println(Arrays.toString(list.toArray()));
	}
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new LinkedList<>();
        if (matrix.length == 0) return spiral;
        int i = 0, j = -1, round = 0, height = matrix.length, width = matrix[0].length;
        int[] vertical = {0, 1, 0, -1};
        int[] horizon = {1, 0, -1, 0};

        while (spiral.size() < matrix.length * matrix[0].length) {
            int v = vertical[round];
            int h = horizon[round];
            if (round % 2 == 0) {
                int counter = width;
                while (counter -- > 0) {
                    i += v;
                    j += h;
                    spiral.add(matrix[i][j]);
                }
                height--;
            }
            else {
                int counter = height;
                while (counter -- > 0) {
                    i += v;
                    j += h;
                    spiral.add(matrix[i][j]);
                }
                width--;
            }
            round = (round + 1) % 4;
        }
        return spiral;
    }
}
