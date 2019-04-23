
public class SingleNumber {
	static	public int singleNumber(int[] nums) {
        int re = nums[0];
		for(int i = 1;i < nums.length;i++){
        	re = re ^ nums[i];
        }
		return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,2,1};
		int[] b = {4,1,2,1,2};
		System.out.println(singleNumber(a));
		System.out.println(singleNumber(b));
	}

}
