package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer william = new VipCustomer("William", 100000, "william@skoglycke");
        william.printAll();
        VipCustomer william2 = new VipCustomer("William", 200000);
        william2.printAll();
        VipCustomer william3 = new VipCustomer();
        william3.printAll();

    }
}
