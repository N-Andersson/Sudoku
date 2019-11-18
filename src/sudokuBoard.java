
public class sudokuBoard {

	public int[][] board = new int[9][9];

	public sudokuBoard() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = 0;

			}
		}

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sb.append(board[i][j]);
				if(j % 3 == 2) {
					//System.out.println(i % 3);
					sb.append("|");
				}else {
				sb.append(" ");
				}
			}
			if(i % 3 ==2) {
				sb.append("\n");

				for(int k = 0; k < 9; k++) {
					sb.append("-" + " ");
				}
				sb.append("\n");
				
			}else {
				sb.append("\n");
			}
		}

		return sb.toString();
	}
	
	public void put(int i, int j, int k) {
		board[i][j] = k;
	}
	
	public int get(int i, int j) {
		return board[i][j];
	}

	public static void main(String[] args) {
		sudokuBoard sudoku = new sudokuBoard();
		sudoku.put(1, 2, 5);
		sudoku.put(5, 7, 9);
		System.out.print(sudoku.toString());
		System.out.print(sudoku.get(1, 2));

	}

}
