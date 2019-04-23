import java.util.List;




public class MaximumDepthofBinaryTree {
	
	static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
	static public int caculateMax(TreeNode root,int level,int max){
		if(root == null) return max;
		level++;
		max = level > max?level:max;
		
		max = caculateMax(root.left,level,max);
		max = caculateMax(root.right,level,max);
		
		return max;
	}
	
    static public int maxDepth(TreeNode root) {
    	int max = 0,level = 0;
    	
    	return caculateMax(root,level,max);
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
		tn2.right = tn3;
		tn3.left = tn4;
		tn4.right = tn5;
		
		System.out.println(maxDepth(tn1));

	}

}
