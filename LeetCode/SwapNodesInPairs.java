import java.util.*;

public class SwapNodesInPairs {
	
	static public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}

	static public class ListNodeComparator implements Comparator {  
	    public final int compare(Object l1, Object l2) {  
	        int val1 = ((ListNode)l1).val;  
	        int val2 = ((ListNode)l2).val;  
	        int diff = val1 - val2;  
	        if (diff > 0)  
	            return -1;  
	        if (diff < 0)  
	            return 1;  
	        else  
	            return 0;  
	    }  
	}  	
	
	@SuppressWarnings("unchecked")
	static void change(ListNode[] ll){
		ListNode temp = ll[0];
		ll[0] = ll[1];
		ll[1] = temp;
		ll[0].next = ll[1];
		/*
		System.out.println("before compare " + ll[0].val + " " + ll[1].val);
		Arrays.sort(ll, new ListNodeComparator());
		for(int i = 0;i < ll.length - 1;i++){
			ll[i].next = ll[i + 1];
		}
		System.out.println("after compare " + ll[0].val + " " + ll[1].val);
		*/
	}
	
	static ListNode step(ListNode pre,ListNode[] temp,int n){
		for(int i = 0;i < n;i++){
			if(pre.next == null) return null;
			else{
				temp[i] = pre.next;
				pre = pre.next;
			}
		}
		return temp[n - 1];
	}
	
    static public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(-1),post,lastOne;
        result.next = head;
        ListNode[] swapNodes = new ListNode[2];
        ListNode pre = result;       
        
        while(true){
        	lastOne = step(pre,swapNodes,2);
        	if(lastOne == null){
        		return result.next;
        	}else{
            	post = lastOne.next;
        		change(swapNodes);
        		pre.next = swapNodes[0];
        		pre = swapNodes[1];
        		swapNodes[1].next = post;
        	}
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(5);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(6);
		ListNode f = new ListNode(2);
		ListNode g = new ListNode(2);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		ListNode head = swapPairs(a);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

}
