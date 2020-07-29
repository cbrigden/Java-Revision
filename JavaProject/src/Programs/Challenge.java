package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Challenge {
	/**
	 * returns an array of multiples of num up to length
	 * 
	 * @param num
	 *            the number to return mulitples of
	 * @param length
	 *            the number of multiples to return
	 * @return the array of integers that are multiples of num
	 */
	public static int[] arrayOfMultiples(int num, int length) {
		int[] multiplesArray = new int[length];
		for (int i = 0; i < length; i++) {
			multiplesArray[i] = num * (i + 1);
		}
		return multiplesArray;
	}

	/**
	 * returns the number of solutions a quadratic equation has
	 * 
	 * @param a,
	 *            b, c the variables of the quadratic equation
	 * @return number of solutions to provided quadratic equation
	 */
	public static int solutions(int a, int b, int c) {
		int x = b * b - 4 * a * c; // calculate discriminant
		if (x > 0) {
			return 2;
		} else if (x == 0) {
			return 1;
		}
		return 0;
	}

	/**
	 * returns "boom!" if the number 7 appears in the array
	 */
	public static String sevenBoom(int[] arr) {
		return Arrays.toString(arr).contains("7") ? "Boom!" : "there is no 7 in the array";
	}

	/**
	 * determines whether elements in an array can be re-arranged to form a
	 * consecutive list of numbers where each number appears exactly once
	 */
	public static boolean cons(int[] arr) {
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1] + 1) {
				return false;
			}
		}
		return true;
	}

	public static String textToNum(String phone) {
		phone = phone.replaceAll("[ABC]", "2").replaceAll("[DEF]", "3").replaceAll("[GHI]", "4")
				.replaceAll("[JKL]", "5").replaceAll("[MNO]", "6").replaceAll("[PQRS]", "7").replaceAll("[TUV]", "8")
				.replaceAll("[WXYZ]", "9");
		return phone;
	}

	/**
	 * This challenge involves a series that can start with any string of digits.
	 * The next term in the series is found by adding the digits of the previous
	 * term, appending that sum to the previous term, and then truncating the
	 * leftmost digits so that the number of digits in the terms is always the same.
	 * 
	 */
	public static int periodic(String str) {
		int stringLength = str.length();
		String trunc = str;
		ArrayList<String> history = new ArrayList<String>();
		while (true) {
			history.add(trunc);
			int sum = 0;
			for (int i = 0; i < trunc.length(); i++) {
				sum += Character.getNumericValue(trunc.charAt(i));
			}
			String x = trunc + Integer.toString(sum);
			trunc = "";
			for (int i = 1; i <= stringLength; i++) {
				trunc = x.charAt(x.length() - i) + trunc;
			}
			if (history.contains(trunc)) {
				return history.size();
			}
		}
	}

	public static int ecgSequenceIndex(int n) {
		return 0;
	}
}
