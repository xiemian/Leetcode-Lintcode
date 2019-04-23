import java.util.*;

public class FlattenBinaryTreetoLinkedList {
	static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
	static public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode guard = root,tmp;
        Stack<TreeNode> st = new Stack<TreeNode>();
        
        while(true){
        	if(root.right != null) st.push(root.right);
        	if(root.left != null) {
        		root.right = root.left;
        		tmp = root;
        		root = root.left;
        		tmp.left = null;
        	}else if(!st.isEmpty()){
        		root.right = st.pop();
        		root = root.right;
        	}else {
        		root = guard;
        		break;
        	}
        }
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		TreeNode tn6 = new TreeNode(6);
		
		tn1.left = tn2;
		tn1.right = tn5;
		tn2.left = tn3;
		tn2.right = tn4;
		tn5.right = tn6;
		
		flatten(tn1);
		while(tn1 != null){
			System.out.println(tn1.val);
			tn1 = tn1.right;
		}
	}

}
