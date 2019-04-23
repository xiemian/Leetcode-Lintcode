import java.util.ArrayList;
import java.util.List;


public class Combinations {
	static public void calcuate(List<List<Integer>> re,List<Integer> tmp,int n,int k,int start){
		if(tmp.size() == k) {
			//System.out.println(tmp);
			List<Integer> tmp1 = new ArrayList<Integer>(tmp);
			re.add(tmp1);
			return;
		}
		for(int i = start;i < n - k + tmp.size() + 1;i++){
			tmp.add(i + 1);
			calcuate(re,tmp,n,k,i + 1);
			tmp.remove((Integer)(i + 1));
		}
	}
	
    static public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> re = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        
        calcuate(re,tmp,n,k,0);
        
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(List<Integer> l:combine(4,4)){
			System.out.println(l);
		}
	}

}
