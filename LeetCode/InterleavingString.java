
public class InterleavingString {
    static public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        
        if(len1 + len2 != len3) return false;
        if(len1 == 0){
        	if(!s2.equals(s3)) return false;
        	else return true;
        }
        if(len2 == 0){
        	if(!s1.equals(s3)) return false;
        	else return true;
        }
        boolean[][] map = new boolean[len2 + 1][len1 + 1];
        map[0][0] = true;
        
        for(int i = 0;i <= len2;i++){
        	for(int j = 0;j <= len1;j++){
        		if(i == 0 && j == 0) continue;
        		if(i == 0){
        			if(map[i][j - 1] && s1.charAt(j - 1) == s3.charAt(i + j - 1)){
        				map[i][j] = true;
        			}
        			continue;
        		}
        		if(j == 0){
        			if(map[i - 1][j] && s2.charAt(i - 1) == s3.charAt(i + j - 1)){
        				map[i][j] = true;
        			}
        			continue;
        		}
        		if((map[i - 1][j] && s2.charAt(i - 1) == s3.charAt(i + j - 1)) 
        				|| (map[i][j - 1] && s1.charAt(j - 1) == s3.charAt(i + j - 1)))
        				map[i][j] = true;
        		
        	}
        }
        
        for(int i = 0;i <= len2;i++){
        	for(int j = 0;j <= len1;j++){
        		System.out.print(map[i][j] + ",");
        	}
        	System.out.println();
        }
        
        return map[len2][len1];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
		String s1 = "db", s2 = "b", s3 = "cbb";
		System.out.println(isInterleave(s1,s2,s3));
		
	}

}
