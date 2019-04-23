
public class RemoveDuplicatesfromSortedArrayII {
    static public int removeDuplicates(int[] nums) {
        int start = 1,count = 1;
        
        for(int i = 1;i < nums.length;i++){
        	if(nums[i] != nums[i - 1]){
        		count = 1;
        	}else{
        		count++;
        	}
        	
        	if(count <= 2){
        		nums[start] = nums[i];
        		start++;
        	}
        }
        
        return start;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,1,2,3,3}; 
		System.out.println(removeDuplicates(nums));
		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i] + ",");
		}
	}

}
