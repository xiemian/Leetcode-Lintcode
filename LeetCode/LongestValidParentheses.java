import java.util.*;

public class LongestValidParentheses {
	static public int longestValidParentheses(String s) {
		int re = 0,len = 0,count = 0;
		Stack<Integer> st = new Stack<Integer>();
		boolean[] b = new boolean[s.length()];
		/*for(int i = 0;i < s.length();i++){
			b[i] = false;
		}*/
		for(int i = 0;i < s.length();i++){
			char cc = s.charAt(i);
			if(cc == '('){
				st.push(i);
			}else if(cc == ')' && !st.isEmpty()){
				count++;
				b[i] = true;
				b[st.peek()] = true;
				st.pop();
			}
		}
		if(count == 0) return 0;
		for(int i = 0;i < b.length;i++){
			System.out.print(b[i] + " ");
			if(b[i] == true){
				len++;
			}else if(len != 0){
				re = len > re?len:re;
				System.out.println(len);
				len = 0;
			}			
		}
		re = len > re?len:re;
		return re;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "())";
		System.out.print(longestValidParentheses(s));
	}

}
