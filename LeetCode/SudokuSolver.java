
public class SudokuSolver {
	static public boolean checkValid(char[][] board,int a,int b){
		       for (int i = 0; i < 9; ++i) {
			           if ((i != a && board[i][b] == board[a][b]) || 
			           (i != b && board[a][i] == board[a][b]))
		                return false;
		       }
			   /*     for (int j = 0; j < 9; ++j) {
			            if (j != b && board[a][j] == board[a][b])
			               return false;
			        }*/
			         int x = a / 3 * 3, y = b / 3 * 3;
			        for (int i = 0; i < 3; ++i) {
			            for (int j = 0; j < 3; ++j) {
			                 if (x + i != a && y + j != b && board[x + i][y + j] == board[a][b])
			                   return false;
			}
			}
			 return true;
	}
	
    static public boolean solveSudoku2(char[][] board) {
		for(int i = 0; i < 9;i++){
			for(int j = 0; j < 9;j++){
        		if(board[i][j] == '.'){
        			for(int k = 1;k < 10;k++){
        				board[i][j] = (char)('0' + k);
        				if(checkValid(board,i,j) && solveSudoku2(board)) return true;
       					board[i][j] = '.';
        			}
        			return false;
        		}
			}
		}
		return true;
    }
    
    static public void solveSudoku(char[][] board) {
    	solveSudoku2(board);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {
				{'5','3','.','.','7','.','.','.','.',},
				{'6','.','.','1','9','5','.','.','.',},
				{'.','9','8','.','.','.','.','6','.',},
				{'8','.','.','.','6','.','.','.','3',},
				{'4','.','.','8','.','3','.','.','1',},
				{'7','.','.','.','2','.','.','.','6',},
				{'.','6','.','.','.','.','2','8','.',},
				{'.','.','.','4','1','9','.','.','5',},
				{'.','.','.','.','8','.','.','7','9',},
			};
		
		solveSudoku(board);
		
		for(int i = 0; i < 9;i++){
			for(int j = 0; j < 9;j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
