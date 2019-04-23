
public class SameTree {
	 static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	    static public boolean isSameTree(TreeNode p, TreeNode q) {
	        if(p != null && q != null){
	        	if(p.val != q.val) return false;
	        	if(!isSameTree(p.left,q.left)) return false;
	        	if(!isSameTree(p.right,q.right)) return false;
	        }else if((p != null && q == null) || (q != null && p == null))
	        	return false;
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
		
		tn1.left = tn2;
		tn1.right = tn3;
		
		System.out.println(isSameTree(tn1,tn2));
	}

}
