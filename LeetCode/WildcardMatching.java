
public class WildcardMatching {
    static	public boolean isMatch(String s, String p) {
    	boolean hasStar = false;
    	int i = 0,j = 0,prei = 0,prej = 0;
    	
    	while(i < s.length()){
    		if(p.length() == j){
    			if(hasStar){
    				prei++;
    				i = prei;
    				j = prej;
    				continue;
    			}else return false;
    		}
    		if(s.charAt(i) != p.charAt(j)){
    			if(p.charAt(j) == '?'){
        			i++;
        			j++;
    			}else if(p.charAt(j) == '*'){
    				hasStar = true;
    				while(j < p.length() && p.charAt(j) == '*') j++;
    				if(j == p.length()) {
    					return true;
    				}
    				prei = i;
    				prej = j;
    			}else if(hasStar){
    				prei++;
    				i = prei;
    				j = prej;
    			}else return false;
    		}else{
    			i++;
    			j++;
    		}
    	}
    	
    	
    	while(j < p.length() && p.charAt(j) == '*') j++;
    	if(j == p.length()) {
			return true;
    	}
    	else return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaa";
		String p = "*";
		System.out.println(isMatch(s,p));

	}

}
