package com.company;

public class GermanShepherd extends Dog {

    private boolean isClean;
    private boolean isNiceDoggy;

    public GermanShepherd(String race, String gender, boolean isFluffy, boolean isClean, boolean isNiceDoggy) {
        super(race, gender, isFluffy);
        this.isClean = isClean;
        this.isNiceDoggy = isNiceDoggy;
    }

    @Override
    public void eating() {
        chew();
        super.eating();
    }

    private void chew(){
        System.out.println("Chewing before eating");
    }

    @Override
    public void bark() {
        System.out.println("Bonus bark");
        super.bark();
    }

}
