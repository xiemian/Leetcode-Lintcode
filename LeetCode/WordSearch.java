import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;


public class WordSearch {
	/*
	static public class Pair{
		Pair(int xx,int yy){
			x = xx;
			y = yy;
		}
		int x;
		int y;
		
		int getKey(){
			return x;
		}
		
		int getValue(){
			return y;
		}
	}
	
	static public boolean search(HashMap<Character,List<Pair>> mapBoard,String word,int index,Stack<Pair> re){
		if(index == word.length()) return true;	
				
		char c = word.charAt(index);
		if(!mapBoard.containsKey(c)) return false;
		for(Pair pp : mapBoard.get(c)){
			if(index == 0){
				re.add(pp);
				if(search(mapBoard,word,1,re)) return true;
				re.pop();
			}else{
				if(re.contains(pp)) continue;
				Pair tmp = re.peek();
				if((Math.abs(pp.getKey() - tmp.getKey()) == 1 && pp.getValue() == tmp.getValue())
						|| (Math.abs(pp.getValue() - tmp.getValue()) == 1 && pp.getKey() == tmp.getKey())
						){
					re.add(pp);
					if(search(mapBoard,word,index + 1,re)) return true;
					re.pop();
				}
			}	
		}
		
		return false;

	}
	
    static public boolean exist(char[][] board, String word) {
        Stack<Pair> re = new Stack<Pair>();
        HashMap<Character,List<Pair>> mapBoard = new HashMap<Character,List<Pair>>();
        
        for(int i = 0;i < board.length;i++){
        	for(int j = 0;j < board[0].length;j++){
        		if(!mapBoard.containsKey(board[i][j]))
        			mapBoard.put(board[i][j], new ArrayList<Pair>());
        		mapBoard.get(board[i][j]).add(new Pair(i,j));       			
            }
        }
        
        return search(mapBoard,word,0,re);
    }*/
	static int[] dr = {0,0,1,-1};
	static int[] dc = {-1,1,0,0};
	static public boolean search(char[][]board,int row,int col,String word,int index,boolean[][] isVisited){
		if(row < 0 || col < 0 || row >= board.length || col >= board[0].length ||
				isVisited[row][col] || board[row][col] != word.charAt(index)) return false;
		if(++index == word.length()) return true;
		
		isVisited[row][col] = true;
		for(int i = 0;i < 4;i++){
			if(search(board,row + dr[i],col + dc[i],word,index,isVisited)) return true;
		}
		isVisited[row][col] = false;
		
		return false;
	}
	
	static public boolean exist(char[][] board, String word) {
		boolean[][] isVisited = new boolean[board.length][board[0].length];
		
        for(int i = 0;i < board.length;i++){
        	for(int j = 0;j < board[0].length;j++){
        		if(search(board,i,j,word,0,isVisited)) return true;
        	}
        }
		
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board =
			{
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
				};

		//String word = "ABCCED";
		//String word = "SEE";
		String word = "ABCB";
				
		System.out.println(exist(board,word));
	}

}
