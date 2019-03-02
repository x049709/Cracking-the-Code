package Q1_04_Palindrome_Permutation;

/**
 * @author edbayudan
 * Pseudocode
 * Create an int array to count all the occurrences of each character in the string (in Common.java,
 * an array of the numeric value of all chars from a-z. 
 * Note that since the numeric value of 'a' is 10 and not 0, the array is adjusted to make the looping easier
 * ie, array[0] contains the count for 'a', array[1] contains the count for 'b', etc)
 * Then check if any of the counts is odd (count%2 is not 0); 
 * this means that not all counts are paired, meaning it's not a palindrome permutation 
 *
 */
public class QuestionA {	
	public static boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) {
				if (foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}
	
	public static boolean isPermutationOfPalindrome(String phrase) {
		int[] table = Common.buildCharFrequencyTable(phrase);
		return checkMaxOneOdd(table);
	}
	
	public static void main(String[] args) {
		String pali = "Rats live on no evil star";
		System.out.println(isPermutationOfPalindrome(pali));
	}


}
