
public class FirstMissingPositive {
	static	public int firstMissingPositive(int[] nums) {
		int temp;
        for(int i = 0;i < nums.length;i++){
        	while(nums[i] > 0 && i != nums[i] - 1){      	
        		temp = nums[i];
        		nums[i] = nums[temp - 1];
        		nums[temp - 1] = temp;;
        	}
        }
        for(int i = 0;i < nums.length;i++){
        	if(nums[i] != i + 1)
        		return i + 1;
        }
        return -1;      
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 4, -1,1};
		System.out.println(firstMissingPositive(nums));
	}

}
