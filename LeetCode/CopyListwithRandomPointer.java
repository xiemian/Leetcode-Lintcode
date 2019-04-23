
public class CopyListwithRandomPointer {
	static class RandomListNode {
		     int label;
		     RandomListNode next, random;
		     RandomListNode(int x) { this.label = x; }
	};
	
	
	static	public RandomListNode copyRandomList(RandomListNode head) {
		if(head == null) return null;
		RandomListNode headCopy = head;
        while(head != null){
        	RandomListNode nl = new RandomListNode(head.label);
        	nl.next = head.next;
        	head.next = nl;
        	head = nl.next;
        }
        head = headCopy;
        while(head != null){
        	if(head.random != null)
        		head.next.random = head.random.next;
        	head = head.next.next;
        }
        head = headCopy;
        RandomListNode re = headCopy.next;
        RandomListNode newhead;
        while(head != null){
        	newhead = head.next;
        	System.out.println(newhead.label);
        	if(newhead.next != null){
        		head.next = newhead.next;
        		newhead.next = newhead.next.next;
        	}else{
        		head.next = null;
        		newhead.next = null;
        	}
        	head = head.next;
        }
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomListNode ln1 = new RandomListNode(1);
		RandomListNode ln2 = new RandomListNode(2);
		RandomListNode ln3 = new RandomListNode(3);
		RandomListNode ln4 = new RandomListNode(4);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln1.random = ln3;
		ln4.random = ln2;
		
		copyRandomList(ln1);
	}

}
