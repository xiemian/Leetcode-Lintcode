
public class MaximumSubarray {
    static public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0)  
            return 0;  
        int global = nums[0];  
        int local = nums[0];  
        for(int i=1;i<nums.length;i++)  
        {  
            if(local < 0) local = nums[i];
            else local += nums[i];
        	  
            global = Math.max(local,global);  
        }  
        return global;  
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

}
