
public class SearchForARange {
	static public int search(int[] nums,int beg,int end,int target,boolean dir){
		if(beg == end) return beg;
		int mid = (beg + end) / 2;
		
		if(!dir){
			if(nums[mid] < target){
				return search(nums,mid + 1,end,target,dir);
			}else{
				return search(nums,beg,mid,target,dir);
			}
		}else{
			if(nums[mid] > target){
				return search(nums,beg,mid - 1,target,dir);
			}else{
				if(end - beg == 1){
					return nums[end] == target?end:beg;
				}
				return search(nums,mid,end,target,dir);
			}
		}
	}
	
    static public int[] searchRange(int[] nums, int target) {
        int[] re = {-1,-1};
        int beg = 0,end = nums.length - 1;
        if(nums[beg] > target || nums[end] < target) return re;  
        
        while(beg <= end){
        	int mid = (beg + end) / 2;
        	if(nums[mid] > target) {
        		if(mid > beg) end = mid - 1;
        		else return re;
        	}
        	else if(nums[mid] < target) {
        		if(mid < end) beg = mid + 1;
        		else return re;
        		
        	}
        	else {
        		re[0] = search(nums,beg,mid,target,false);
        		re[1] = search(nums,mid,end,target,true);
        		return re;
        	}
        }
        
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {5, 7, 7,7,7, 8, 8, 10};
		int[] re = searchRange(num,7);
		System.out.println(re[0] + " " + re[1]);
	}

}
