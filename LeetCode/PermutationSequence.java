
import java.util.ArrayList;
import java.util.List;


public class PermutationSequence {

    static public String getPermutation(int n, int k) {
    	List<Integer> list = new ArrayList<Integer>();
    	String result = "";int tmp = 1;
    	
    	for(int i = 1;i <= n;i++){
    		list.add(i);
    		tmp *= i;
    	}    	
    	
    	//for(int i:list){
    	//	System.out.println(i);
    	//}
    	k--;
    	for(int i = n;i > 0;i--){
    		tmp /= i;
    		int index = k / tmp;
    		k = k % tmp;
    		result += list.remove(index);
    		//System.out.println("*************");
        	//for(int j:list){
        	//	System.out.println(j);
        	//}
    		//System.out.println(tmp + " " + index + " " + k + " " + result);
    	}
    	
    	
    	return result;
    }
    
	public static void main(String[] args) {
		int n = 4,k = 17;
		System.out.println(getPermutation(n,k));
	}

}
