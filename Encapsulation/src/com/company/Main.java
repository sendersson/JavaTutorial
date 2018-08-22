package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(200,300,400,500,0,false);

        System.out.println(printer.getBlackTonerLevel());
        System.out.println(printer.getCyanTonerLevel());
        System.out.println(printer.getMagentaTonerLevel());
        System.out.println(printer.getYellowTonerLevel());
        System.out.println(printer.getNumberOfPagesPrinted());
        System.out.println(printer.isDuplexPrinter());

        printer.printPage(5);
        printer.printPage(90);

        printer.printPage(5);
        printer.printPage(1);

        printer.fillUpToner(100, "CYaN");
        printer.fillUpToner(100, "MaGeNtA");
        printer.fillUpToner(100, "black");
        printer.fillUpToner(100,"yeLLoW");
        printer.fillUpToner(90, "dsaj");

        printer.printPage(1);

        System.out.println(printer.getNumberOfPagesPrinted());
    }
}
