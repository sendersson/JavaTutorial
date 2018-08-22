package com.company;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        // getTheCase().pressPowerButton(); Funkar också
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        // getMonitor().drawPixelAt(1050,760, "blue"); Funkar också
        monitor.drawPixelAt(1050,760, "blue");
    }

}
