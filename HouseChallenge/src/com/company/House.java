package com.company;

public class House {

    private LivingRoom livingRoom;
    private Bathroom bathroom;
    private Attic attic;
    private Celler celler;

    public House(LivingRoom livingRoom, Bathroom bathroom, Attic attic, Celler celler) {
        this.livingRoom = livingRoom;
        this.bathroom = bathroom;
        this.attic = attic;
        this.celler = celler;
    }

    public void goToBathroom(){
        bathroom.takeAShit();
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public Attic getAttic() {
        return attic;
    }

    public Celler getCeller() {
        return celler;
    }
}
