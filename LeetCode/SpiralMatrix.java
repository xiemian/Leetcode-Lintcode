import java.util.*;


public class SpiralMatrix {
    static public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> re = new ArrayList<Integer>();
        
        int rowNum = matrix.length;
        if(rowNum == 0) return re;
        int colNum = matrix[0].length;
        int sR = 0,sC = -1;
        while(true){
        	
        	if(rowNum <= 0) break;
        	for(int i = 0;i < colNum;i++)
        		re.add(matrix[sR][++sC]);
        	rowNum--;        	
        	//System.out.println("SC = " + sC + " " + colNum);
        	
        	if(colNum <= 0) break;
        	for(int i = 0;i < rowNum;i++)
        		re.add(matrix[++sR][sC]);
        	colNum--;
        	//System.out.println("SR = " + sR + " " + rowNum);
        	if(rowNum <= 0) break;
        	for(int i = 0;i < colNum;i++)
        		re.add(matrix[sR][--sC]);
        	rowNum--;        	
        	//System.out.println("SC = " + sC + " " + colNum);
        	if(colNum <= 0) break;
        	for(int i = 0;i < rowNum;i++)
        		re.add(matrix[--sR][sC]);
        	colNum--;
        	//System.out.println("SR = " + sR + " " + rowNum);
        }
        
        return re;
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
		int[][] matrix = {{2,3}};
		System.out.println(spiralOrder(matrix));
	}

}
