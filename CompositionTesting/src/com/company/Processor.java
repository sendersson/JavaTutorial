package com.company;

public class Processor {

    private String manufacturer;
    private String model;
    private int ghz;
    private int cores;

    public Processor(String manufacturer, String model, int ghz, int cores) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ghz = ghz;
        this.cores = cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getGhz() {
        return ghz;
    }

    public int getCores() {
        return cores;
    }
}
