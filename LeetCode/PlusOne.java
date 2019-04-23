
public class PlusOne {
    static public int[] plusOne(int[] digits) {
        int len = digits.length;
        
        //System.out.println("1");
        for(int i = len - 1;i >= 0;i--){
        	if(digits[i] == 9) {
        		digits[i] = 0;
        	}
        	else{
        		digits[i]++;        		
        		return digits;
        	}
        }
        //System.out.println("1");
        int[]result = new int[len + 1];
        result[0] = 1;
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {9,9,9,9};
		digits = plusOne(digits);
		for(int i = 0;i < digits.length;i++)
			System.out.println(digits[i]);
	}

}
