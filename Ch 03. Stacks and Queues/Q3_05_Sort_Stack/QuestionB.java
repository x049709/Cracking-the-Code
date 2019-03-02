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
			
	public static void sortDQStack(Deque<Integer> s) {
		Deque<Integer> r = new ArrayDeque<Integer>();
		System.out.println("\nSORTING:\n");
		while(!s.isEmpty()) {
			printDeque(s, "s");
			printDeque(r, "r");
			System.out.println("");
			int tmp = s.pop();
			while(!r.isEmpty() && r.peek() > tmp) {
				s.push(r.pop());
			}
			r.push(tmp);
		}
		printDeque(s, "s");
		printDeque(r, "r");
		System.out.println("");
		
		/* Copy the elements back. */
		while (!r.isEmpty()) {
			s.push(r.pop());
		}
	}
		public static void main(String [] args) {
		Stack<Integer> s = new Stack<Integer>();
		Deque<Integer> dqstack = new ArrayDeque<Integer>();
		for (int i = 0; i < 3; i++) {
			int r = AssortedMethods.randomIntInRange(0,  1000);
			s.push(r);
			dqstack.push(r);
		}

		printStack(s, "original stack");
		System.out.println("");
		sortStack(s);
		printStack(s, "sorted stack");
		System.out.println("");
		popStack(s, "popped stack");
		System.out.println("");

		printDeque(dqstack, "original deque");
		System.out.println("");
		sortDQStack(dqstack);
		printDeque(dqstack, "sorted deque");
		System.out.println("");
		popDeque(dqstack, "popped deque");
		System.out.println("");

	}
	
	public static void printStack(Stack<Integer> s, String desc) {
		System.out.println("");  
		System.out.println("\n" + desc);
		Iterator<Integer> q=s.iterator();  
		while(q.hasNext())  
		{  
			System.out.print(q.next() + ":");  
		}
		
	}
	public static void printDeque(Deque<Integer>  s, String desc) {
		System.out.println("");  
		System.out.println("\n" + desc);
		Iterator<Integer> q=s.iterator();  
		while(q.hasNext())  
		{  
			System.out.print(q.next() + ":");  
		}
		
	}
	public static void popStack(Stack<Integer> s, String desc) {
		System.out.println("\n" + desc);
		while(!s.isEmpty()) {
			System.out.print(s.pop() + ":");
		}
		
	}
	public static void popDeque(Deque<Integer>  s, String desc) {
		System.out.println("\n" + desc);
		while(!s.isEmpty()) {
			System.out.print(s.pop() + ":");
		}		
	}
}
