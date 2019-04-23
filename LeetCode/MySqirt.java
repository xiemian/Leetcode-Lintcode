
public class MySqirt {
		
	static public int mySqrt(int x) {
        int re = 0,len = 0,tmp = x,minlen = 0,maxlen = 0,min = 0,max = 0;
        
        while(tmp != 0){
        	tmp = tmp >> 1;
        	len++;
        }
        System.out.println(len);
        minlen = len / 2;
        if(len % 2 != 0)
        	maxlen = len / 2 + 1;
        else
        	maxlen = minlen;
        System.out.println(minlen + " " + maxlen);
        for(int i = 0;i < minlen;i++){
        	if(i == 0) min = 1;
        	else min = min << 1;
        }
        
        for(int i = 0;i < maxlen;i++){
        	if(i == 0) max = 1;
        	else max = max << 1 | 1;
        }
        System.out.println(min + " " + max);
        System.out.println(x);
        for(int i = min;i <= max;i++){
        	double t = (double)i * (double)i;
        	if(i == 65534)  System.out.println(t + " " + x);
        	re = i;
        	if(t == x) return i;
        	if(t > x) return i - 1;
        }
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2147483647;
		System.out.println(mySqrt(x));
	}

}
