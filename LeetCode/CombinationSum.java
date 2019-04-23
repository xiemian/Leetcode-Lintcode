import java.util.*;

public class CombinationSum {
	static public void combine(int[] candidates,List<Integer> re,int index, int sum,int target,List<List<Integer>> result){
		for(int i = index;i < candidates.length;i++){
			int cc = candidates[i];
			if(sum + cc < target){
				re.add(cc);
				combine(candidates,re,i,sum + cc,target,result);
				re.remove(new Integer(cc));			
			}else if(sum + cc == target){
				re.add(cc);
				result.add(new ArrayList<Integer>(re));
				re.remove(new Integer(cc));
				return;
			}else return;
			
		}
	}
	
    static public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	List<Integer> re = new ArrayList<Integer>();
    	Arrays.sort(candidates);
    	combine(candidates,re,0,0,target,result);
    	return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cand = {2, 3, 6, 7};
		int target = 7;
		for(List<Integer> ll : combinationSum(cand,target)){
			System.out.println(ll);
		}
		/*List<Integer> re = new ArrayList<Integer>();
		re.add(10);
		re.add(101);
		re.add(102);
		re.add(10);
		System.out.println(re);
		re.remove(new Integer(10));
		System.out.println(re);*/
	}

}
