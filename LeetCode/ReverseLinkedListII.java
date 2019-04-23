
public class ReverseLinkedListII {
	
	 static public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		 }
    static public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n) return head;
    	if(m < 1 || m > n) return null;
    	
    	ListNode guard = new ListNode(0);
        guard.next = head;
        ListNode left = guard,mNode = null,prev = null,next = null;
        int index = 1;
        
        while(head != null && index < n + 1){
        	if(index < m - 1){
        		head = head.next;
        	}else if (index == m - 1){
        		left = head;
        		head = head.next;
        	}else if (index == m){
        		mNode = head;
        		prev = head;
        		head = head.next;
        	}else if(index > m && index <= n){   		
        		next = head.next;
        		head.next = prev;
        		prev = head;
        		head = next;	
        	}
        	index++;
        }
        
        if(index < n + 1) return null;        
        if (index == n + 1){
        		left.next = prev;
        		mNode.next = head;
        }     	
        
        return guard.next;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		
		int m = 1, n = 5;
		
		ListNode ll = reverseBetween(ln1,m,n);
		while(ll != null){
			System.out.print(ll.val + " ");
			ll = ll.next;
		}
		
	}

}
