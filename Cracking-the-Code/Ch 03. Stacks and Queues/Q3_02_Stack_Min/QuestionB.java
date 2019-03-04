package Q3_02_Stack_Min;

import java.util.Iterator;

public class QuestionB {
	public static void main(String[] args) {
		StackPlusMin stack = new StackPlusMin();
		int[] array = {2, 1, 3, 1,5,4,-2,-200,212,345};
		for (int value : array) {
			stack.push(value);
		}
		System.out.println("\n" + "stack min: " + stack.min());
		
		for (int x=0;x<array.length-4;x++) {
			stack.pop();			
		}
		
		Iterator<Integer> is=stack.iterator();  
		while(is.hasNext())  
		{  
			System.out.print(is.next() + ":");  
		}

		if (!stack.isEmpty()) {
			System.out.println("\n" + "stack peek: " + stack.peek());			
			System.out.println("\n" + "stack min: " + stack.min());			
		}
	}

}
