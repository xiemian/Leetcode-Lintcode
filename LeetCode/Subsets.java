import java.util.ArrayList;
import java.util.List;


public class Subsets {
	static public void calcuate(List<List<Integer>> re,List<Integer> tmp,int[] nums,int start){
		List<Integer> tmp1 = new ArrayList<Integer>(tmp);
		re.add(tmp1);
		//if(tmp.size() == nums.length) return;
		
		for(int i = start;i < nums.length;i++){
			tmp.add(nums[i]);
			calcuate(re,tmp,nums,i + 1);
			tmp.remove((Integer)nums[i]);
		}
	}
	
    static public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> re = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        
       
        calcuate(re,tmp,nums,0);
       
        
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		for(List<Integer> l:subsets(nums)){
			System.out.println(l);
		}
	}

}
