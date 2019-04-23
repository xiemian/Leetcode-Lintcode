


public class MinimumDepthofBinaryTree {
	static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
	static int min;
	
	static 	public int caculateDep(TreeNode root,int dep){
		if(root.left == null && root.right == null){
			if(dep < min) min = dep;
		}else{
            int i = dep + 1;
            if(root.left != null) caculateDep(root.left,i);
            if(root.right != null) caculateDep(root.right,i);
        }
		return min;
	}
	
	static public int minDepth(TreeNode root) {
		min = Integer.MAX_VALUE;
		if(root == null) return 0;
        return caculateDep(root,1);
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
		
		System.out.println(minDepth(tn1));
	}

}
