
public class ValidSudoku {
	static public boolean checkValid(boolean[] a,int b){
		if(!a[b]) a[b] = true;
		else return false;
		return true;
	}
	
    static public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] sub = new boolean[9][9];
        
        for(int i = 0; i < 9;i++){
        	for(int j = 0; j < 9;j++){
        		char temp = board[i][j];
        		if(temp  != '.'){
        			if(!checkValid(row[i],temp - '1') || 
        					!checkValid(col[j],temp - '1') || 
        					!checkValid(sub[i / 3 * 3 + j / 3],temp - '1')) return false;
        		}
        		
        	}
        }
        
    	return true;
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
		
		for(int i = 0; i < 9;i++){
			for(int j = 0; j < 9;j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(isValidSudoku(board));
	}

}
