package Q2_06_Palindrome;

import CtCILibrary.LinkedListNode;

public class QuestionD {
	/**
	 * Walk through the linklist and create a string of all nodes
	 * Then reverse the string and compare
	 * @param n
	 * @return
	 */
	public  static boolean isPalindrome(LinkedListNode n) {
		StringBuilder sb = new StringBuilder();
		String fwd, rev;
		while (n != null) {
			sb.append(Integer.toString(n.data));
			n = n.next;
		}
		fwd = sb.toString();
		rev = sb.reverse().toString();
		System.out.println("fwd:" + fwd + " reversed: " + rev);
		if (fwd.equals(rev)) return true;
		else return false;
	}

	public static void main(String[] args) {
		int length = 9;
		LinkedListNode[] nodes = new LinkedListNode[length];
		for (int i = 0; i < length; i++) {
			nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
		}
		
		for (int i = 0; i < length; i++) {
			if (i < length - 1) {
				nodes[i].setNext(nodes[i + 1]);
			}
			if (i > 0) {
				nodes[i].setPrevious(nodes[i - 1]);
			}
		}
		//nodes[length - 2].data = 9; // Uncomment to ruin palindrome
		
		LinkedListNode head = nodes[0];
		System.out.println(head.printForward());
		System.out.println(isPalindrome(head));
	}

}
