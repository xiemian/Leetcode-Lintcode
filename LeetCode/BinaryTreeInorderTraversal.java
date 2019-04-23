import java.util.*;


public class BinaryTreeInorderTraversal {
	 static public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		 }
	
    static public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> re = new ArrayList<Integer>();
        Stack<TreeNode> tmp = new Stack<TreeNode>();
        TreeNode cur = root;
        
        while(cur != null){
        	if(cur.left != null){
        		tmp.push(cur);
        		cur = cur.left;
        	}else{
        		re.add(cur.val);
        		if(cur.right != null){
        			cur = cur.right;
        		}else{
        			if(!tmp.isEmpty()){
            			cur = tmp.pop();
            			cur.left = null;
        			}else cur = null;

        		}
        	}
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
		tn1.right = tn2;
		tn2.left = tn3;
		
		for(int i : inorderTraversal(tn1)){
			System.out.println(i);
		}
		
	}

}
