

public class ReverseHalfList {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public static ListNode reverseHalf(ListNode head) {
		ListNode mid = findMid(head);
		ListNode last = doReverse(mid);
		mid.next = last;
		return head;
	}
	public static ListNode findMid(ListNode head) {
		ListNode run = head;
		ListNode mid = head;
		while(run!=null && run.next!=null) {
			run = run.next.next;
			mid = mid.next;
		}
		return mid;
	}
	public static ListNode doReverse(ListNode head) {
		ListNode pre = head;
		ListNode cur = head.next;
		while(cur!=null) {
			ListNode n = cur.next;
			cur.next = pre;
			pre = cur;
			cur = n;
		}
		return pre;
	}
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(5);
		ListNode n5 = new ListNode(6);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		System.out.print(reverseHalf(head));
	}
}