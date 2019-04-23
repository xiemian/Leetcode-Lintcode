
public class ElevenContainerWithMostWater {
    static public int maxArea(int[] height) {
    	int maxArea = 0,indexA = 0,indexB = height.length - 1;
    	int temp = 0,heightMin = 0;
    	boolean flag = true;
    	
    	while(true){
    		if(height[indexA] < height[indexB]){
    			heightMin = height[indexA];
    			flag = true;
    		}else{
    			heightMin = height[indexB];
    			flag = false;
    		}
    		temp =  (indexB - indexA) * heightMin;
    		if(temp > maxArea){
    			maxArea = temp;
    		}
    		
    		while(indexB - indexA > 1){
	    		if(!flag){
	    			indexB--;
	    			if(height[indexB] > heightMin) break;
	    		}else{
	    			indexA++;
	    			if(height[indexA] > heightMin) break;
	    		}
    		}
    		if(indexB - indexA == 1) break;
    	}
        return maxArea;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,2,4,3};
		System.out.println(maxArea(height));
	}

}
