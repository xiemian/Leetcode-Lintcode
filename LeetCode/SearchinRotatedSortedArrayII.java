
public class SearchinRotatedSortedArrayII {
	public boolean search(int[] nums, int target)  {  
        int l = 0;  
        int r = nums.length - 1;  
        while (l <= r) {  
        	int mid = (l + r) / 2;  
            if (target == nums[mid]) return true;
            
            if (nums[l] < nums[r]) {  
                if (target < nums[mid]) r = mid - 1;  
                else l = mid + 1;  
            } else if (nums[l] == nums[r]) {  
            	l++;
            	if(l == r) return false;
            }else if (nums[l] <= nums[mid]) {  
                if (target > nums[mid] || target < nums[l]) l = mid + 1;  
                else r = mid - 1;  
            } else {  
                if (target < nums[mid] || target > nums[r]) r = mid - 1;  
                else l = mid + 1;  
            }  
        }  
        return false;  
    } 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
