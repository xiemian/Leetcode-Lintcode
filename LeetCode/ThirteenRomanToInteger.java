
public class ThirteenRomanToInteger {
    static public int romanToInt(String s) {
    	int result = toNum(s.charAt(0));
    	for(int i = 1;i < s.length();i++){
    		int clow = toNum(s.charAt(i - 1));
    		int cHigh = toNum(s.charAt(i));
    		if(clow < cHigh)
    			result += cHigh - 2 * clow;
    		else 
    			result += cHigh;
    	}
        return result;
    }
    
    static int toNum(char c){
    	switch (c){
	    	case 'I': return 1;
	    	case 'V': return 5;
	    	case 'X': return 10;
	    	case 'L': return 50;
	    	case 'C': return 100;
	    	case 'D': return 500;
	    	case 'M': return 1000;
    	}
    	return 0;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MMLXXIII";
		System.out.println(romanToInt(s));
	}

}
