package com.company;

public class Videocard {

    private int gig;
    private String model;
    private String manufacturer;

    public Videocard(int gig, String model, String manufacturer) {
        this.gig = gig;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public int getGig() {
        return gig;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
