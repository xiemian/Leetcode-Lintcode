


public class PathSum {
	static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
	static boolean path(TreeNode root, int sum,int tmp){
		tmp += root.val;
		if(root.left == null && root.right == null && tmp == sum) return true;
		
		if(root.left != null && path(root.left,sum,tmp)) return true;
		if(root.right != null && path(root.right,sum,tmp)) return true;
		
		return false;
	}
	
	static public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        int tmp = 0;
        if(path( root, sum, tmp)) return true;
		
		return false;
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
		//tn1.right = tn3;
		//tn2.left = tn4;
		//tn4.right = tn5;
		
		System.out.println(hasPathSum(tn1,1));
	}

}
