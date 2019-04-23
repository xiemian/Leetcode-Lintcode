import java.util.*;


public class PopulatingNextRightPointersinEachNodeII {
	static public class TreeLinkNode {
	     int val;
	     TreeLinkNode left, right, next;
	     TreeLinkNode(int x) { val = x; }
	 }
	
	static public void connect(TreeLinkNode root) {
	   if(root == null) return;
	   Queue<TreeLinkNode> qe = new LinkedList<TreeLinkNode>();
	   qe.offer(root);
	   int nums = 1;
	   while(nums != 0){
		   int index = nums;nums = 0;
		   for(int i = index;i > 0;i--){
			   root = qe.poll();
			   if(i > 1) root.next = qe.peek();
			   else root.next = null;
			   if(root.left != null){
				   qe.offer(root.left);
				   nums++;
			   }
			   if(root.right != null){
				   qe.offer(root.right);
				   nums++;
			   }
		   }
	   }
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeLinkNode tln1 = new TreeLinkNode(1);
		TreeLinkNode tln2 = new TreeLinkNode(2);
		TreeLinkNode tln3 = new TreeLinkNode(3);
		TreeLinkNode tln4 = new TreeLinkNode(4);
		TreeLinkNode tln5 = new TreeLinkNode(5);
		TreeLinkNode tln6 = new TreeLinkNode(6);
		TreeLinkNode tln7 = new TreeLinkNode(7);
		
		tln1.left = tln2;
		tln1.right = tln3;
		tln2.left = tln4;
		tln2.right = tln5;
		tln3.left = tln6;
		tln3.right = tln7;
		
		connect(tln1);
	}

}
