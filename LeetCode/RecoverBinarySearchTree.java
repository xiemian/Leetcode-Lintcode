
import java.util.*;

public class RecoverBinarySearchTree {
	 static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	 
	    static public void recoverTree(TreeNode root) {
	        TreeNode prevBig = null,afterSmall = null,prev = null,cur = null;
	        Stack<TreeNode> st = new Stack<TreeNode>();
	        
	        while(root != null || !st.empty()){
	        	while(root != null){
	        		st.push(root);
	        		root = root.left;
	        	}
	        	
	        	cur = st.pop();
	        	if(prev != null && prev.val > cur.val){
	        		if(prevBig == null) {
	        			prevBig = prev;afterSmall = cur;
	        		}else {
	        			afterSmall = cur;
	        			break;
	        		}
	        	}
	        	prev = cur;
	        	root = cur.right;
	        }
	        
	        int tmp = afterSmall.val;
	        afterSmall.val = prevBig.val;
	        prevBig.val = tmp;
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		
		tn1.left = tn2;
		tn1.right = tn3;
		
		recoverTree(tn1);
	}

}
