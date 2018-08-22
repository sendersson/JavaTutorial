package com.company;

public class Computer {

    private Case theCase;
    private Ram ram;
    private Processor processor;
    private Videocard videocard;

    public Computer(Case theCase, Ram ram, Processor processor, Videocard videocard) {
        this.theCase = theCase;
        this.ram = ram;
        this.processor = processor;
        this.videocard = videocard;
    }

    void restart(){
        System.out.println("Shutting down...");
        theCase.powerUp();
    }

    public Case getTheCase() {
        return theCase;
    }

    public Ram getRam() {
        return ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Videocard getVideocard() {
        return videocard;
    }
}
