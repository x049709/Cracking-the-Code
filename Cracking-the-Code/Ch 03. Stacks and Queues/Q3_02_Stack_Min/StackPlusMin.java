package Q3_02_Stack_Min;

import java.util.Stack;

public class StackPlusMin extends Stack<Integer>{
	private static final long serialVersionUID = 42L;
	private int min = Integer.MAX_VALUE;
	
	@Override
	public Integer push(Integer item) {
		if (item < min) {
			min=item;
		}
		return super.push(item);
	}
	@Override
	public Integer pop() {
		//NEEDS WORK: how to reset the MIN if the current MIN is being popped
		if (this.peek() < min) {
			min=this.peek();
		}
		return super.pop();
	}
	
	public Integer min() {
		return min;
	}
	

}
