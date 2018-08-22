package com.company;

class Printer {

    private int blackTonerLevel;
    private int cyanTonerLevel;
    private int yellowTonerLevel;
    private int magentaTonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    Printer(int blackTonerLevel, int cyanTonerLevel, int yellowTonerLevel, int magentaTonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter) {
        this.blackTonerLevel = blackTonerLevel;
        if (this.blackTonerLevel > 100) {
            this.blackTonerLevel = 100;
        }
        this.cyanTonerLevel = cyanTonerLevel;
        if (this.cyanTonerLevel > 100) {
            this.cyanTonerLevel = 100;
        }
        this.yellowTonerLevel = yellowTonerLevel;
        if (this.yellowTonerLevel > 100) {
            this.yellowTonerLevel = 100;
        }
        this.magentaTonerLevel = magentaTonerLevel;
        if (this.magentaTonerLevel > 100) {
            this.magentaTonerLevel = 100;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        if(this.numberOfPagesPrinted <0){
            this.numberOfPagesPrinted = 0;}
        this.isDuplexPrinter = isDuplexPrinter;
    }

    void printPage(int pages) {
        if (blackTonerLevel > 0 || cyanTonerLevel > 0 || yellowTonerLevel > 0 || magentaTonerLevel > 0) {
            System.out.println("Printing " + pages + " pages");
            blackTonerLevel -= pages;
            cyanTonerLevel -= pages;
            yellowTonerLevel -= pages;
            magentaTonerLevel -= pages;
            if (isDuplexPrinter) {
                numberOfPagesPrinted += (pages / 2);
            } else {
                numberOfPagesPrinted += pages;
            }
        } else {
            System.out.println("Out of toner");

        }
    }

    void fillUpToner(int amount, String color) {
        switch (color.toLowerCase()) {
            case "cyan":
                cyanTonerLevel += amount;
                if (cyanTonerLevel > 100) {
                    cyanTonerLevel = 100;
                }
                break;
            case "yellow":
                yellowTonerLevel += amount;
                if (yellowTonerLevel > 100) {
                    yellowTonerLevel = 100;
                }
                break;
            case "black":
                blackTonerLevel += amount;
                if (blackTonerLevel > 100) {
                    blackTonerLevel = 100;
                }
                break;
            case "magenta":
                magentaTonerLevel += amount;
                if (magentaTonerLevel > 100) {
                    magentaTonerLevel = 100;
                }
                break;
            default:
                System.out.println("Invalid color");
        }

    }


    int getBlackTonerLevel() {
        return blackTonerLevel;
    }

    int getCyanTonerLevel() {
        return cyanTonerLevel;
    }

    int getYellowTonerLevel() {
        return yellowTonerLevel;
    }

    int getMagentaTonerLevel() {
        return magentaTonerLevel;
    }

    int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
