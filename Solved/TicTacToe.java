import java.util.*;

public class TicTacToe {
	public static void main(String[] args) {
		TicTacToe tester = new TicTacToe(3);
		tester.unitTest();
	}
	public void unitTest() {
        System.out.println(move(1,1,1));
        System.out.println(move(1,2,1));
        System.out.println(move(0,2,2));
        System.out.println(move(1,0,1));
	}

    private int[] rows, cols;
    private int diag = 0, adiag = 0;
    public TicTacToe(int n) {
        rows = new int[n];
        cols = new int[n];
        Arrays.fill(rows, 0);
        Arrays.fill(cols, 0);
    }
    public int move(int row, int col, int player) {
        int len = rows.length;
        int flag = player == 1 ? 1 : -1;
        rows[row] += flag;
        cols[col] += flag;
        if (row == col) diag += flag;
        if (row + col == len - 1) adiag += flag;
        return Math.abs(rows[row]) == len || 
               Math.abs(cols[col]) == len ||
               Math.abs(diag) == len ||
               Math.abs(adiag) == len ? player : 0;
    }
}
