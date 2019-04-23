import java.util.*;


public class PalindromePartitioning {
	static public void calList(int index,String s,boolean[][] compare,List<List<String>> re,List<String> tmp){
		int len = s.length();
		if(index >= len) {
			List<String> tt = new ArrayList<String>(tmp);
			re.add(tt);
			return;
		}
		for(int i = index;i < len;i++){
			int x = index,y = i;
			while(y >= x){
				if(!compare[x][y]) break;
				x++;y--;
			}
			if(y < x){
				//System.out.println(s.substring(index,i + 1));
				tmp.add(s.substring(index,i + 1));
				calList(i + 1,s,compare,re,tmp);
				tmp.remove(tmp.size() - 1);
			}			
		}
	}
	
    static public List<List<String>> partition(String s) {
    	List<List<String>> re = new ArrayList<List<String>>();
    	int len = s.length();
    	if(len < 1) return re;
    	boolean[][] compare = new boolean[len][len];
    	for(int i = 0;i < len;i++)
    		compare[i][i] = true;
    	
    	for(int i = 0;i < len;i++){
    		for(int j = 0;j < len;j++){
    			if(i >= j) continue;
    			if(s.charAt(i) == s.charAt(j)) compare[i][j] = true;
    		}
    	}
    	List<String> tmp = new ArrayList<String>();
    	calList(0,s,compare,re,tmp);
    	
    	return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbcc";
		for(List<String> ll : partition(s)){
			System.out.println(ll);
		}
	}

}
