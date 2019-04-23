
public class SortColors {
	static public void exchange(int[] nums,int index1,int index2) {
		int tmp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = tmp;
	}
	
    static public void sortColors(int[] nums) {
        int start = 0,end = nums.length - 1;
        while(end >= start && nums[end] == 2) end--;
        while(end >= start && nums[start] == 0) start++;
        
        for(int i = start;i < end + 1;i++){
        	while(true){
	        	if(nums[i] == 0) {
	        		exchange(nums,start,i);
	        		start++;
	        		break;
	        	}else if(nums[i] == 1) break;
	        	else {
	        		exchange(nums,i,end);
	        		while(end >= start && nums[end] == 2) {
	        			end--;
	        		}
	        		if(start >= end) break;
	        	}
        	}
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = {2,1,1,2,0,0,1,0,1,2,1,0,0,2,1,2};
		int[] nums = {2,2,0};
		sortColors(nums);
		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i] + " ");
		}
	}

}
