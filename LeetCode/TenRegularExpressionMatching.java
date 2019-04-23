
public class TenRegularExpressionMatching {
	
	static public boolean isMatch(String s, String p) {       

        if(p.length() == 0){
        	if(s.length() != 0) return false;
        	if(p.length() == 0) return true;
        }
        if(p.length() > 1 && p.charAt(1) == '*' && p.charAt(0) != '*'){
        	if(isMatch(s,p.substring(2))) return true;
        	
        	for(int i = 1;i <= s.length();i++){
        		if(p.charAt(0) == '.') {if(isMatch(s.substring(i),p.substring(2))) return true;}
        		else if(p.charAt(0) != s.charAt(i - 1)) break;
        		else if(isMatch(s.substring(i),p.substring(2))) return true;
        	}
        }else if(s.length() == 0 || p.charAt(0) == '*') return false;
        else if(p.charAt(0) == '.' || s.charAt(0) == p.charAt(0)) return isMatch(s.substring(1),p.substring(1));
        
        return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aa";
		String s2 = ".*";
		System.out.println(isMatch(s1,s2));
	}

}
