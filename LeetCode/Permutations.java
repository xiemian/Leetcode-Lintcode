import java.util.*;


public class Permutations {
    static public void permute2(int[] nums,int len,List<List<Integer>> ll,List<Integer> ls){
    	if(ls.size() == len){
    		ll.add(new ArrayList<Integer>(ls));
    		//System.out.println(ls + " " + len);
    		return;
    	}
    	
    	for(int i = 0;i < len;i++){
    		if(ls.contains(nums[i])) continue;
    		ls.add(nums[i]);
    		//System.out.println("ls add " + nums[i]);
    		permute2(nums,len,ll,ls);
    		ls.remove(ls.size() - 1);
    	}
    }
	
	static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        int len = nums.length;
        List<Integer> ls = new ArrayList();       
        permute2(nums,len,ll,ls);
        
        return ll;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = {1,2,3};
		for(List<Integer> l : permute(p)){
			System.out.println(l);
		}
	}

}
