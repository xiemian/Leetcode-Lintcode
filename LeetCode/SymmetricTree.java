import java.util.Stack;


public class SymmetricTree {
	 static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
	 static public boolean isSymmetricBoth(TreeNode root1,TreeNode root2){
		 if(root1 == null && root2 == null) return true;
		 if((root1 == null && root2 != null) || (root2 == null && root1 != null)) return false;
		 
		 if(root1.val != root2.val) return false;
		 if(!isSymmetricBoth(root1.left,root2.right)) return false;
		 if(!isSymmetricBoth(root1.right,root2.left)) return false;
		 
		 return true;
	 }
	 
	 static public boolean isSymmetric(TreeNode root) {
		 if(root == null) return true;
		 
		 TreeNode left = root.left;
		 TreeNode right = root.right;

		 return isSymmetricBoth( left, right);
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(2);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(4);
		
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn4;
		tn3.right = tn1;
		
		System.out.println(isSymmetric(tn1));
	}

}
