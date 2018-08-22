package com.company;

public class Windows {

    private int layerOfGlass;
    private int width;
    private int height;

    public Windows(int layerOfGlass, int width, int height) {
        this.layerOfGlass = layerOfGlass;
        this.width = width;
        this.height = height;
    }

    public int getLayerOfGlass() {
        return layerOfGlass;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
