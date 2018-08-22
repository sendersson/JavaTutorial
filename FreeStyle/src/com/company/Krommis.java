package com.company;

public class Krommis extends Dog {

    private String gender;
    private boolean isFluffy;

    Krommis(int size, boolean isGoodBoy, String gender, boolean isFluffy) {
        super(size, isGoodBoy, "Kromfohrländer");
        this.gender = gender;
        this.isFluffy = isFluffy;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isFluffy() {
        return isFluffy;
    }

    public void setFluffy(boolean fluffy) {
        isFluffy = fluffy;
    }

    void bark(int multipleBarks){
        for (int i = 0; i < multipleBarks; i++){
            System.out.println("Bark!");
        }
    }

    void printAll(){
        System.out.println(isFluffy());
        System.out.println(isGoodBoy());
        System.out.println(getGender());
        System.out.println(getSize());
        System.out.println(getBread());
    }

}
