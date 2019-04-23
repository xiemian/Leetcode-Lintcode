
public class Palindrome {
	
	static public boolean compare(int dig,int leftindex,int rigindex){

		while(leftindex != 0){
			int left = dig / (int)(Math.pow(10, leftindex - 1)) % 10;
			//System.out.println(left);
			int right = dig / (int)(Math.pow(10, rigindex - 1)) % 10;
			//System.out.println(right);
			if(left != right) return false;	
			
			leftindex--;
			rigindex++;
		}
		return true;
	}
	
    static public boolean isPalindrome(int x) {
    	if(x < 0) return false;
    	
    	int index = 0;
        while((int)(x / (Math.pow(10, index))) != 0){
        	index++;
        }
        if(index % 2 != 0) return compare(x,index / 2, index / 2 + 2);
        else return compare(x,index / 2,index / 2 + 1);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 432112234;
		int y = 765567;
		//isPalindrome(x);
		System.out.println(isPalindrome(x));
		System.out.println(isPalindrome(y));
	}

}
