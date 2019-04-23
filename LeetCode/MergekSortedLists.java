import java.util.*;



public class MergekSortedLists {
	
	static public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	static public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head,index = new ListNode(-1);
        if(l1 == null && l2 == null) return (ListNode)null;
        else if(l1 == null) return l2;
        else if(l2 == null) return l1;
        head = l1.val <= l2.val?l1:l2;
        while(!(l1 == null || l2 == null)){
        	if(l1.val <= l2.val){
        		index.next = l1;
        		index = l1;
        		l1 = l1.next;
        	}else{
        		index.next = l2;
        		index = l2;
        		l2 = l2.next;
        	}
        }
		
        if(l1 == null) index.next = l2;
        else index.next = l1;
        
		return head;
    }
	
	
   static  public ListNode mergeKKLists(ListNode[] lists,int begin,int end) {
	   if(begin > end) return null;	   	   
	   if(begin == end) return lists[begin];
	   if(begin + 1 == end) return mergeTwoLists(lists[begin],lists[end]);
	   
	   int mid = (end - begin) / 2 + begin;
	   System.out.println(begin + " " + mid + " " + end);
	   ListNode l1 = mergeKKLists(lists,begin,mid);
	   ListNode l2 = mergeKKLists(lists,mid + 1,end);
	   
	   
	   return mergeTwoLists(l1,l2);
    }
	
   static  public ListNode mergeKLists(ListNode[] lists) {
	   return mergeKKLists(lists,0,lists.length - 1);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(6);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		ListNode f = new ListNode(0);
		ListNode g = new ListNode(9);
		a.next = b;
		b.next = c;
		
		d.next = e;
		
		f.next = g;
		
		ListNode[] lists = new ListNode[5];
		lists[0] = a;lists[1] = null;
		lists[2] = d;lists[3] = null;
		lists[4] = f;
		
		ListNode head = mergeKLists(lists);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

}
