
public class SurroundedRegions {
	static public void process(int row,int col,char[][] board){
		int[][] direct = {{-1,0},{1,0},{0,-1},{0,1}};
		for(int i = 0;i < direct.length;i++){
			if(row + direct[i][0] < 0 || row + direct[i][0] > board.length - 1 || 
					col + direct[i][1] < 0 || col + direct[i][1] > board[0].length - 1) continue;
			if(board[row + direct[i][0]][col + direct[i][1]] == 'O') {
				board[row + direct[i][0]][col + direct[i][1]] = 'w';
				process(row + direct[i][0], col + direct[i][1], board);
			}
		}
	}
	
	static public void solve(char[][] board) {
		if(board.length == 0) return;
		
        for(int i = 0;i < board[0].length;i++){
        	if(board[0][i] == 'O') {
        		board[0][i] = 'w';
        		process(0,i,board);
        	}
        }
        for(int i = 0;i < board[0].length;i++){
        	if(board[board.length - 1][i] == 'O') {
        		board[board.length - 1][i] = 'w';
        		process(board.length - 1,i,board);
        	}
        }
        for(int i = 0;i < board.length;i++){
        	if(board[i][0] == 'O') {
        		board[i][0] = 'w';
        		process(i,0,board);
        	}
        }
        for(int i = 0;i < board.length;i++){
        	if(board[i][board[0].length - 1] == 'O') {
        		board[i][board[0].length - 1] = 'w';
        		process(i,board[0].length - 1,board);
        	}
        }
        
		for(int i = 0;i < board.length;i++){
			for(int j = 0;j < board[0].length;j++){
				if(board[i][j] == 'O') board[i][j] = 'X';
			}
		}
		for(int i = 0;i < board.length;i++){
			for(int j = 0;j < board[0].length;j++){
				if(board[i][j] == 'w') board[i][j] = 'O';
			}
		}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char[][] board = {{'X','X','X','X',},
				{'X','O','O','X',},
				{'X','X','O','X',},
				{'X','O','X','X',},};*/
		char[][] board = {{'O'}};
		solve(board);
		for(int i = 0;i < board.length;i++){
			for(int j = 0;j < board[0].length;j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

}
