
public class Candy {
	static	public int candy(int[] ratings) {
        int len = ratings.length;
        if(len == 0) return 0;
        if(len == 1) return 1;
        int sum = 1,cur = 1,min = 1;
        
        for(int i = 1;i < len;i++){
        	if(ratings[i] > ratings[i - 1]) cur += 1;
        	else cur -= 1;
        	sum += cur;
        	if(cur < min) min = cur;
        }
        
        sum += (1 - min) * len;
        
        return sum;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,0,2};
		int[] b = {1,2,2};
		System.out.println(candy(a));
		System.out.println(candy(b));
	}

}
