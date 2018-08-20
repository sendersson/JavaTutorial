package com.company;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(1);

        char switchValue = 'f';

        switch (switchValue) {

            case 'A':
                System.out.println("Testing: " + switchValue);
                break;

            case 'B': case 'b':
                System.out.println("Testing: " +switchValue);
                break;

            case 'C': case 'c':
                System.out.println("Testing: " +switchValue);
                break;

            case 'D': case 'd': case 'E': case 'e': case 'F': case 'f':
                System.out.println("Was d, e or f (" +switchValue +")");
                break;

            default:
                System.out.println("All other choises (" +switchValue +")");
                break;
        }

        String month = "MaY";
        switch (month.toLowerCase()){
            case "may":
                System.out.println("Best month (" +month.toLowerCase() +")");
                break;

             default:
                 System.out.println("Not the best month (" +month.toLowerCase() +")");
        }

    }

        private static void printDayOfTheWeek(int day){

            switch (day){

                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid value");

            }

        }

    }


