import java.util.ArrayList;
import java.util.List;




public class LengthOfLastWord {
	

	
    static public int lengthOfLastWord(String s) {
        int len = 0;
        boolean flag = false;
        for(int i = s.length() - 1;i >=0;i--){
        	if(s.charAt(i) == ' ') 
        		if(!flag) continue;
        		else return len;
        	else {
        		if(!flag) flag = true;
        		len++;
        	}
        }      
        
        return len;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ss = "Hello World";
		
		System.out.println(lengthOfLastWord(ss));
		
	}

}
