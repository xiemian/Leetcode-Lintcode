
public class RemoveDuplicatesfromSortedList {
	
	static public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
    static public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        ListNode index = head;
        
        if(head == null) return null;
        if(head.next == null) return head;
        
        while(head.next != null){
        	if(head.next.val != head.val){
        		index.next = head.next;
        		index = head.next;
        	}
        	head = head.next;
        }
        
        index.next = null;
        
        return tmp;
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
		ListNode head5 = new ListNode(5);
		head.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next = null;
		
		ListNode ln = deleteDuplicates(head);
		while(ln != null){
			System.out.print(ln.val + " ");
			ln = ln.next;
		}
	}

}
