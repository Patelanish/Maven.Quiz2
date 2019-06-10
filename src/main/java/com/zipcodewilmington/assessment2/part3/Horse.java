package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal {

    public Horse () {


    }




    public String move() {
        return "gallop";
    }

    @Override
    public int getSpeed() {
        return 40;
    }

    public String color() {
        return"brown";

    }




}
