package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));


        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(1234);
        numberToWords(-12);

        }

    public static void numberToWords(int number){

        if (number <0){
            System.out.println("Invalid Value");
        }
        else {
            int digitCount= getDigitCount(number)+1;
            number = reverse(number);
            int digit = 0;


            for (int i =1; i<digitCount; i++){
                digit = number % 10;

                switch (digit) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                        break;
                }

                number /= 10;
            }


        }
    }

    public static int reverse(int number){

        int reverse = 0;

        while (number != 0){
            int remainder = number%10;
            reverse = reverse * 10 + remainder;
            number /=10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){

        if (number <0){
            return -1;
        }

        int digitCount = 1;
        int remainder = 0;

        while (number != 0){
            remainder = number /10;
            if (remainder >0){
                digitCount += 1;
            }
            number /= 10;
        }

        return digitCount;
    }

}
