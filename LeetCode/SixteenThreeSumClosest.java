import java.util.*;

public class SixteenThreeSumClosest {
    static public int twoSum(int[] nums, int begin, int end, int target) {
    	int min = Integer.MAX_VALUE;
    	int result = 0;
    	
    	while(begin < end){
    		int be = nums[begin],en = nums[end];
    		int sum = be + en;
    		if(sum > target){
    			end--;
    			if(sum - target < min) {
    				min = sum - target;
    				result = sum;
    			}
    		}else if(sum < target){
    			begin++;
    			int re = target - sum;
    			if(re < min) {
    				min = re;
    				result = sum;
    			}
    		}else return target;
    	}
    	
        return result; 
     }	
	
    static public int threeSumClosest(int[] nums,int target) {
        int min = Integer.MAX_VALUE;
        int result = 0;

        Arrays.sort(nums);
        
        for(int i = 0;i < nums.length - 2;i++){
        	int a = nums[i];
        	int begin = i + 1,end = nums.length - 1;
        	int sum = twoSum(nums,begin,end,target - a) + a;
        	//System.out.println(sum);
        	if(Math.abs(target - sum) < min) {
        		min = Math.abs(target - sum);
        		result = sum;       		
        	}
        }
       
        return result;      
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,2};
		int target = 1;
		System.out.println(threeSumClosest(a,target));
	}
}
