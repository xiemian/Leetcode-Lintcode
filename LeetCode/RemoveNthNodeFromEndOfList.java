import java.util.Stack;


public class RemoveNthNodeFromEndOfList {

	 static public class ListNode {
		      int val;
		    ListNode next;
		     ListNode(int x) { val = x; }
		 }
	 
		static public ListNode removeNthFromEnd(ListNode head, int n) {
			ListNode first,second;
			first = head;
			second = head;
			for(int i = 0;i < n;i++){
				if(second.next != null) second = second.next;
				else {
					head = head.next;
					return head;
				}
				
			}
			while(second.next != null){
				first = first.next;
				second = second.next;
			}
			first.next = first.next.next;
			return head;
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		ListNode head = removeNthFromEnd(a,4);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

}
