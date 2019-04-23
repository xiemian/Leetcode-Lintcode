
public class MultiplyStrings {
    static	public String multiply(String num1, String num2) {
        int l1 = num1.length(),l2 = num2.length(),ll = l1 + l2,mul1,mul2,temp1,temp2,nn = 0,yu = 0;
        int[] intll = new int[ll];
        String re = "";
        boolean flag = false;
    
        for(int i = l1 - 1;i >= 0;i--){
        	mul1 = num1.charAt(i) - '0';
        	for(int j = l2 - 1;j >= 0;j--){
             	mul2 = num2.charAt(j) - '0';
             	temp1 = mul1 * mul2;
             	nn = temp1 % 10;
             	temp2 = intll[i + j + 1] + nn + yu;
             	//System.out.println("intll:" + (i + j + 1) + "=" + temp2);
             	intll[i + j + 1] = temp2 % 10;
             	yu = temp1 / 10 + temp2 / 10;
            }

        	intll[i] += yu;
        	temp1 = 0;
			temp2 = 0;
			yu = 0;
        }
        
        for(int i = 0;i < ll;i++){
        	//System.out.print(intll[i] + " ");
        	if(!flag){
        		if(intll[i] == 0) continue;
        		else flag = true;
        	}
        	re += intll[i];
        }
        
        if(!flag) return "0";
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "10";
		String num2 = "0";
		System.out.println(multiply(num1,num2));
	}

}
