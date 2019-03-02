package Q2_01_Remove_Dups;

import java.util.HashSet;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

/**
 * @author x049709
 * Loop through the nodes, starting from the passed-in node
 * If the node is not null, check if the node's data is in the hashset. 
 * If it is, it means we are on a node that is a duplicate, 
 * so we have to delete the node.
 * To do so, set the previous node's next node to the passed-in node's next node,
 * effectively bypassing the passed-in node.
 * Then, move to the next node and repeat
 */
public class QuestionD {
	public static void deleteDups(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while (n != null) {
			if (set.contains(n.data)) {
				previous.next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("RANDOM NODES:");
		LinkedListNode randomNodes = AssortedMethods.randomLinkedList(20, 0, 12);
		System.out.println(randomNodes.printForward());
		deleteDups(randomNodes);
		System.out.println(randomNodes.printForward());
		
		System.out.println("CUSTOM NODES:");
		LinkedListNode first = new LinkedListNode(0, null, null);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		deleteDups(head);
		System.out.println(head.printForward());
	}
}
