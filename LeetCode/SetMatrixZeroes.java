
public class SetMatrixZeroes {
    static public void setZeroes(int[][] matrix) {
        boolean row1 = false,col1 = false;
        for(int i = 0;i < matrix[0].length;i++)
        	if(matrix[0][i] == 0) row1 = true;
        for(int i = 0;i < matrix.length;i++)
        	if(matrix[i][0] == 0) col1 = true;
        
		for(int i = 1;i < matrix.length;i++){
			for(int j = 1;j < matrix[0].length;j++)
			{
				if(matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
				
			}
		}
		
		for(int i = 1;i < matrix.length;i++){
			for(int j = 1;j < matrix[0].length;j++)
			{
				if(matrix[0][j] == 0 || matrix[i][0] == 0) {
					matrix[i][j] = 0;
				}
				
			}
		}
		
		if(row1){
	        for(int i = 0;i < matrix[0].length;i++)
	        	matrix[0][i] = 0;
		}
		
		if(col1){
	        for(int i = 0;i < matrix.length;i++)
	        	matrix[i][0] = 0;
		}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{0,1,2,0},
				{3,4,5,2},
				{1,3,1,5}};
		
		setZeroes(matrix);
		for(int i = 0;i < matrix.length;i++){
			for(int j = 0;j < matrix[0].length;j++)
			{
				System.out.print(matrix[i][j] + ",");
				
			}
			System.out.println();
		}
	}

}
