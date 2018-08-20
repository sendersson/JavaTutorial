package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221)); //true
        System.out.println(isPalindrome(707)); //true
        System.out.println(isPalindrome(11212)); //false

        System.out.println(isPalindromeStringMethod(123321));

    }

    public static boolean isPalindrome(int number){

        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0){
            int remainder = palindrome%10;
            reverse = reverse * 10 + remainder;
            palindrome /=10;
        }
        return number == reverse;


    }

    public static boolean isPalindromeStringMethod(int number){

        String integerString = String.valueOf(number);
        return integerString.equals(new StringBuilder(integerString).reverse().toString());

    }

}
