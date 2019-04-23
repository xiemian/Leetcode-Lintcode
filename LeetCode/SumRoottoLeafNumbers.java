import java.util.*;



public class SumRoottoLeafNumbers {
	 static public class TreeNode {
		    int val;
		    TreeNode left;
	     TreeNode right;
		    TreeNode(int x) { val = x; }
	 }
	 
	 static int max = 0;
	 
	 static public void sumNum(int val,TreeNode root){
		 int vv = val * 10 + root.val;
		 if(root.left == null && root.right == null){
			 max += vv;return;
		 }
		 if(root.left != null) sumNum(vv,root.left);
		 if(root.right != null) sumNum(vv,root.right);
	 }

	 static  public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        sumNum(0,root);
        	
        return max;
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
		
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn4;
		tn3.right = tn5;
		
		System.out.println(sumNumbers(tn1));
	}

}
