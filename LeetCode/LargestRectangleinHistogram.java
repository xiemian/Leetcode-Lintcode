import java.util.Stack;



public class LargestRectangleinHistogram {
    static public int largestRectangleArea(int[] heights) {
/*    	if(heights.length == 0) return 0;
        int index = 1;
        int max = heights[0];
        
        
        while(index < heights.length){
        	while(index + 1 < heights.length && heights[index] < heights[index + 1]) index++;
        	for(int i = index;i > -1;i--){
        		int start = i;
        		while(start > 0 && heights[start - 1] >= heights[i]) start--;
        		max = heights[i] * (index - start + 1) > max?heights[i] * (index - start + 1):max;
        		System.out.println(max + " " + start + " " + index + " " + heights[i]);
        		i = start;
        	}

        	index++;
        }
        
        return max;*/
        int len = heights.length;
        Stack<Integer> s = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0; i <= len; i++){
            int h = (i == len ? 0 : heights[i]);
            if(s.isEmpty() || h >= heights[s.peek()]){
                s.push(i);
                System.out.println("push i =" + i);
            }else{
                int tp = s.pop();
                int w = s.isEmpty() ? i : i - 1 - s.peek();
                maxArea = Math.max(maxArea, heights[tp] * w);
                i--;
                System.out.println("tp =" + tp + ",heights[tp] =" + heights[tp] + ",w = " + w + ",max = " + maxArea);
            }
        }
        return maxArea;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = {3,2,1,5,6,2,3};
		//int[] heights = {4,2};
		System.out.print(largestRectangleArea(heights));
	}

}
