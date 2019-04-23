import java.util.Stack;


public class MaximalRectangle {
	static public int findLargestRectangle(int[] heights){
        int len = heights.length;
        Stack<Integer> s = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0; i <= len; i++){
            int h = (i == len ? 0 : heights[i]);
            if(s.isEmpty() || h >= heights[s.peek()]){
                s.push(i);
            }else{
                int tp = s.pop();
                int w = s.isEmpty() ? i : i - 1 - s.peek();
                maxArea = Math.max(maxArea, heights[tp] * w);
                i--;
                
            }
        }
        return maxArea;
	}
	
	static public int maximalRectangle(char[][] matrix) {
        int max = 0;
        if(matrix.length == 0) return max;
        int[] heights = new int[matrix[0].length];
        
        for(int i = 0;i < matrix.length;i++){
        	for(int j = 0;j < matrix[0].length;j++){
        		if(matrix[i][j] == '0') heights[j] = 0;
        		else heights[j]++;
        	}
        		
    		int tmp = findLargestRectangle(heights);
    		max = max > tmp ? max : tmp;
        }
        return max;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = {  {'1','0','1','0','0'},
		{'1','0','1','1','1'},
		{'1','1','1','1','1'},
		{'1','0','0','1','0'}};
		
		System.out.println(maximalRectangle(matrix));
	}

}
