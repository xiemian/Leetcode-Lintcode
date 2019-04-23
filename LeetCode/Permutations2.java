import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Permutations2 {
 /*   static public void permute2(int[] nums,int len,List<List<Integer>> ll,
    		List<Integer> ls,List<Integer> ind){
    	if(ls.size() == len && !ll.contains(ls)){
    		ll.add(new ArrayList<Integer>(ls));
    		//System.out.println(ls + " " + len);
    		return;
    	}
    	
    	for(int i = 0;i < len;i++){
    		if(ind.contains(i)) continue;
    		ls.add(nums[i]);
    		ind.add(i);
    		//System.out.println("ls add " + nums[i]);
    		permute2(nums,len,ll,ls,ind);
    		ls.remove(ls.size() - 1);
    		ind.remove(ind.size() - 1);
    	}
    }
	
	static public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        int len = nums.length;
        List<Integer> ls = new ArrayList();
        List<Integer> ind = new ArrayList();
        Arrays.sort(nums);
        permute2(nums,len,ll,ls,ind);
        
        return ll;
    }*/
	
	public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
		ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
		returnList.add(new ArrayList<Integer>());
	 
		for (int i = 0; i < num.length; i++) {
			Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
			for (List<Integer> l : returnList) {
				for (int j = 0; j < l.size() + 1; j++) {
					l.add(j, num[i]);
					ArrayList<Integer> T = new ArrayList<Integer>(l);
					l.remove(j);
					currentSet.add(T);
					//System.out.println(T);
				}
			}
			returnList = new ArrayList<ArrayList<Integer>>(currentSet);
		}
	 
		return returnList;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] p = {1,1,2};
		int[] p = {-1,2,-1,2,1,-1,2,1};
		for(List<Integer> l : permuteUnique(p)){
			System.out.println(l);
		}
	}

}
