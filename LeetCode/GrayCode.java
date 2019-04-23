import java.util.ArrayList;
import java.util.List;


public class GrayCode {
    static public List<Integer> grayCode(int n) {
        List<Integer> re = new ArrayList<Integer>();
        if(n == 0) {
        	re.add(0);
        	return re;
        }
        int[] tmp = new int[1 << n];
        tmp[0] = 0;
        int indexCur = 0;
        int indexPos = indexCur + 1;
        
        for(int i = 0;i < n;i++){
        	while(indexCur >= 0){

        		tmp[indexPos] = tmp[indexCur] + (1 << i);
        		//System.out.print(indexCur + " " + tmp[indexCur] + " " + indexPos + " " + tmp[indexPos]);
        		//System.out.println();
        		indexPos++;
        		indexCur--;
        	}
        	indexCur = indexPos - 1;
         }
        
        for(int i = 0;i < tmp.length;i++)
        	re.add(tmp[i]);
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int ll : grayCode(3)){
			System.out.print(ll + " ");
		}
	}

}
