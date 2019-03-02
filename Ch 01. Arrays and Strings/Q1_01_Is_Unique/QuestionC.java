package Q1_01_Is_Unique;


/**
 * @author armibayudan
 * Loop thru all characters of the string;
 * Using the char, loop again thru the same string looking for a matching char 
 * Do not match against the same char
 *
 */
public class QuestionC {
	public static boolean isUniqueChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0;j<str.length();j++) {
				if (i==j) continue;
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle", "paddle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

}
