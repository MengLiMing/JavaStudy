package com.study.day1;

public abstract class Caravan {
    private double price;
    private String model;
    private String year;
    public abstract void goFast();
    public abstract void changeColor();


}

class subClass extends Caravan {
    @Override
    public void goFast() {

    }

    @Override
    public void changeColor() {

    }
}