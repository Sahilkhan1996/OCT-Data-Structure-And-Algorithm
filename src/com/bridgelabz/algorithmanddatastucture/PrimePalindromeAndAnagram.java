package com.bridgelabz.algorithmanddatastucture;

import java.util.Arrays;

public class PrimePalindromeAndAnagram {

	static int[] primePalindrome = new int[16];
	static int k = 0;

	public static void isPalindrome(int n) {
		int rem, sum = 0, temp;

		if (n >= 10) {

			temp = n;
			while (n > 0) {
				rem = n % 10;
				sum = (sum * 10) + rem;
				n = n / 10;
			}
			if (temp == sum) {
//            System.out.println(temp + " is a palindrome number.");
				primePalindrome[k] = temp;
				k++;
			}

		}

	}

	public void displayPalindromes() {

		System.out.println("Prime numbers which are palindromes from 1 to 1000 are :");
		for (int i = 0; i < primePalindrome.length; i++) {
			System.out.print(primePalindrome[i] + " ");
		}
		System.out.println();

	}

	public void anagram(int[] primeNumbers) {

		System.out.println("Prime numbers from 1 to 1000 which are anagrams of each other:");
//        for(int i=primeNumbers.length-1; primeNumbers[i]>=10; i--){
		for (int i = 0; i < primeNumbers.length; i++) {

//            for(int j=0; j<=i; j++){
			for (int j = primeNumbers.length - 1; j >= i; j--) {

				if (primeNumbers[j] >= 10 && primeNumbers[i] != primeNumbers[j]) {

					String str1 = Integer.toString(primeNumbers[i]);
					String str2 = Integer.toString(primeNumbers[j]);

					if (str1.length() == str2.length()) {

						char[] charArray1 = str1.toCharArray();
						char[] charArray2 = str2.toCharArray();

						Arrays.sort(charArray1);
						Arrays.sort(charArray2);

						boolean result = Arrays.equals(charArray1, charArray2);

						if (result) {
							System.out.println(str1 + " and " + str2 + " are anagrams.");
						}

					}

				}

			}

		}
		System.out.println();

	}

}