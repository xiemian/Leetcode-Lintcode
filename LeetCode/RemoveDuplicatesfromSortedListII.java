
public class RemoveDuplicatesfromSortedListII {
	static public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
    static public ListNode deleteDuplicates(ListNode head) {
        ListNode index = new ListNode(0);
        ListNode tmp = index;
        ListNode index1 = head;
        
        int count = 0;
        if(head == null) return null;
        if(head.next == null) return head;
        
        while(index1.next != null){
        	if(index1.next.val != index1.val){
        		if (count == 0){
	        		index.next = index1;
	        		index = index1;
        		}
	        	count = 0;
        	}else{
        		count++;
        	}
        	index1 = index1.next;
        }
        if(count == 0) index.next = index1;
        else index.next = null;
        
        return tmp.next;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(2);
		ListNode head1 = new ListNode(3);
		ListNode head2= new ListNode(3);
		ListNode head3 = new ListNode(4);
		ListNode head4 = new ListNode(5);
		//ListNode head5 = new ListNode(5);
		head.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		//head4.next = head5;
		//head5.next = null;
		
		ListNode ln = deleteDuplicates(head);
		while(ln != null){
			System.out.print(ln.val + " ");
			ln = ln.next;
		}
	}

}
