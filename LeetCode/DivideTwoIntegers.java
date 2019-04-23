
public class DivideTwoIntegers {
    static public int divide(int dividend, int divisor) {
        int t = 0;
        long divid = 0,divis = 0,k = 0,temp = 0;
        boolean flag = false;
        if(dividend < 0 && divisor > 0) flag = true;
        else if(dividend > 0 && divisor < 0) flag = true;
        
        divid = Math.abs((long)dividend);
        divis = Math.abs((long)divisor);
        
        System.out.println("divis:" + divis + " divid:" + divid);	
        if(divis >= Integer.MAX_VALUE){
        	if(divid > divis){
        		if(flag) return -1;
        		else return 1;
        	}else return 0;
        }
        
        //if(divid > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        
        divisor = Math.abs(divisor);
        
        if(divisor == 1){
			if(flag) {
				return (int)(0 - divid);
			}
			else {
				if(divid > Integer.MAX_VALUE) return Integer.MAX_VALUE;
				else return (int)divid;
			}
        }
        
        	
		while(true) {
			temp = divisor;
			if(temp <= divid){
				System.out.println("here1");		
				while(temp <= divid) {
					temp = temp << 1;
					t++;
					System.out.print(temp + " " + t + ";");
				}
				System.out.println();

					divid -= temp >> 1;
					k += Math.pow(2,t - 1);
					if(k > Integer.MAX_VALUE) {
		        		return Integer.MAX_VALUE;
					}
					t = 0;

			}else {
				if(flag) return 0 - (int)k;
				else return (int)k;
			}
		}   	
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(-2147483648,-1));
		//System.out.println(Math.abs((double)-2147483648));
	}

}
