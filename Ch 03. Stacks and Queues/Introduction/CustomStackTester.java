package Introduction;

import java.util.EmptyStackException;
import java.util.Stack;

import CtCILibrary.AssortedMethods;

/**
 * @author x049709
 * Compares custom stack vs Java stack 
 * Loops thru an array and pushes array contents to both stacks, then pops contents from both stacks
 * It compares every element pushed and popped to make sure they match
 *
 */
public class CustomStackTester {

	public static void main(String[] args) {
		int[] array = AssortedMethods.randomArray(5, -100, 100);
		MyStack<Integer> customStack = new MyStack<Integer>();		
		Stack<Integer> javaStack = new Stack<Integer>();
		
		for (int a : array) {
			if (a < 0) {
				int top1, top2;
				try {
					top1 = customStack.pop();
				} catch (EmptyStackException ex) {
					top1 = Integer.MIN_VALUE;
				}
				try {
					top2 = javaStack.pop();
				} catch (EmptyStackException ex) {
					top2 = Integer.MIN_VALUE;
				}
				if (top1 != top2) {
					System.out.println("ERROR: mismatching tops");
				} else {
					System.out.println("SUCCESS: matching tops: " + top1);
				}
			} else {
				customStack.push(a);
				javaStack.push(a);
			}
		}
		
		while (!customStack.isEmpty() || !javaStack.isEmpty()) {
			int top1, top2;
			try {
				top1 = customStack.pop();
			} catch (EmptyStackException ex) {
				top1 = Integer.MIN_VALUE;
			}
			try {
				top2 = javaStack.pop();
			} catch (EmptyStackException ex) {
				top2 = Integer.MIN_VALUE;
			}
			if (top1 != top2) {
				System.out.println("ERROR: mismatching tops");
			} else {
				System.out.println("SUCCESS: matching tops: " + top1);
			}
		}
	}

}
