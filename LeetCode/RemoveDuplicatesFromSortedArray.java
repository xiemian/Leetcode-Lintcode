
public class RemoveDuplicatesFromSortedArray {
    static public int removeDuplicates(int[] nums) {
        int first = 1,second = 1;
        while(second < nums.length){
        	if(nums[second] == nums[second - 1]){
        		second++;
        	}else{
        		if(first != second)
        			nums[first] = nums[second];
        		first++;
        		second++;
        	}
        }
        return first;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,4,4,4,7,9,9,9};
		int result = removeDuplicates(nums);
		for(int i = 0;i < result;i++){
			System.out.print(nums[i] + " ");
		}
	}

}
