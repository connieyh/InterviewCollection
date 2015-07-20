class ListNode{
	int val;
	ListNode next;
	ListNode(int x) { val = x; next = null;}
}

class MyLinkedList {
	ListNode head;
	MyLinkedList() {
		head = null;
	}
	void add(int val) {
		ListNode t = new ListNode(val);
		ListNode cur = head;
		while(cur!=null && cur.next!=null) {
			cur = cur.next;
		}
		if(head==null) {
			head = t;
		}else {
			cur.next = t;
		}
	}
	void printList() {
		ListNode cur = head;
		while(cur!=null) {
			System.out.print(cur.val + " -> ");
			cur = cur.next;
		}
		System.out.println();
	}
}

public class ReverseHalfList {
	public static ListNode reverseHalf(ListNode head) {
		ListNode preMid = findPremid(head);
		ListNode last = doReverse(preMid.next);
		preMid.next = last;
		return head;
	}
	public static ListNode findPremid(ListNode head) {
		ListNode run = head;
		ListNode mid = head;
		ListNode preMid = null;
		while(run!=null && run.next!=null) {
			run = run.next.next;
			preMid = mid;
			mid = mid.next;
		}
		return preMid;
	}
	public static ListNode doReverse(ListNode head) {
		if(head==null) {return null;}
		ListNode pre = null;
		ListNode cur = head;
		while(cur!=null) {
			ListNode n = cur.next;
			cur.next = pre;
			pre = cur;
			cur = n;
		}
		return pre;
	}
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList(); 
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.printList();
		ListNode nhead = reverseHalf(myList.head);
		myList.printList();
		
	}
}