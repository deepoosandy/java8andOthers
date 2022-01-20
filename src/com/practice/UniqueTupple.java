package com.practice;

import java.util.HashSet;

public class UniqueTupple {

	public static HashSet<String> uniqueTuples(String inputString, int length) {
		// your code
		HashSet<String> hs = new HashSet<String>();
		int inputStringLen = 0;

		if (inputString == null || inputStringLen == 0 || length <= 0 || length > inputStringLen) {
			if (inputString == null) {
				throw new IllegalArgumentException("Input string cannot be null.");
			} else {
				inputStringLen = inputString.length();
			}
			if (inputStringLen == 0) {
				throw new IllegalArgumentException("Input string cannot be of zero length.");
			}
			if (length <= 0) {
				throw new IllegalArgumentException("Length of tuples has to be greater than zero.");
			}
			if (length > inputStringLen) {
				throw new IllegalArgumentException(
						"Length of the tuple cannot be more than the length of the input string.");
			}
		}

		for (int i = 0; i < (inputStringLen - length + 1); i++) {
			hs.add(inputString.substring(i, (i + length)));
		}

		return hs;
	}

	public static void main(String[] args) {
		String input = "aab";
		HashSet<String> result = uniqueTuples(input, 2);
		if (result.contains("aa") && result.contains("ab")) {
			System.out.println("Test passed.");

		} else {
			System.out.println("Test failed.");

		}
	}
}