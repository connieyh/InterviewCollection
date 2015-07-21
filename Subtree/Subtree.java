// http://www.geeksforgeeks.org/check-if-a-binary-tree-is-subtree-of-another-binary-tree/
class Node {
	int val;
	Node left;
	Node right;
	Node(int x) { val = x; left = null; right = null;}
}
public class Subtree {
	public static boolean isSame(Node r1, Node r2) {
		if(r1==null && r2==null) {
			return true;
		}
		if(r1==null ^ r2==null) {
			return false;
		}
		return r1.val == r2.val && isSame(r1.left, r2.left) && isSame(r1.right, r2.right);
	}
	public static int isSubtree(Node t1, Node t2) {
		if(t2==null) {return 1;}
		if(t1==null ^ t2==null) {return -1;}
		if(t1.val==t2.val) {
			if(isSame(t1, t2)) {
				return 1;
			}
		}
		if(isSubtree(t1.left, t2) == 1 || isSubtree(t1.right, t2)==1) {
			return 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		Node t1 = new Node(26);
		t1.right = new Node(3);
		t1.right.right = new Node(3);
		t1.left = new Node(10);
		t1.left.left = new Node(4);
		t1.left.left.right = new Node(30);
		t1.left.right = new Node(6);

		Node t2 = new Node(10);
		t2.right = new Node(6);
		t2.left = new Node(4);
		t2.left.right = new Node(30);

		System.out.println(t2.left.right.val);

		if(isSubtree(t1, t2) == 1) {
			System.out.println("t2 is subtree of t1");
		}else {
			System.out.println("No subtree!");
		}

	}

}