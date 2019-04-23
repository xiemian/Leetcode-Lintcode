import java.util.*;


public class BinaryTreeZigzagLevelOrderTraversal {
	 static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	    static public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
			 List<List<Integer>> re = new ArrayList<List<Integer>>();   
			 if(root == null) return re;
			 
			 Queue<TreeNode> tmp = new LinkedList<TreeNode>();
			 tmp.offer(root);
			 int nums = 1;
			 boolean flag = false;
			 
			 while(nums != 0){
				 List<Integer> ree = new ArrayList<Integer>();
				 Stack<Integer> ttmp = new Stack<Integer>();
				 int index = nums;nums = 0;
				 for(int i = 0;i < index;i++){
					 TreeNode tn = tmp.poll();
					 if(flag) ttmp.push(tn.val);
					 else ree.add(tn.val);
					 if(tn.left != null){
						 tmp.offer(tn.left);
						 nums++;
					 }
					 if(tn.right != null){
						 tmp.offer(tn.right);
						 nums++;
					 }
				 }
				 
				 if(flag){
					 while(!ttmp.isEmpty()) ree.add(ttmp.pop());
				 }
				 flag = !flag;
				 
				 re.add(ree);
			 }
			 
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
		tn2.left = tn4;
		tn3.right = tn5;
		
		for(List<Integer> ls : zigzagLevelOrder(tn1)){
			System.out.println(ls);
		}
	}

}
