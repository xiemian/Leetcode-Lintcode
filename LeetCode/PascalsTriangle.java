import java.util.*;


public class PascalsTriangle {
    static public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> re = new ArrayList<List<Integer>>();
    	
    	if(numRows == 0) return re; 
    	
    	for(int i = 0;i < numRows;i++){
    		List<Integer> tmp = new ArrayList<Integer>();
    		for(int j = 0;j <= i;j++){
    			if(j == 0) tmp.add(1);
    			else if(j == i) tmp.add(1);
    			else if(i > 1){
    				tmp.add(re.get(i - 1).get(j - 1) +  re.get(i - 1).get(j));
    			}
    		}
    		re.add(tmp);
    	}
    	
    	return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(List<Integer> ls : generate(5)){
			System.out.println(ls);
		}
	}

}
