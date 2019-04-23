import java.util.*;

public class TrappingRainWater {

	
    static public int trap(int[] height) {
    	int n = height.length;
    	if(n <= 2) return 0;
        int max = -1, maxInd = 0;
        int i = 0;
        for(; i < n; ++i){
            if(height[i] > max){
                max = height[i];
                maxInd = i;
            }
        }
        int area = 0, root = height[0];
        for(i = 0; i < maxInd; ++i){
            if(root < height[i]) root = height[i];
            else area += (root - height[i]);
        }
        for(i = n-1, root = height[n-1]; i > maxInd; --i){
            if(root < height[i]) root = height[i];
            else area += (root - height[i]);
        }
        return area;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		//int[] height = {4,2,3};
		//int[] height = {5,4,1,2};
		int[] height = {5,2,1,2,1,5};
		System.out.println(trap(height));
	}

}
