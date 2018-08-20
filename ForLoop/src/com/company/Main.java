package com.company;

public class Main {

    public static void main(String[] args) {


        /*
        double amount = 10000;

        for (int i = 8; i >= 2; i--){
            //Original:
            //System.out.println(amount +" at " +i +"% interest = " +calculateInterest(amount,i));
            // Only puts out two decimals (to fix 7% interest rate)
            System.out.println(amount +" at " +i +"% interest = " +String.format("%.2f", +calculateInterest(amount,i)));
        }

        System.out.println("10,000 at 2% interest = " +calculateInterest(10000.0,2.0));
        System.out.println("10,000 at 3% interest = " +calculateInterest(10000.0,3.0));
        System.out.println("10,000 at 4% interest = " +calculateInterest(10000.0,4.0));
        System.out.println("10,000 at 5% interest = " +calculateInterest(10000.0,5.0));

        // for(init; termination; increment)
        for(int i = 0; i < 5; i++){

            System.out.println("Loop " +i +" Hello!");
        }
*/
        int primeCounter = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                primeCounter++;
                System.out.println("Prime number: " + i);
                if (primeCounter == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        // Math.sqrt(n) is quicker than n/2 but both work
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;



    /*
    public static double calculateInterest(double amount, double interestRate){

        return (amount*(interestRate/100));

    }
    */

    }
}
