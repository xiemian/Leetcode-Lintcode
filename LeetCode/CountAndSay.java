
public class CountAndSay {
    static public String countAndSay(int n) {
    	String s = "1";
        if(n == 0) return "";
        else if(n == 1) return "1";
        //else if(n == 2) return "11";
        
        for(int i = 1;i < n;i++){
        	//System.out.println("here");
        	char start = s.charAt(0);
        	String temp = "";
        	int len = 1;
        	for(int j = 1;j < s.length();j++){
        		if(s.charAt(j) != start){   
        			temp += String.valueOf(len) + start;
           			len = 1;
        			start = s.charAt(j);
        		}else len++;
        	}
        	//System.out.println(len + " " + (start - '0'));
        	temp += String.valueOf(len) + start;
        	s = temp;
        }
        
        return s;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(1));
	}

}
