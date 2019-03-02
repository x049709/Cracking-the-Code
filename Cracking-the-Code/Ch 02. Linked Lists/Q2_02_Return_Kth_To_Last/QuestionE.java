package Q2_02_Return_Kth_To_Last;

import CtCILibrary.*;

/**
 * @author x049709
 *
 */
public class QuestionE {

	public static void main(String[] args) {		
		Nodes n = new Nodes();
		n.run();		
	}
}

class Nodes {
	
	/**
	 * Generate the linkist from array
	 * Then count the nodes
	 * Then print kth to last node
	 * 
	 */
	public void run () {
		int[] array = {10, 11, 12, 13, 14, 15, 16};
		LinkedListNode arrayNodes = AssortedMethods.createLinkedListFromArray(array);
		System.out.println(arrayNodes.printForward());
		int nodelen = countNodes(arrayNodes);
		System.out.println("node count: " + nodelen);				
		printKthToLast(arrayNodes, 5, nodelen);
		printKthToLast(arrayNodes, 3, nodelen);
		printKthToLast(arrayNodes, 4, nodelen);
	}
	
	/**
	 * Go through the entire linklist
	 * If the current node is the requested node (nodelength - requested distance from end - 1 (zero based)
	 * then print the message
	 * @param n
	 * @param k
	 * @param nodelen
	 * @return
	 */
	public int printKthToLast(LinkedListNode n, int k, int nodelen) {
		for (int i=0;i<nodelen;i++) {
			if (i==nodelen-k-1) {
				System.out.println("node " + (i+1) +"th(" + k + " nodes from end) has data:" + n.data);
			}
			n=n.next;
		}
		return 0;
	}

	/**
	 * Count the nodes
	 * @param n
	 * @return
	 */
	public  int countNodes(LinkedListNode n) {
		int ncount=0;
		while (n != null) {
			ncount++;	
			n = n.next;
		}
		return ncount;
	}
	

	
}
