
public class ZigZagConversion {

	
    static public String convert(String s, int numRows) {
        String[] ss = new String[numRows];
    	for(int i = 0;i < ss.length;i++){
    		ss[i] = "";
    	}
        String sResult = "";
        int index = 0;
        while(index < s.length()){
        	for(int i = 0;i < numRows & index < s.length();i++){
        		ss[i] += s.charAt(index);
        		index++;
        	}
        	for(int i = numRows - 2;i > 0 & index < s.length();i--){
        		ss[i] += s.charAt(index);
        		index++;
        	}
        }
        
        for(String sss:ss){
        	System.out.println(sss);
        	sResult += sss;
        }
        
        return sResult;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAYPALISHIRING";
		int nRows = 3;
		System.out.println(convert(s,nRows));
	}

}
