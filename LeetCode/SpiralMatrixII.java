import java.util.*;


public class SpiralMatrixII {
    static public int[][] generateMatrix(int n) {
       int[][] matrix = new int[n][n];
       
       int row = n,col = n,index = 1,rowIndex = 0,colIndex = 0;
       while(true){
    	   if(row > 0 && col > 0){
    		   for(int i = 0;i < col;i++){
    			   matrix[rowIndex][colIndex] = index;
    			   colIndex++;index++;
    		   }
    		   row--;rowIndex++;colIndex--;
    	   }else break;
    	   
    	   if(row > 0 && col > 0){
    		   for(int i = 0;i < row;i++){
    			   matrix[rowIndex][colIndex] = index;
    			   rowIndex++;index++;
    		   }
    		   col--;rowIndex--;colIndex--;
    	   }else break;
    	   
    	   if(row > 0 && col > 0){
    		   for(int i = 0;i < col;i++){
    			   matrix[rowIndex][colIndex] = index;
    			   colIndex--;index++;
    		   }
    		   row--;rowIndex--;colIndex++;
    	   }else break;
    	   
    	   if(row > 0 && col > 0){
    		   for(int i = 0;i < row;i++){
    			   matrix[rowIndex][colIndex] = index;
    			   rowIndex--;index++;
    		   }
    		   col--;rowIndex++;colIndex++;
    	   }else break;
       }
       
       return matrix;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] matrix = {
		//		{ 1, 2, 3 },
		//		{ 4, 5, 6 },
		//		{ 7, 8, 9 }
		//};
		int n = 1;
		int[][] matrix = generateMatrix(n);
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				System.out.print(matrix[i][j] + " ");	
			}
			System.out.println();
		}
	}

}
