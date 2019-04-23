import java.util.*;

public class PathSumII {
	static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
	static void path(List<List<Integer>> re,List<Integer> tmp,TreeNode root,int sum,int cur){
		if(root.left == null && root.right == null && cur == sum) {
			re.add(new ArrayList<Integer>(tmp));
			return;
		}
		
		if(root.left != null){
			cur += root.left.val;
			tmp.add(root.left.val);
			path(re,tmp,root.left,sum,cur);
			cur -= root.left.val;
			tmp.remove(tmp.size() - 1);
		}
		if(root.right != null){
			cur += root.right.val;
			tmp.add(root.right.val);
			path(re,tmp,root.right,sum,cur);
			cur -= root.right.val;
			tmp.remove(tmp.size() - 1);
		}
	}
	
	static public List<List<Integer>> pathSum(TreeNode root, int sum) {	
		List<List<Integer>> re = new ArrayList<List<Integer>>();
		if(root == null) return re;
		List<Integer> tmp = new ArrayList<Integer>();
		int cur = root.val;
		tmp.add(root.val);
		
		path(re,tmp,root,sum,cur);
		
		return re;
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
		tn3.left = tn4;
		tn2.right = tn5;
		
		for(List<Integer> ln : pathSum(tn1,8))
			System.out.println(ln);
	}

}
