
public class Search2DMatrix {
	static public int searchRow(int[][] matrix,int start,int end,int target){
		if(start == end) return start;
		if(end == start + 1){
			if(matrix[end][0] > target) return start;
			else return end;
					
		}
		int mid = (start + end) / 2;
		
		if(matrix[mid][0] > target) return searchRow(matrix,start,mid - 1,target);
		if(matrix[mid][0] < target) return searchRow(matrix,mid,end,target);
		
		return mid;
	}
	
	static public boolean searchCol(int[] matrix,int start,int end,int target){
		if(start > end) return false;
		int mid = (start + end) / 2;
		
		if(matrix[mid] == target) return true;
		else if(matrix[mid] < target) return searchCol(matrix,mid + 1,end,target);
		else return searchCol(matrix,start,mid - 1,target);
	}
	
	static public boolean searchMatrix(int[][] matrix, int target) {
		
        int rowLength = matrix.length;
        if(rowLength == 0) return false;
        int colLength = matrix[0].length;
        if(colLength == 0) return false;
        
        
        if(target < matrix[0][0] || target > matrix[rowLength - 1][colLength - 1]) return false;
        int rowNo = searchRow(matrix, 0, rowLength - 1,target);      
        System.out.println(rowNo);
        
        return searchCol(matrix[rowNo],0,colLength - 1,target);
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
		                  {1,   3,  5,  7},
		                  {10, 11, 16, 20},
		                  {23, 30, 34, 50}
		};
		System.out.println(searchMatrix(matrix,3));
		System.out.println(searchMatrix(matrix,13));
	}

}
