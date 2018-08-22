package com.company;

public class Case {

    private Dimensions dimensions;
    private String model;
    private String manufacturer;

    public Case(Dimensions dimensions, String model, String manufacturer) {
        this.dimensions = dimensions;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    void powerUp(){
        System.out.println("Booting up");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
