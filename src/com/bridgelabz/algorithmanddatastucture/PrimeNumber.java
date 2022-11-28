package com.bridgelabz.algorithmanddatastucture;

public class PrimeNumber {

    public int[] printPrime(){
        int i,count;
        int[] primeNumbers = new int[168];

        int k=0;
        for(int j=2;j<=1000;j++)
        {
            count=0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2) {
//                System.out.print(j + " ");
                  primeNumbers[k] =  j;
                  k++;
                  PrimePalindromeAndAnagram.isPalindrome(j);
            }
        }
        return primeNumbers;
    }


    public static void main(String[] args) {

        PrimeNumber primeNumber = new PrimeNumber();

        System.out.println("Prime numbers from 1 to 1000 are :");
        int[] primeNumbers = primeNumber.printPrime();

        for(int i=0; i<primeNumbers.length; i++){
            System.out.print(primeNumbers[i]+" ");
        }
        System.out.println();
        PrimePalindromeAndAnagram primePalindromeAndAnagram = new PrimePalindromeAndAnagram();
        primePalindromeAndAnagram.displayPalindromes();
        primePalindromeAndAnagram.anagram(primeNumbers);

    }

}