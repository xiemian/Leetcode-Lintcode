


public class BinaryTreeMaximumPathSum {
	 static public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	static int max = Integer.MIN_VALUE;
	 
    static public int maxPath(TreeNode root){
    	if(root == null) return 0;
	    int left,right,mmax = Integer.MIN_VALUE;
	    left = maxPath(root.left);
	    right = maxPath(root.right);
	    System.out.print(root.val + "," + left + "," + right + "," );
	    mmax = Math.max(root.val, Math.max(root.val + left, root.val + right));
	    
	    max = Math.max(Math.max(root.val + left + right,mmax), max);
	    System.out.println(mmax + "," + max);
	    return mmax;
    }
    
	static public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        //max = Integer.MIN_VALUE;
        maxPath(root);
        
        return max;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(-2);
		TreeNode tn3 = new TreeNode(-3);
		TreeNode tn4 = new TreeNode(1);
		TreeNode tn5 = new TreeNode(3);
		TreeNode tn6 = new TreeNode(-2);
		TreeNode tn7 = new TreeNode(-1);
		
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn4;
		tn2.right = tn5;
		tn4.left = tn7;
		tn3.left = tn6;
		
		System.out.println(maxPathSum(tn1));
	}

}
