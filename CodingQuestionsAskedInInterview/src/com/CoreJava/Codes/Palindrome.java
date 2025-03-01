package com.CoreJava.Codes;

public class Palindrome {

	public static void main(String[] args) {
		
		String inputString = "NN";
		int startIndex = 0;
		int lastIndex = inputString.length() -1;
		char[] c = inputString.toCharArray();
		boolean isPalindrome = false;
		
		if(inputString.length() <= 1) {
			isPalindrome = false;
			System.out.println("Cannot Determine whether the given String is Pallindrome or not because it is either null or length is '0','1' ");
		}
		
		for(int i = 0 ; i < inputString.length() / 2 ; i++) {
			if(c[i] == c[lastIndex]) {
				lastIndex -- ;
				isPalindrome = true;
			}else {
				isPalindrome = false;
			}
		}
		
//		while(lastIndex > startIndex) {
//			if(c[startIndex] == c[lastIndex]) {
//				isPalindrome = true;
//				startIndex ++ ;
//				lastIndex --;
//			}else {
//			
//				isPalindrome = true;
//			}
//		}
		
		if(isPalindrome){
			System.out.println(inputString + " is Palindrome");
		}else {
			System.out.println(inputString + " is not a palindrome");
		}
		
	}
}
