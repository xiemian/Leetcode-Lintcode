
public class JumpGameII {
    static public int jump(int[] nums) {
    	int ret = 0;
        int curMax = 0;
        int curRch = 0;
        for(int i = 0; i < nums.length; i ++)
        {
            if(curRch < i)
            {
                ret ++;
                curRch = curMax;
            }
            curMax = Math.max(curMax, nums[i]+i);
        }
        return ret;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,1,1,4};
		System.out.println(jump(nums));
	}

}
