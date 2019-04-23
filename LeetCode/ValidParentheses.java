import java.util.*;

public class ValidParentheses {
    static public boolean isValid(String s) {
    	if(s == "") return true;
    	Stack<Character> ss = new Stack<Character>();
    	for(int i = 0; i < s.length();i++){
    		char c = s.charAt(i);
    		if(c == '(' || c == '[' || c == '{') ss.push(c);
    		else if(c == ')') {
    			if(ss.size() == 0 || ss.pop() != '(') return false ;
    		}
    		else if(c == ']') {
    			if(ss.size() == 0 || ss.pop() != '[') return false ;
    		}
    		else if(c == '}') {
    			if(ss.size() == 0 || ss.pop() != '{') return false ;
    		}
    	}
    	
    	return ss.size() == 0;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "adfsdf(fds)[dfsdf{22}ds]";
		System.out.println(isValid(s));
	}

}
