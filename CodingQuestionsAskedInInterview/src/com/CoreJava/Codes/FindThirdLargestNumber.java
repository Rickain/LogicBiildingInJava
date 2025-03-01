package com.CoreJava.Codes;

import java.util.Arrays;

public class FindThirdLargestNumber {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15, 2, 7, 8, 1 };

		//int[] uniqueNumbers = getUniqueNumbers(nums);
		int[] sortedNumbers = getSortedNumbers(nums);
		int largestNumber = getlargestnumber(sortedNumbers, 3);

		System.out.println("Input Arrays is " + Arrays.toString(nums));

		//System.out.println("Unique Elements in Array are " + Arrays.toString(uniqueNumbers));

		System.out.println("Sorted Array is " + Arrays.toString(sortedNumbers));

		System.out.println("The 3rd Largest Element is " + largestNumber);
	}

	private static int getlargestnumber(int[] sortedNumbers, int i) {
		int number = 0;

		for (int n = 0; n < i; n++) {
			number = sortedNumbers[n];
		}
		return number;
	}

	private static int[] getSortedNumbers(int[] uniqueNumbers) {

		int[] clonedArray = uniqueNumbers.clone();
		int length = clonedArray.length, temp;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1; j++) {

				if (clonedArray[j] < clonedArray[j + 1]) {

					temp = clonedArray[j];
					clonedArray[j] = clonedArray[j + 1];
					clonedArray[j + 1] = temp;
				}
			}

		}

		return clonedArray;
	}

	private static int[] getUniqueNumbers(int[] nums) {

		int[] clonedArray = nums.clone();
		int length = clonedArray.length;
		int[] uniqueElementsArray = new int[length];
		int count = 0;

		for (int i = 0; i < length; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < count; j++) {
				if (clonedArray[i] == uniqueElementsArray[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				uniqueElementsArray[count] = clonedArray[i];
				count++;
			}

		}
		return Arrays.copyOf(uniqueElementsArray, count);
	}

}