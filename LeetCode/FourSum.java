import java.util.*;
import java.util.Map.Entry;


public class FourSum {

	
	static class Pair{
		private int pair1,pair2,index1,index2;
		Pair(int a,int b,int indexa,int indexb){
			pair1 = (a <= b)?a:b;
			index1 = indexa;
			pair2 = (a <= b)?b:a;
			index2 = indexb;
		}
		public boolean equals(Object p){
			return (this.pair1 == ((Pair)p).pair1 && this.pair2 == ((Pair)p).pair2);
		}
		
		boolean isSameIndexExist(Pair p){
			return (this.index1 == p.index1 || this.index1 == p.index2 || this.index2 == p.index1 || this.index2 == p.index2);
		}
		
		int getPair1(){
			return pair1;
		}
		
		int getPair2(){
			return pair2;
		}
		public String toString(){
			return pair1 +" " +  pair2 + " ";
		}
	}
	
    static public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashMap<Integer,List<Pair>> hashMap = new HashMap<Integer,List<Pair>>();
        
        Arrays.sort(nums);
        
        for(int i = 0;i < nums.length;i++){
        	for(int j = i + 1;j < nums.length;j++){
        		int sum = nums[i] + nums[j];
        		List<Pair> ls = hashMap.get(sum);
        		Pair temp = new Pair(nums[i],nums[j],i,j);
        		if(ls == null){
        			List<Pair> ll = new ArrayList<Pair>();        			
        			ll.add(temp);
        			hashMap.put(sum,ll);
        			//System.out.print("put:" + sum + " " + temp);
        		}else {//if(!ls.contains(temp)){
        			ls.add(temp);
        			//System.out.print("add:" + sum + " " + temp);
        		}//else {
        			//System.out.print("equal:" + sum + " " + temp);
        		//}
        		
        	}
        }
        System.out.println();
        Iterator<Entry<Integer, List<Pair>>> iter = hashMap.entrySet().iterator();
           			      
        while(iter.hasNext()){
        	Entry<Integer, List<Pair>> entry = iter.next();
        	int sum = entry.getKey();
        	List<Pair> val = entry.getValue();
        	
        	List<Pair> vv = hashMap.get(target - sum);
        	//System.out.println(sum + " " + (target - sum));
			//System.out.println("-------" + val);
			//System.out.println("+++++++" + vv);
			
        	if(vv != null){
        		
        		Iterator<Pair> valIter = val.iterator();


        		while(valIter.hasNext()){

            		int[] num = new int[4];
        			Pair valPair = valIter.next();
            		Iterator<Pair> vvIter = vv.iterator();
        			while(vvIter.hasNext()){
        				Pair vvPair = vvIter.next();
        				//System.out.println(valPair + " " + vvPair + "[[[");
        				if(valPair.isSameIndexExist(vvPair)) {
        					continue;
        				}
            			num[0] = valPair.getPair1();
            			num[1] = valPair.getPair2();
        				num[2] = vvPair.getPair1();
        				num[3] = vvPair.getPair2();
        				//System.out.println(num[0] + " " + num[1] + " " + num[2] + " " + num[3]);
        				Arrays.sort(num);
        				
                		List<Integer> ll = new ArrayList<Integer>();
        				ll.add(num[0]);
        				ll.add(num[1]);
        				ll.add(num[2]);
        				ll.add(num[3]);
        				if(!result.contains(ll))
        					result.add(ll);
        			}
        		}
        		
        	}
        }
        
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 0, -1, 0, -2, 2};
		//int[] nums = {0,0,0,0};
		int target = 0;
		//fourSum(nums,target);
		for(List<Integer> l : fourSum(nums,target)){
			System.out.println(l);
		}
		
	}

}
