import java.util.Stack;




public class SimplifyPath {

    static public String simplifyPath(String path) {
        String res = "";
        String temp = "";
        int len = path.length();
        Stack<String> stack = new Stack<String>();
        
        for(int i = 0;i < len;i ++){
        	char c = path.charAt(i);
        	if(c == '/'){
        		
    			if(temp == "") continue;
    			else{
    				System.out.print(temp);
    				if(temp.equals("..") ) {
    					if(!stack.isEmpty())
    						stack.pop();
    				}else if(temp.equals(".")) {}
    				else {
    					System.out.println(" " + temp);
    					stack.push(temp);
    				}
    				temp = "";
    			}
        	
        	}else{
        		temp += c;
        	}
        }
        if(!temp.isEmpty()){
        	if(temp.equals("..") ) {
				if(!stack.isEmpty())
					stack.pop();
			}else if(temp.equals(".")) {}
			else {
				System.out.println(" " + temp);
				stack.push(temp);
			}
        }
        for(String s : stack){
        	res += '/';
        	res += s;
        }
        if(res.isEmpty()) res = "/";
        
        return res;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "/home/foo/./bar/";
		System.out.println(simplifyPath(test));
	}

}
