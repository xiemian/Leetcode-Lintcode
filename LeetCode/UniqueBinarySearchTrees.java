
public class UniqueBinarySearchTrees {
    static public int numTrees(int n) {
    	if(n < 0) return 0;
        int[] re = new int[n + 1];
        re[0] = 1;
        re[1] = 1;
        
        for(int i = 2;i <= n;i++){
        	for(int j = 0;j < i;j++){
        		re[i] += re[j] * re[i - j - 1];
        	}
        	
        }
        
        return re[n];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(numTrees(n));
	}

}
