package Codility;
import java.util.Arrays;

public class FindMin {
	public static void main(String[] args) {
		int[] A = {1,3,6,4,1,2};
		Solution s = new Solution();
		int temp = s.solution(A);
		System.out.println(temp);
		int [] B = {1,2,3};
		s = new Solution();
		temp = s.solution(B);
		System.out.println(temp);
		int [] C = {-1,-3};
		s = new Solution();
		temp = s.solution(C);
		System.out.println(temp);
		int [] D = {1,3,6,4,1,2};
		s = new Solution();
		temp = s.solution(D);
		System.out.println(temp);
	}
}

class Solution {
	public int solution(int[] A) {
		// write your code in Java SE 8
		Arrays.sort(A);
		int temp=A[A.length-1]+1;
		temp = (temp < 1) ? 1: temp; 
		for (int i=0;i<A.length-1;i++) {
			if (A[i]+1 >= A[i+1]) 
			{
				//No gap between the elements
			}   
			else  
			{
				if (A[i] >0) {
					temp = A[i]+ 1;
					break;
				}
			}
		}	
		return temp;
	}
}