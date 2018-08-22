package com.company;

public class LivingRoom {

    private int tv;
    private int sofas;
    private Windows windows;
    private int cats;

    public LivingRoom(int tv, int sofas, Windows windows, int cats) {
        this.tv = tv;
        this.sofas = sofas;
        this.windows = windows;
        this.cats = cats;
    }

    public int getTv() {
        return tv;
    }

    public int getSofas() {
        return sofas;
    }

    public Windows getWindows() {
        return windows;
    }

    public int getCats() {
        return cats;
    }
}
