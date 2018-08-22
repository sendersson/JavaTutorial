package com.company;

public class Celler {

    private boolean mold;
    private String wine;
    private int stairsDown;
    private int windows;

    public Celler(boolean mold, String wine, int stairsDown, int windows) {
        this.mold = mold;
        this.wine = wine;
        this.stairsDown = stairsDown;
        this.windows = windows;
    }

    public boolean isMold() {
        return mold;
    }

    public String getWine() {
        return wine;
    }

    public int getStairsDown() {
        return stairsDown;
    }

    public int getWindows() {
        return windows;
    }
}
