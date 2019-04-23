import java.util.*;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	static public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	static public TreeNode build(HashMap<Integer,Integer> map,int[] preorder, int index,int[] inorder,int start,int end){
		TreeNode tmp;
		if(end - start < 0) return null;
		System.out.println(index + " " + start + " " + end);
		tmp = new TreeNode(preorder[index]);
		
		
		tmp.left = build(map,preorder,index + 1,inorder,start,map.get(preorder[index]) - 1);
		tmp.right = build(map,preorder,index + map.get(preorder[index]) - start + 1,inorder,map.get(preorder[index]) + 1,end);
		
		return tmp;	
	}
	
	static public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder.length == 0 || preorder.length != inorder.length) return null;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
               
        for(int i = 0;i < inorder.length;i++){
        	map.put(inorder[i], i);
        	System.out.print(inorder[i] + " " + i + ",");
        }
        
        return build(map,preorder,0,inorder,0,inorder.length - 1);
    }
	/**
	 * @param args
	 */
	static public void print(TreeNode tn){
		if(tn == null) return;
		System.out.print(tn.val + ",");
		print(tn.left);
		print(tn.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		
		TreeNode tn = buildTree(preorder,inorder);
		Stack<TreeNode> st = new Stack<TreeNode>();
		
		print(tn);
		
	}

}
