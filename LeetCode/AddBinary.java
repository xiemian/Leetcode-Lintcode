
public class AddBinary {
    
	static public String addBinary(String a, String b) {
        int len1 = a.length(),len2 = b.length();
        String re = "";
        int aa,bb;
        int mark = 0;
        while(len1 > 0 || len2 > 0){
        	if(len1 - 1 >= 0) aa = a.charAt(len1 - 1) - '0';
        	else aa = 0;
        	
        	if(len2 - 1 >= 0) bb = b.charAt(len2 - 1) - '0';
        	else bb = 0;
        	//System.out.print("aa = " + aa + "; bb = " + bb + "; mark = " + mark);
        	switch(aa + bb + mark){
	        	case 0: re = '0' + re;mark = 0;break;
	        	case 1: re = '1' + re;mark = 0;break;
	        	case 2: re = '0' + re;mark = 1;break;
	        	case 3: re = '1' + re;mark = 1;break;
        	}
        	len1--;len2--;
        	//System.out.println(" re = " + re);
        }
        
        if(mark == 1) re = '1' + re; 
		return re;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11111";
		String b = "11";
		System.out.println(addBinary(a,b));
	}

}
