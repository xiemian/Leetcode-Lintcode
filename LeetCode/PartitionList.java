
public class PartitionList {
	static public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
    static public ListNode partition(ListNode head, int x) {
        ListNode headSmall = null,headBig = null,endSmall = null,endBig = null;
        
        while(head != null){
        	if(head.val < x){
        		if(headSmall == null){
        			headSmall = head;
        			endSmall = head;
        		}else{
        			endSmall.next = head;
        			endSmall = head;
        		}
        	}else{
        		if(headBig == null){
        			headBig = head;
        			endBig = head;
        		}else{
        			endBig.next = head;
        			endBig = head;
        		}
        	}
        	head = head.next;
        }
        
        
       
        if(headSmall == null){
        	if(headBig == null) return null;
        	else return headBig;
        }else{
        	if(headBig != null) {
        		endSmall.next = headBig;
        		endBig.next = null;
        	}else endSmall.next = null;
        	
        	return headSmall;
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(2);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(2);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		ListNode ln = partition(node1,3);
		while(ln != null){
			System.out.print(ln.val + "->");
			ln = ln.next;
		}
	}

}
