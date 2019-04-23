import java.util.*;

public class LetterCombinationsOfPhoneNumber {
    static public List<String> letterCombinations(String digits) {
    	String[] map = new String[10];
        map[0] = "";  
        map[1] = "";  
        map[2] = "abc";  
        map[3] = "def";  
        map[4] = "ghi";  
        map[5] = "jkl";  
        map[6] = "mno";  
        map[7] = "pqrs";  
        map[8] = "tuv";  
        map[9] = "wxyz";
        
        List<String> result = new ArrayList<String>();
        if(digits.length() == 0) return result;
     
        int index = 0;
        char[]  mid = new char[digits.length()]; 
        
        oneDigitSearch(digits,mid,index,map,result);
        
        return result;
    }
    
    static public void oneDigitSearch(String digits,char[] mid,int index,String[] map,List<String> result){
        if(index == digits.length()) {
        	result.add(new String(mid));
        	return;
        }
        
    	String mm = map[digits.charAt(index) - '0'];
    	for(int i = 0;i < mm.length();i++){
    		mid[index] = mm.charAt(i);
    		oneDigitSearch(digits,mid,index + 1,map,result);
    	}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "23";
		System.out.print(letterCombinations(s));
	}

}
