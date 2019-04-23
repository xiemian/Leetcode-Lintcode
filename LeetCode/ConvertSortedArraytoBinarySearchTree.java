import java.util.*;


public class ConvertSortedArraytoBinarySearchTree {
	static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
	static public TreeNode arrayToBST(int[] nums,int start,int end){
		if(start > end) return null;
		TreeNode tmp = new TreeNode(nums[(end + start) / 2]);
		tmp.left = arrayToBST(nums,start,(end + start) / 2 - 1);
		tmp.right = arrayToBST(nums,(end + start) / 2 + 1,end);
		
		return tmp;
	}
	
    static public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return arrayToBST(nums,0,nums.length - 1);
    }
	/**
	 * @param args
	 */
    static void print(TreeNode tn){
    	if(tn == null) return;
    	System.out.print(tn.val + ",");
    	print(tn.left);
    	print(tn.right);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-10,-3,0,5,9};
		TreeNode tn = sortedArrayToBST(nums);
		print(tn);
	}

}
