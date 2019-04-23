import java.util.*;
public class GenerateParentheses {
    static public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        int index = 0,num1 = 0,num2 = 0;
        char[] re = new char[2 * n];
        
        gen(re,index,n,num1,num2,result);
        
        
        return result;
    }
    
    static public void gen(char[] re,int index,int n,int num1,int num2,List<String> result){
    	if(index == 2 * n) {
    		result.add(new String(re));
    		return;
    	}
    	
    	if(num1 < n){
			if(num1 == num2) {
				re[index] = '(';
				gen(re,index + 1,n,num1 + 1,num2,result);
			}else{
				//for(int i = 0;i < 2;i++){
				//	if(i == 0){
						re[index] = '(';
						gen(re,index + 1,n,num1 + 1,num2,result);
				//	}else{
						re[index] = ')';
						gen(re,index + 1,n,num1,num2 + 1,result);
				//	}
				//}
			}
    	}else{
			re[index] = ')';
			gen(re,index + 1,n,num1,num2 + 1,result);
    	}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> head = generateParenthesis(n);
		
		for(String s : head) {
			System.out.println(s);
		}
	}

}
