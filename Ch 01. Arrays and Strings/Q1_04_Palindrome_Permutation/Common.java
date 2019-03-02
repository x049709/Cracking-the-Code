package Q1_04_Palindrome_Permutation;

import java.util.Arrays;

public class Common {

	public static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		int val = Character.getNumericValue(c);
		System.out.println("Num val:" + c + "=" + val);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}
	
	public static int[] buildCharFrequencyTable(String phrase) {
		System.out.println("Numval a:" + Character.getNumericValue('a'));
		System.out.println("Numval z:" + Character.getNumericValue('z'));
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		System.out.println("freq table: ");
		Arrays.stream(table).forEach(System.out::print);;
		System.out.println("\n");
		for (char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			if (x != -1) {
				table[x]++;
			}
		}
		System.out.println("freq table: ");
		Arrays.stream(table).forEach(System.out::print);;
		System.out.println("\n");
		return table;
	}

}
