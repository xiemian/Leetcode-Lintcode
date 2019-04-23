
public class EightStringToInteger {
    static public int myAtoi(String str) {
        long t = 0;
        int flag = -1;
    	int max = 0x7fffffff;
    	System.out.println(max);
    	int min = 0x80000000;
    	int[] r = new int[10];
    	int index = 0;
    	
    	if(str == "") return 0;
    	
    	for(int i = 0;i < str.length();i++){
    		char tmp = str.charAt(i);
    		if(tmp == ' '){
    			if(flag == -1) continue;
    			else break;
    		}else if(tmp == '+'){
    			if(flag == -1) flag = 0;
    			else if(index == 0) return 0;
    			else break;
    		}else if(tmp == '-'){
    			if(flag == -1) flag = 1;
    			else if(index == 0) return 0;
    			else break;
    		}else if(tmp >='0' && tmp <= '9'){
    			if(flag == -1) flag = 0;
    			if(index == 10) {
    				if(flag == 0) return max;
    				else return min;
    			}
    			r[index] = tmp - '0';
    			index++;
    		}else{
    			if(index == 0) return 0;
    			else break;
    		}
    	}
    	
    	for(int i = index - 1;i >= 0;i--){
    		t += r[index - 1 - i] * Math.pow(10, i);
    	}
    	
    	if(flag == 1) t = 0 - t;
    	
    	if(t >= max) return max;
    	if(t < min) return min;
    	
    	return (int)t;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "-2147483648";
		System.out.println(myAtoi(s));
	}

}
