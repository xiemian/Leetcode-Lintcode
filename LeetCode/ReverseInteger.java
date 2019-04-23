
public class ReverseInteger {
    static public int reverse(int x) {
        int max = 0x7fffffff;
        int min = 0x80000000;
        long sum = 0;
        
        while(x != 0){
        	int temp = x % 10;
        	
        	sum = sum * 10 + temp;
        	if(sum > max || sum < min) return 0;
        	      	
        	x = x / 10;
        }
        
        return (int) (sum);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1000000003 ;
		System.out.println(reverse(x));
	}

}
