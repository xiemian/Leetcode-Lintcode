
public class PalindromePartitioningII {
	static public void calList(int index,String s,boolean[][] compare,int cut){
		int len = s.length();
		if(index >= len) {
			min = cut - 1;
			return;
		}
		for(int i = len - 1;i >= index;i--){
			int x = index,y = i;
			while(y >= x){
				if(!compare[x][y]) break;
				x++;y--;
			}
			if(y < x){
				if(cut < min)
					calList(i + 1,s,compare,cut + 1);
			}			
		}
	}
	static int min;
	static	public int minCut(String s) {
    	int len = s.length();
    	if(len < 2) return 0;
    	min = len - 1;
    	boolean[][] compare = new boolean[len][len];
    	for(int i = 0;i < len;i++)
    		compare[i][i] = true;
    	
    	for(int i = 0;i < len;i++){
    		for(int j = 0;j < len;j++){
    			if(i >= j) continue;
    			if(s.charAt(i) == s.charAt(j)) compare[i][j] = true;
    		}
    	}
    	calList(0,s,compare,0);
    	
		return min;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbcc";
		System.out.println(minCut(s));
	}

}
