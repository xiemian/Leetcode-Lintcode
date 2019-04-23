
public class UniquePaths {
	

	
	static public int uniquePaths(int m, int n) {       
	   
	        // Advanced: DP with 1 dimension array  
	        int row = Math.min(m, n);  
	        int col = Math.max(m, n);  
	        int[] a = new int[col];  
	        for (int j = 0; j < col; j++) {  
	            a[j] = 1;  
	        }  
	        for (int i = 1; i < row; i++) {  
	            a[i] *= 2;  
	            for (int j = i+1; j < col; j++) {  
	                a[j] += a[j-1];  
	            }  
	        }  
	        return a[col-1]; 
		
	
      
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(uniquePaths(3,7));
	}

}
