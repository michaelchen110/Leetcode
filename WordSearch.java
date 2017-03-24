public class WordSearch{
	public static void main(String[] args) {
		char[][] board = {
						  {'A','B','C','E'},
						  {'S','F','C','S'},
						  {'A','D','E','E'}
						 };
		System.out.println(exist(board, "ABCB"));
	}
    public boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (backtrack(board, i, j, word)) return true;
			}
		}
		return false;
    }
	public boolean backtrack(char[][] board, int x, int y, String subWord) {
		boolean exist = false;
		if (subWord.length() == 0) return true;
		else if (x >= 0 && y >= 0 && x < board.length && y < board[0].length && board[x][y] == subWord.charAt(0)) {
			board[x][y] ^= 256;
			exist = backtrack(board, x-1, y, subWord.substring(1))
				  ||backtrack(board, x+1, y, subWord.substring(1))
				  ||backtrack(board, x, y-1, subWord.substring(1))
				  ||backtrack(board, x, y+1, subWord.substring(1));
			board[x][y] ^= 256;
			return exist;
		}
	}
}
