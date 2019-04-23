
public class longestPalindrome {

    public String longestPalindrome(String s) {
        int l = s.length();
        int ss = 0;
        int tt = 0;
        int max = 0;
        boolean[][] a = new boolean[l][l];
        for(int i = 0;i < l;i++){
        	for(int j = 0;j < l;j++){
        		if(i >= j) a[i][j] = true;
        		else a[i][j] = false;
        	}
        }
        
        for(int j = 1;j < l;j++){
        	for(int i = 0;i < j;i++){
        		if(s.charAt(i) == s.charAt(j) & a[i + 1][j - 1] == true){
        			a[i][j] = true;
        			if(j - i + 1 > max){
        				ss = i;
        				tt = j;
        				max = j - i + 1;
        			}
        		}
        	}
        }
        
        return s.substring(ss, tt + 1);
    }
    
	public static void main(String[] args) {
		String s = "aabb23baacaab3bbaa2";
		longestPalindrome solution = new longestPalindrome();
		System.out.println(solution.longestPalindrome(s));
	}

}
