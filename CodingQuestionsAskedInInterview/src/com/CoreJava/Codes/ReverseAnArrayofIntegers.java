package com.CoreJava.Codes;

import java.util.Arrays;

public class ReverseAnArrayofIntegers {

	public static void main(String[] args) {
		int[] array = { 10, 11, 15, 20, 21 };
		int start = 0;
		int lastIndex = array.length - 1, temp = 0;

		while (lastIndex > start) {
			temp = array[start];
			array[start] = array[lastIndex];
			array[lastIndex] = temp;

			start++;
			lastIndex--;
		}

		System.out.println("Reverse Array " + Arrays.toString(array));

	}

}
