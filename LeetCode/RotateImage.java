
public class RotateImage {
    static public void rotate(int[][] matrix) {
        int len = matrix.length;
        
        for(int i = 0;i < len / 2;i++){
        	for(int j = i;j < len - i - 1;j++){
        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[len - j - 1][i];
        		matrix[len - j - 1][i] = matrix[len - i - 1][len - j - 1];
        		matrix[len - i - 1][len - j - 1] = matrix[j][len - i - 1];
        		matrix[j][len - i - 1] = temp;
        	}
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{4,6,1},{9,0,2},{3,7,8}};
		
		for(int i = 0;i < matrix.length;i++){
			for(int j = 0;j < matrix.length;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		rotate(matrix);
		for(int i = 0;i < matrix.length;i++){
			for(int j = 0;j < matrix.length;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
