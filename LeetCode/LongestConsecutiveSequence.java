import java.util.HashSet;
import java.util.Set;


public class LongestConsecutiveSequence {
    static public int longestConsecutive(int[] nums) {
    	int max = 0;
       	Set<Integer> set = new HashSet<Integer>();
        for(int i = 0;i < nums.length;i++){
        	set.add(nums[i]);
        }
        int cur,tmpLen;
        for(int i = 0;i < nums.length;i++){
        	cur = nums[i];
        	tmpLen = 1;
        	while(set.contains(cur - 1)){
        		tmpLen++;
        		cur = cur - 1;
        		set.remove(cur);
        	}
        	cur = nums[i];
        	while(set.contains(cur + 1)){
        		tmpLen++;
        		cur = cur + 1;
        		set.remove(cur);
        	}
        	if(tmpLen > max) max = tmpLen;
        }
        return max;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100, 4, 200, 1, 3, 2};
		System.out.println(longestConsecutive(nums));
	}

}
