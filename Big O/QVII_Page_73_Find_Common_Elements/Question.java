package QVII_Page_73_Find_Common_Elements;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class Question {

	

	private void findSameBrute() {
		int[] ar = {13,27,35,40,49,55,59,60,62,72,200};
		int[] at = {13,17,35,39,40,55,58,62,72,102,105,200};
		//int[] ar = {13,27,35,40,49,40,55,59,60,62,72,12};
		//int[] at = {17,35,39,40,55,58,62,60,60,60,12};

		Set<Integer> counts = new TreeSet<>();
		Set<Integer> as = new HashSet<>();
		System.out.println("FIND COMMON ELEMENTS BRUTE:");
				
		for (int i=0;i<ar.length;i++) {
			as.add(ar[i]);
		}
		
		for (int j=0;j<at.length;j++) {
			if (as.contains(at[j])) {
				counts.add(at[j]);
			}
		}
		
		System.out.println("count:" + counts.size() + ":" + counts.toString());

	}

	private void findSameOptimized() {
		int[] ar = {13,27,35,40,49,55,59,60,62,72,200};
		int[] at = {13,17,35,39,40,55,58,62,72,102,105,200};

		Set<Integer> counts = new TreeSet<>();
		System.out.println("FIND COMMON ELEMENTS OPTIMIZED:");
		int start = 0;		
		outer:
		for (int i=0;i<ar.length;i++) {
			int st;
			st = findElement(at, start, ar[i]);
			if (st == -2) {
				counts.add(ar[i]);
			}
			if (st >= 0) {
				start = st;
				continue outer;
			}
			//if (i == ar.length) break; //TO STOP THE LOOP - not needed - the loop does not reset
		}
		
		System.out.println("count:" + counts.size() + ":" + counts.toString());

	}
	
	private int findElement (int[] ax, int start, int elem) {
		for (int i=start;i<ax.length;i++) {
			if (ax[i] == elem) {
				return -2; //FOUND
			}
			if (ax[i] > elem) {
				return i; //NOT FOUND, returns the next element
			}
		}
		return -1; //NOT FOUND at all
	}

	public static void main(String[] args) {
		Question q = new Question();
		long startTime,endTime,totalTime;

		startTime = System.nanoTime();
		q.findSameBrute();
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("FINDER TIME: " + totalTime + " or " +  totalTime/1e9 + " OR " + TimeUnit.NANOSECONDS.toSeconds(totalTime));

		startTime = System.nanoTime();
		q.findSameOptimized();
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("FINDER TIME: " + totalTime + " or " +  totalTime/1e9 + " OR " + TimeUnit.NANOSECONDS.toSeconds(totalTime));


}

}
