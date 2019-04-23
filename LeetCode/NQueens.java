import java.util.*;


public class NQueens {
	static public void addre(int[]rr,List<List<String>> re){
		char[] c = new char[rr.length];
		
		List<String> ll = new ArrayList<String>();
		
		for(int i = 0;i < rr.length;i++){
			c[i] = '.';
		}
		for(int i = 0;i < rr.length;i++){
			int col = rr[i];
			c[col] = 'Q';
			String s = new String(c);
			c[col] = '.';
			ll.add(s);
			
		}
		re.add(ll);
		
		
	}
	
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
	
	static public void nQueens(int row,int[] rr,List<List<String>> re){
		if(rr.length == row) {
			addre(rr,re);
			return;
		}
		
		for(int col = 0;col < rr.length;col++){
			if(isValid(col,row,rr)){
				rr[row] = col;
				nQueens(row + 1,rr,re);
			}else
				continue;				
		}
	}
	
    static public List<List<String>> solveNQueens(int n) {
        List<List<String>> re = new ArrayList<List<String>>();
        
        int[] rr = new int[n];
        
        nQueens(0,rr,re);
        
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		for(List<String> ll : solveNQueens(n)){	
			System.out.println(ll);
		}
	}

}
