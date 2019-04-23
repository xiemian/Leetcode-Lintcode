import java.util.ArrayList;
import java.util.List;


public class NQueens2 {
	static int re = 0;
	
	static public boolean isValid(int col,int row,int[] rr){
		for(int i = 0;i < row;i++){
			int colrow = rr[i];
			if(colrow == col || 
					colrow - col == i - row || 
					colrow - col == row - i){
				return false;
			}
		}
		
		return true;
	}
	
	static public void nQueens(int row,int[] rr){
		System.out.println("row " + row);
		if(rr.length == row) {
			re++;
			System.out.println("ok1");
			return;
		}
		System.out.println("row12 " + row);
		for(int col = 0;col < rr.length;col++){
			if(isValid(col,row,rr)){
				System.out.println("ok " + row);
				rr[row] = col;
				
				nQueens(row + 1,rr);
			}else
				continue;				
		}
	}
	
    static public int solveNQueens(int n) {
        int[] rr = new int[n];

        nQueens(0,rr);
        
        return re;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2;
		System.out.println(solveNQueens(n));
	}
}

