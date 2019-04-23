
public class FourteenLongestCommonPrefix {
	
    static public String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) return "";
    	int maxL = strs[0].length();
    	String result = "";
        for(int i = 1;i < strs.length;i++){
        	if(strs[i].length() < maxL) maxL = strs[i].length();
        }
        for(int i = 0;i < maxL;i++){
        	char c = strs[0].charAt(i);
        	for(int j = 1;j < strs.length;j++){
        		if(c != strs[j].charAt(i)) return result;
        	}
        	result += c;
        }
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"abcde","abc","abcdy","abccccc","abc1"};
		System.out.println(longestCommonPrefix(s));
	}

}
