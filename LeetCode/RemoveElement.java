
public class RemoveElement {
    static public int removeElement(int[] nums, int val) {
    	 int first = 0,second = 0;
         while(second < nums.length){
         	if(nums[second] == val){
         		second++;
         	}else{
         		if(first != second)
         			nums[first] = nums[second];
         		first++;
         		second++;
         	}
         }
         return first;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,4,4,4,7,9,9,9};
		int result = removeElement(nums,4);
		for(int i = 0;i < result;i++){
			System.out.print(nums[i] + " ");
		}
	}

}
