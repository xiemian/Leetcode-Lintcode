import java.util.*;

public class BinaryTreeLevelOrderTraversalII {
	static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
    static public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> re = new Stack<List<Integer>>();
        List<List<Integer>> ree = new ArrayList<List<Integer>>();
        
        if(root == null) return ree;
        Queue<TreeNode> qe = new LinkedList<TreeNode>();
        
        qe.offer(root);
        int nums = 1,index;
        
        while(nums != 0){
        	index = nums;
        	List<Integer> tmp = new ArrayList<Integer>();
	        for(int i = index;i > 0;i--){
	        	TreeNode tn = qe.poll();
	        	tmp.add(tn.val);
	        	nums--;
	        	if(tn.left != null) {
	        		qe.offer(tn.left);
	        		nums++;
	        	}
	        	if(tn.right != null) {
	        		qe.offer(tn.right);
	        		nums++;
	        	}
	        }
	        re.push(tmp);
        }
        
        while(!re.isEmpty())
        	ree.add(re.pop());
        
        return ree;
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
		tn4.right = tn5;
		
		for(List<Integer> ls : levelOrderBottom(tn1)){
			System.out.println(ls);
		}
	}

}
