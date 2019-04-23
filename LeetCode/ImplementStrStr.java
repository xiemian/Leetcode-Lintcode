
public class ImplementStrStr {

	static public int strStr(String haystack, String needle) {
    	int searchLength = haystack.length() - needle.length(),matchNum = 0;
    	if(searchLength < 0) return -1;
    	else if(searchLength == 0) {
    		if(haystack.equals(needle)) return 0;
    		else return -1;
    	}
        for(int i = 0;i <= searchLength;i++){
        	for(int j = 0;j < needle.length();j++){
        		if(haystack.charAt(i + j) != needle.charAt(j)) break;
        		matchNum++;
        	}
        	if(matchNum == needle.length()) return i;
        	else matchNum = 0;
        }
        return -1;     
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h = "uuosdufiouieowrwjdfsflsdflaj2";
		String n = "sdflaj2";
		System.out.println(strStr(h,n));
	}

}
