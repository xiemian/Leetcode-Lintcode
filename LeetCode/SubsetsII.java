import java.util.*;
public class SubsetsII {
	static public void subsets(List<List<Integer>> re,int len,List<Integer> tmp,int[] nums,int index){
		//System.out.print(len + " ");
		if(tmp.size() == len) {
			re.add(new ArrayList<Integer>(tmp));
			return;
		}
		for(int i = index;i < nums.length - len + 1 + tmp.size();i++){
			if(i != 0 && nums[i] == nums[i - 1] && i != index) continue;
			tmp.add(nums[i]);
			
			subsets(re,len,tmp,nums,i + 1);
			tmp.remove(tmp.size() - 1);
		}
		
		return;
	}
	
    static public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> re = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        re.add(tmp);
        if(nums.length == 0) return re;
        Arrays.sort(nums);
        
        for(int i = 0;i < nums.length;i++){
        	tmp.clear();
        	subsets(re,i + 1,tmp,nums,0);
        }
        
        
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		for(List<Integer> ll : subsetsWithDup(nums)){
				System.out.println(ll);		
		}
	}

}
