
public class SearchInsertPosition {
	static public int search(int[] nums,int beg,int end,int target){
		if(beg == end){
			if(nums[beg] < target) return beg + 1;
			else return beg;
		}
		
		int mid = (beg + end) / 2;
		
		if(nums[mid] < target) return search(nums,mid + 1,end,target);
		else if(nums[mid] > target) return search(nums,beg,mid,target);
		else return mid;
	}
	
    static public int searchInsert(int[] nums, int target) {
    	int beg = 0,end = nums.length - 1;
        if(nums[0] > target) return 0;
        else if(nums[nums.length - 1] < target) return nums.length;
        
    	return search(nums,beg,end,target);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		System.out.println(searchInsert(nums,5));//5 ¡ú 2
		System.out.println(searchInsert(nums,2));//2 ¡ú 1
		System.out.println(searchInsert(nums,7));//7 ¡ú 4
		System.out.println(searchInsert(nums,0));//0 ¡ú 0
	}

}
