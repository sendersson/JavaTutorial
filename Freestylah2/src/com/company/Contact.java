package com.company;

public class Contact {

    private String name;
    private String number;
    private String adress;

    Contact(String name, String number, String adress) {
        this.name = name;
        this.number = number;
        this.adress = adress;
    }

    String getName() {
        return name;
    }

    String getNumber() {
        return number;
    }

    String getAdress() {
        return adress;
    }

    void setNumber(String number) {
        this.number = number;
    }

    void setAdress(String adress) {
        this.adress = adress;
    }

}
