package QVII_Page_67_Count_Pairs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Question {

	
	private void calcDiffOptimized() {
		int[] ar = {1,7,5,9,2,12,3};
		int diff = 2;
		Set<String> counts = new HashSet<>();

		//Using Java loop to create set:
		//Set<Integer> as = new HashSet<>();
		//for (int i=0;i<ar.length;i++) {
		//	as.add(ar[i]);
		//}
		//System.out.println("OPTIMIZED:" + as);
		
		//Using Java streams to create set:
		Set<Integer> intSet = Arrays.stream(ar).boxed().collect(Collectors.toSet());
		System.out.println("OPTIMIZED:" + intSet);
		
		for (int i=0;i<ar.length;i++) {
			if ((intSet.contains(ar[i] + diff))) {
				counts.add(Integer.toString(ar[i])+ ":" + Integer.toString(ar[i] + diff)); 						
			} else {
				if ((intSet.contains(ar[i] - diff))) {
					counts.add(Integer.toString(ar[i] - diff)+ ":" + Integer.toString(ar[i])); 						
				}				
			}				
		}
		System.out.println("count:" + counts.size() + ":" + counts.toString());
	}

	private void calcDiffBrute() {
		int[] ar = {1,7,5,9,2,12,3};
		int diff = 2;

		Set<String> counts = new HashSet<>();
		Set<Integer> arSet = Arrays.stream(ar).boxed().collect(Collectors.toSet());
		System.out.println("BRUTE:" + arSet.toString());
		
		for (int i=0;i<ar.length;i++) {
			for (int j=0;j<ar.length;j++) {
				if ((ar[i] - ar[j] == diff) || (ar[i] - ar[j] == diff*-1)) {
					if (ar[i] < ar[j]) {
						counts.add(Integer.toString(ar[i])+ ":" + Integer.toString(ar[j])); 						
					} else {
						counts.add(Integer.toString(ar[j])+ ":" + Integer.toString(ar[i])); 												
					}
				}
			}
		}
		System.out.println("count:" + counts.size() + ":" + counts.toString());
	}

	public static void main(String[] args) {
		Question q = new Question();
		long startTime,endTime,totalTime;
		long startTime2,endTime2,totalTime2;

		startTime = System.nanoTime();
		q.calcDiffOptimized();
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("OPTIMIZED TIME1: " + totalTime + " or " +  totalTime/1e9 + " OR " + TimeUnit.NANOSECONDS.toSeconds(totalTime));

		startTime2 = System.nanoTime();
		q.calcDiffBrute();
		endTime2   = System.nanoTime();
		totalTime2 = endTime2 - startTime2;		
		System.out.println("BRUTE TIME1: " + totalTime2 + " or " +  totalTime2/1e9 + " OR " + TimeUnit.NANOSECONDS.toSeconds(totalTime2));
		
		startTime = System.nanoTime();
		q.calcDiffOptimized();
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("OPTIMIZED TIME2: " + totalTime + " or " +  totalTime/1e9 + " OR " + TimeUnit.NANOSECONDS.toSeconds(totalTime));

		startTime2 = System.nanoTime();
		q.calcDiffBrute();
		endTime2   = System.nanoTime();
		totalTime2 = endTime2 - startTime2;		
		System.out.println("BRUTE TIME2: " + totalTime2 + " or " +  totalTime2/1e9 + " OR " + TimeUnit.NANOSECONDS.toSeconds(totalTime2));

		startTime = System.nanoTime();
		q.calcDiffOptimized();
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("OPTIMIZED TIME3: " + totalTime + " or " +  totalTime/1e9 + " OR " + TimeUnit.NANOSECONDS.toSeconds(totalTime));

		startTime2 = System.nanoTime();
		q.calcDiffBrute();
		endTime2   = System.nanoTime();
		totalTime2 = endTime2 - startTime2;		
		System.out.println("BRUTE TIME3: " + totalTime2 + " or " +  totalTime2/1e9 + " OR " + TimeUnit.NANOSECONDS.toSeconds(totalTime2));
}

}
