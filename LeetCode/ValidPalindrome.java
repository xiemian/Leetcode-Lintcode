
public class ValidPalindrome {
	static int valid(char c){
		if(c >= 'a' && c <= 'z') return 1;
		if(c >= 'A' && c <= 'Z') return 1;
		if(c >= '0' && c <= '9') return 3;
		
		return 0;
	}
	
	static	public boolean isPalindrome(String s) {
		if(s.length() == 1) return true;
		
        int i1= 0,i2 = s.length() - 1,r1 = -1,r2 = -1;
        while(i1 < i2){
        	r1 = valid(s.charAt(i1));r2 = valid(s.charAt(i2));
        	if(r1 == 0) i1++;
        	else if(r2 == 0) i2--;
        	else if(r1 != r2) return false;
        	else if(r1 == 1 && (Math.abs(s.charAt(i1) - s.charAt(i2)) != 'a' - 'A')
        			&& (s.charAt(i1) != s.charAt(i2)))return false;
        	else if (r1 == 3 && s.charAt(i1) != s.charAt(i2)) return false;
        	else{
	        	i1++;
	        	i2--;
        	}
        }
		
		return true;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome("0P"));
	}

}
