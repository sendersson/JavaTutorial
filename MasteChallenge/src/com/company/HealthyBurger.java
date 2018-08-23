package com.company;

public class HealthyBurger extends CreateBurger {


    public HealthyBurger(int baseCast, String bread, String meat) {
        super(baseCast, bread, meat);
        super.setMaximumAdditions(6);
    }

}
