package Codility;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDups {
	public static void main(String[] args) {
		int[] A = {1,3,6,4,1,2};
		DupSolution s = new DupSolution();
		int temp = s.solution(A);
		System.out.println(temp);
		int [] B = {1,2,3};
		s = new DupSolution();
		temp = s.solution(B);
		System.out.println(temp);
		int [] C = {-1,-3};
		s = new DupSolution();
		temp = s.solution(C);
		System.out.println(temp);
		int [] D = {1,3,6,4,1,2};
		s = new DupSolution();
		temp = s.solution(D);
		System.out.println(temp);
	}
}

class DupSolution {
	public int solution(int[] A) {
		// write your code in Java SE 8
		Map<Integer, Integer> in = new HashMap<Integer,Integer>();
		for (int i=0;i<A.length-1;i++) {
			if (in.containsKey(A[i])) {
				
			}
		}	
		return temp;
	}
}

class IntCount {
	private int i;
	private int ct;
	IntCount(int i, int ct) {
		this.i = i;
		this.ct = ct;
	};
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getCt() {
		return ct;
	}
	public void setCt(int ct) {
		this.ct = ct;
	}
	
	@Override
	public boolean equals (Object o) {
		if (o == this) return true;
		if (!(o instanceof IntCount)) return false;
		IntCount ic = (IntCount) o;
		if (ic.getI() == this.getI()) return true;
		return false;
	}
	
	@Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.i;
        result = 31 * result + this.ct;
         return result;
    }
	
	
}