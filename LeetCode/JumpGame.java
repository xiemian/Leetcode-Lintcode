
public class JumpGame {
	static public boolean canJump(int[] nums) {
		int ind = 0;
		int max = 0;
		int step,value,tmpInd = 0;
		boolean flag;
		
		if(nums.length == 0) return false;
		if(nums.length == 1) return true;
		
		do{
			flag = false;
			step = nums[ind];
			if(step == 0) return false;
			for(int i = 0;i < step;i++){
				
				value = nums[ind + i + 1] + ind + i + 1 ;
				//System.out.println(value);
				if(value >= (nums.length - 1)) return true;
				if(value > max){
					max = value;
					tmpInd = ind + i + 1;
					flag = true;
				}
			}
			ind = tmpInd;
		}while(flag);
		
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,0,0};
		System.out.println(canJump(a));
	}

}
