package com.CoreJava.Codes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target. You may assume that each input
 * has exactly one solution, and you may not use the same element twice.
 * 
 * Example : Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation:
 * Because nums[0] + nums[1] = 2 + 7 = 9
 * 
 **/

public class TwoSum {
	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15, 2, 7, 8, 1 };
		int target = 9;
		int firstNumber = 0, secondNumber = 0, sum = 0;

//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//
//				if (nums[i] > target)
//					continue;
//				if (nums[j] > target)
//					continue;
//
//				firstNumber = nums[i];
//				secondNumber = nums[j];
//				sum = firstNumber + secondNumber;
//
//				if (sum == target) {
//					System.out.println("Found with elements [" + firstNumber + "," + secondNumber + "]");
//					sum = 0;
//					firstNumber = 0;
//					secondNumber = 0;
//
//				}
//			}
//		}

//		System.out.println("Enhanced For Loop");
//
//		// Enhanced for loop
//		for (int number : nums) {
//
//			if (number > target) {
//				continue;
//			}
//			sum = sum + number;
//			if (firstNumber == 0) {
//				firstNumber = number;
//			} else {
//				secondNumber = number;
//			}
//
//			if (sum == target) {
//
//				System.out.println("Found with elements [" + firstNumber + "," + secondNumber + "]");
//				firstNumber = 0;
//				secondNumber = 0;
//				sum = 0;
//			}
//		}

		System.out.println("Using chat gpt's loop ");

//		HashSet<Integer> seen = new HashSet<>();
//
//		for (int number : nums) {
//			int complement = target - number; // Find the needed pair value
//			if (seen.contains(complement)) {
//				System.out.println("Found with elements [" + complement + "," + number + "]");
//			}
//			seen.add(number); // Store the current number for future lookups
//		}
		
		List<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();

        for (int number : nums) {
            int complement = target - number; // Find the needed pair value
            if (list.contains(complement)) {
                System.out.println("List -> Found with elements [" + complement + "," + number + "]");
            }
            if (set.contains(complement)) {
                System.out.println("SET -> Found with elements [" + complement + "," + number + "]");
            }
            list.add(number); // Store the number for future pairs
            set.add(number);
        }
        
        System.out.println("List "+list);
        System.out.println("Set "+set);

	}
}