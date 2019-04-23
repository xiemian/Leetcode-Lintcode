
public class RotateList {
	
	static public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	
    static public ListNode rotateRight(ListNode head, int k) {
    	ListNode hh,ee; ListNode index = head;
    	hh = head;ee = head;
    	int len = 0;
    	
    	while(index != null){
    		len++;
    		index = index.next;
    	}
    	
    	if(len == 0) return null;
    	else k = k % len;
    	
    	for(int i = 0;i < k;i++){
    		ee = ee.next;
    	}
    	
    	while(ee.next != null){
    		hh = hh.next;
    		ee = ee.next;
    	}
    	
    	ee.next = head;
    	ListNode rel = hh.next;
    	hh.next = null;
    	
    	return rel;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;l2.next = l3;l3.next = l4;l4.next = l5;
		
		ListNode head = rotateRight(l1,2);
		
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
			
	}

}
