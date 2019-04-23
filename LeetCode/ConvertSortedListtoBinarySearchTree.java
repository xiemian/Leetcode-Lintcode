import java.util.*;



public class ConvertSortedListtoBinarySearchTree {
	static public class ListNode {
		     int val;
		    ListNode next;
		     ListNode(int x) { val = x; }
		 }
		 

	static public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		 }
	
	static public TreeNode arrayToBST(List<Integer> al,int start,int end){
		if(start > end) return null;
		TreeNode tmp = new TreeNode(al.get((start + end) / 2));
		//System.out.print(tmp.val + " " + start + " " + end + "---");
		tmp.left = arrayToBST(al,start, (end + start) / 2 - 1);
		tmp.right = arrayToBST(al,(end + start) / 2 + 1,end);

		return tmp;
	}
	
    static public TreeNode sortedListToBST(ListNode head) {
    	List<Integer> al = new ArrayList<Integer>();
    	while(head != null) {
    		al.add(head.val);
    		head = head.next;
    	}
    	if(al.size() == 0) return null;
        return arrayToBST(al,0,al.size() - 1);
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
		ListNode ln1 = new ListNode(-10);
		ListNode ln2 = new ListNode(-3);
		ListNode ln3 = new ListNode(0);
		ListNode ln4 = new ListNode(5);
		ListNode ln5 = new ListNode(9);
		
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		
		TreeNode re = sortedListToBST(ln1);
		print(re);
	}

}
