package com.company;

public class Main {

    public static void main(String[] args) {

        Book bok1 = new Book();

        bok1.setIsReadable(true);
        bok1.setTitle("Sagan om Leif");
        bok1.setPages(322);

        System.out.println(bok1.Read());

        bok1.setTitle("Sagan om Harald");
        bok1.setPages(180);
        bok1.setIsReadable(true);

        System.out.println(bok1.getTitle());
        System.out.println(bok1.getPages());
        System.out.println(bok1.getIsReadable());

        System.out.println(bok1.Read());

        bok1.setIsReadable(false);
        System.out.println(bok1.Read());

        Cat katt1 = new Cat();
        System.out.println(katt1.isCatPlaying(true,45));

        katt1.setTemperature(36);
        katt1.setSummer(false);

        System.out.println(katt1.isSummer());
        System.out.println(katt1.getTemperature());

        System.out.println(katt1.isCatPlaying());



    }
}
