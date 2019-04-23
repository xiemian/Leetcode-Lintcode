
public class DistinctSubsequences {
	/*static void numCal(String s, String t,int index1,int index2){
		if(index2 == t.length()) {
			re++;
			//System.out.println();
			return;
		}
		for(int i = index1;i < s.length() - t.length() + 1 + index2;i++){
			if(s.charAt(i) == t.charAt(index2)){
				//System.out.print(i + "," + index2 + "," + s.charAt(i) + " ");
				numCal(s,t,i + 1,index2 + 1);
			}
		}
	}
	static int re;
    static public int numDistinct(String s, String t) {
        re = 0;
        if(s.length() == 0 || t.length() > s.length() || t.length() == 0) return re;
        numCal(s,t,0,0);

        return re;
    }
    /*
	/**
	 * @param args
	 */
	
    static public int numDistinct(String S, String T) {  
        if(S==null||T==null) {  
            return 0;  
        }  
        if(S.length()<T.length()) {  
            return 0;  
        }  
    //���ƹ�ʽ�õ�  
        int [][] dp = new int[S.length()+1][T.length()+1];  
        dp[0][0] = 1;  
        //����һ���ַ����任��һ���մ���ֻ��һ�ֱ任����  
        for(int i=0;i<S.length();i++) {  
            dp[i][0] = 1;      
        }  
        //���ƹ�ʽ  
        for(int i=1;i<=S.length();i++) {  
            for(int j=1;j<=T.length();j++) {  
                //���S��T�ĵ�ǰ�ַ���ȣ���ô������ѡ��������S�ĵ�ǰ�ַ�����Ҫ  
                dp[i][j] = dp[i-1][j];  
                if(S.charAt(i-1)==T.charAt(j-1)) {  
                    dp[i][j] += dp[i-1][j-1];  
                }  
            }  
        }  
        return dp[S.length()][T.length()];  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "babgbag", T = "bag";
		//String S = "rabbbit", T = "rabbit";
		System.out.println(numDistinct(S,T));
	}

}
