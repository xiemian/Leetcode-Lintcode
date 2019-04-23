import java.util.*;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
	static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	static public TreeNode build(HashMap<Integer,Integer> map,int[] postorder, int index,int[] inorder,int start,int end){
		TreeNode tmp;
		if(end - start < 0) return null;
		//System.out.println(index + " " + start + " " + end);
		tmp = new TreeNode(postorder[index]);
		
		tmp.right = build(map,postorder,index - 1,inorder,map.get(postorder[index]) + 1,end);
		tmp.left = build(map,postorder,index - end + map.get(postorder[index]) - 1,inorder,start,map.get(postorder[index]) - 1);
		
		
		return tmp;
	}
	
	static public TreeNode buildTree(int[] postorder, int[] inorder) {
		if(postorder.length == 0 || postorder.length != inorder.length) return null;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
               
        for(int i = 0;i < inorder.length;i++){
        	map.put(inorder[i], i);
        }
        
        return build(map,postorder,postorder.length - 1,inorder,0,inorder.length - 1);
    }
	
	static public void print(TreeNode tn){
		if(tn == null) return;
		System.out.print(tn.val + ",");
		print(tn.left);
		print(tn.right);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] postorder = {9,15,7,20,3};
		int[] inorder = {9,3,15,20,7};
		
		TreeNode tn = buildTree(postorder,inorder);
		Stack<TreeNode> st = new Stack<TreeNode>();
		
		print(tn);
	}

}
