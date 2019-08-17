package Utilis;

public class StringUtils {

	public static boolean isSubStringPresent(String sentence, String sub) {
		// return sentence.contains(sub);
		if (sentence == null || sub == null) {
			throw new RuntimeException("null value for sentence or substring are not allowed");
		} else {
			boolean isFound = sentence.indexOf(sub) != -1 ? true : false;
			return isFound;
		}

	}

	// Palindrome check
	public static boolean palindromecheck(String str) {
		if (str == null || str == "") {
			throw new RuntimeException("null & empty value for input string is not allowed");
		}

		String newStr = str.replaceAll("\\W", "");

		int len = newStr.length();
		String temp = newStr.toLowerCase();
		boolean isPalindrome = false;
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + temp.charAt(i);
		}
		if (rev.equals(temp)) {
			isPalindrome = true;
		}
		return isPalindrome;

	}

	// reverseString
	public static String reverseString(String str) {
		if (str == null || str == "") {
			throw new RuntimeException("null and empty value for input string is not allowed");
		}

		int len = str.length();
		String reverseString = "";
		for (int i = len - 1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		return reverseString;
	}

}
