import java.util.ArrayList;
import java.util.List;


public class PascalsTriangleII {
    static public List<Integer> getRow(int rowIndex) {
    	List<Integer> re = new ArrayList<Integer>();
    	
    	int[] tmp = new int[rowIndex + 1];
    	
    	for(int i = 0;i < rowIndex + 1;i++){
    		for(int j = i;j >= 0;j--){
    			if(j == i || j == 0) tmp[j] = 1;
    			else tmp[j] = tmp[j] + tmp[j - 1];
    		}
    	}
    	
    	for(int k = 0;k <= rowIndex;k++)
    		re.add(tmp[k]);
    	return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRow(5));
	}

}
