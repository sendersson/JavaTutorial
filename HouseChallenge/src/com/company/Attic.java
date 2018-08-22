package com.company;

public class Attic {

    private int windows;
    private int boxes;
    private int stairsUp;

    public Attic(int windows, int boxes, int stairsUp) {
        this.windows = windows;
        this.boxes = boxes;
        this.stairsUp = stairsUp;
    }

    public int getWindows() {
        return windows;
    }

    public int getBoxes() {
        return boxes;
    }

    public int getStairsUp() {
        return stairsUp;
    }
}
