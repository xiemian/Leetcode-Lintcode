
public class DecodeWays {
    static public int numDecodings(String s) {
        int len = s.length();
        if(len == 0) return 0;
        int[] record = new int[len + 1];
        int[] ss = new int[len];
        char[] cc = s.toCharArray();
        for(int i = 0;i < len;i++){
        	ss[i] = cc[i] - '0';
        }
        
        record[1] = ss[0] == 0?0:1;
        if(len == 1) return record[1];
        record[0] = 1;
        
        for(int i = 2;i <= len;i++){
        	if(ss[i - 1] != 0)
        		record[i] += record[i - 1];
        	int tmp = ss[i - 2] * 10 + ss[i - 1];
        	if(ss[i - 2] != 0 && tmp <= 26 && tmp > 0)
        		record[i] += record[i - 2];
        }
        
        for(int i = 0;i < len + 1;i++){
        	System.out.print(record[i] + " ");
        }
        
        return record[len];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "01";
		System.out.println(numDecodings(s));
	}

}
