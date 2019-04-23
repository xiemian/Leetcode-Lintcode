import java.util.*;

public class FifteenThreeSum {
    static public List<List<Integer>> twoSum(int[] nums, int begin, int end, int ttarget) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>(); 
        int target = 0 - ttarget;
    	while(begin < end){
    		int be = nums[begin],en = nums[end];
    		if(be + en > target){
    			end--;
    		}else if(be + en < target){
    			begin++;
    		}else{
    			List<Integer> re = new ArrayList<Integer>();
    			re.add(ttarget);
    			re.add(be);
    			re.add(en);
    			result.add(re);
    			while(begin < end && be == nums[begin + 1]) begin++;
    			while(begin < end && en == nums[end - 1]) end--;
				begin++;
				end--;
    		}
    	}
    	
        return result; 
     }	
	
    static public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        
        for(int i = 0;i < nums.length - 2;i++){
        	int a = nums[i];
        	if(a > 0) return ll;
        	if(i > 0 && nums[i] == nums[i - 1]) continue;
        	int begin = i + 1,end = nums.length - 1;
        	List<List<Integer>> ls = twoSum(nums,begin,end,a);
        	if(ls != null) ll.addAll(ls);
        }
       
        return ll;      
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1, 0, 1, 2, -1, -4};
		for(List l : threeSum(a)){
			System.out.println(l);
		}
	}

}
