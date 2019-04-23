
public class minPathSum {
    static public int minPathSum(int[][] grid) {
    	 int row = grid.length;
         int col = grid[0].length;
         
         for(int i = 1;i < col;i++){
        	 grid[0][i] += grid[0][i - 1];
         }
         for(int i = 1;i < row;i++){
        	 grid[i][0] += grid[i - 1][0];
         }
         
         for(int i = 1;i < row;i++){
         	for(int j = 1;j < col;j++){
         		grid[i][j] += grid[i - 1][j] < grid[i][j - 1]?grid[i - 1][j]:grid[i][j - 1];
         	}
         }
         return grid[row - 1][col - 1];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,3,1},
		                  {1,5,1},
		                  {4,2,1}};
		
		System.out.println(minPathSum(grid));
	}

}
