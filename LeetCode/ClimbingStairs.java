
public class ClimbingStairs {
    static public int climbStairs(int n) {
        int[] res = new int[n + 1];
        res[0] = 1;res[1] = 1;
    	for(int i = 2;i <= n;i++){
    		res[i] = res[i - 1] + res[i - 2];
    	}
    	return res[n];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(4));
	}

}
