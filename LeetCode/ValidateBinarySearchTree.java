import java.util.*;

public class ValidateBinarySearchTree {
	 static public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		 }
	 
    static public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> st = new Stack<TreeNode>();
        Stack<Integer> ls = new Stack<Integer>();
        if(root == null) return true;
        while(root != null){
        	if(root.left != null){
        		st.push(root);
        		root = root.left;
        	}else{
        		ls.push(root.val);
        		if(root.right == null){
        			if(!st.empty()) root = st.pop();
        			else break;
        			root.left = null;
        		}else
        			root = root.right;
        	}
        }
        int prev,cur;
        if(!ls.empty()) prev = ls.pop();
        else return false;
        while(!ls.empty()) {
        	cur = ls.pop();
        	System.out.println("prev = " + prev + " cur = " + cur);
        	if(prev < cur) return false; 
        	prev = cur;
        }
        return true;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		
		tn2.left = tn1;
		tn2.right = tn3;
		
		System.out.println(isValidBST(tn2));
	}

}
