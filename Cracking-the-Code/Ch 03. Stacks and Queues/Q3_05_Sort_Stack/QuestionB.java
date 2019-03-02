package Q3_05_Sort_Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

import CtCILibrary.AssortedMethods;

public class QuestionB {	
	public static void sortStack(Stack<Integer> s) {
		Stack<Integer> r = new Stack<Integer>();
		while(!s.isEmpty()) {
			/* Insert each element in s in sorted order into r. */
			int tmp = s.pop();
			while(!r.isEmpty() && r.peek() > tmp) {
				s.push(r.pop());
			}
			r.push(tmp);
		}
		
		/* Copy the elements back. */
		while (!r.isEmpty()) {
			s.push(r.pop());
		}
	}
			
	/**
	 * Go through the original stack
	 * Pop the top element and save to 'tmp'
	 * Now go through the second stack
	 * If the second stack is empty, push the 'tmp' element to it
	 * If not empty,pop every element in the second stack that is GREATER than the 'tmp' element
	 * Then push these back to the original stack.
	 * Then push the 'tmp' element to the second stack
	 * Follow this for the rest of the elements in the original stack
	 * 
	 * The idea is to set aside an element from the original stack and insert it in the second stack, 
	 * the smallest being at the bottom
	 * 
	 * Then you can put everything back in the original stack, with the largest going to the bottom
	 * 
	 * Note how the stack and deque store the elements differently. However, pop() work the same way 
	 * 
	 * @param s
	 */
	public static void sortDQStack(Deque<Integer> s) {
		Deque<Integer> r = new ArrayDeque<Integer>();
		//System.out.println("\nSORTING:\n");
		while(!s.isEmpty()) {
			//printDeque(s, "original:");
			//printDeque(r, "secondary:");
			int tmp = s.pop();
			while(!r.isEmpty() && r.peek() > tmp) {
				s.push(r.pop());
			}
			r.push(tmp);
		}
		//printDeque(s, "original:");
		//printDeque(r, "secondary:");
		
		/* Copy the elements back. */
		while (!r.isEmpty()) {
			s.push(r.pop());
		}
	}
		public static void main(String [] args) {
		Stack<Integer> s = new Stack<Integer>();
		Deque<Integer> dqstack = new ArrayDeque<Integer>();
		for (int i = 0; i < 10; i++) {
			int r = AssortedMethods.randomIntInRange(0,  1000);
			s.push(r);
			dqstack.push(r);
		}

		printStack(s,"original stack");
		sortStack(s);
		printStack(s,"sorted stack");
		popStack(s,"popped stack");
		System.out.println("");

		printDeque(dqstack,"original deque");
		sortDQStack(dqstack);
		printDeque(dqstack,"sorted deque");
		popDeque(dqstack,"popped deque");

	}
	
	public static void printStack(Stack<Integer> stk, String desc) {
		System.out.println("");  
		System.out.println("\n" + desc);
		Iterator<Integer> is=stk.iterator();  
		while(is.hasNext())  
		{  
			System.out.print(is.next() + ":");  
		}
		
	}
	public static void printDeque(Deque<Integer>  que, String desc) {
		System.out.println("");  
		System.out.println("\n" + desc);
		Iterator<Integer> q=que.iterator();  
		while(q.hasNext())  
		{  
			System.out.print(q.next() + ":");  
		}
		
	}
	public static void popStack(Stack<Integer> s, String desc) {
		System.out.println("");  
		System.out.println("\n" + desc);
		while(!s.isEmpty()) {
			System.out.print(s.pop() + ":");
		}
		
	}
	public static void popDeque(Deque<Integer>  s, String desc) {
		System.out.println("");  
		System.out.println("\n" + desc);
		while(!s.isEmpty()) {
			System.out.print(s.pop() + ":");
		}		
	}
}
