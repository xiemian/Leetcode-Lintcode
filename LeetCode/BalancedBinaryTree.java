


public class BalancedBinaryTree {
	static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
	static public int caculateDep(TreeNode root,int dep){
		if(root == null){
			return dep - 1;
		}
		
		int left = caculateDep(root.left,dep + 1);
		int right = caculateDep(root.right,dep + 1);
		
		if(left == -1 || right == -1 || Math.abs(right - left) > 1) return -1;
		else return Math.max(left, right);
	}
	
    static public boolean isBalanced(TreeNode root) {
    	if(root == null) return true;
        return (caculateDep(root,0) != -1);
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
		tn4.right = tn5;
		
		System.out.println(isBalanced(tn1));
	}

}
