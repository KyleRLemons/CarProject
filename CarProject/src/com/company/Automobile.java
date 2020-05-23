package com.company;

public class Automobile {

    private String description = "";
    private int odometer = 0;
    private int speed = 0;
    private char gear = ' ';


    public String getDescription(){
        return description;
    }

    public String setDescription(String description){
        this.description = description;
        return description;
    }



    public int setOdometer(int odometer){
        this.odometer = odometer;
        return odometer;
    }
    public int getOdometer(){
        return odometer;
    }


    public int setSpeed(int speed){
        this.speed = speed;
        return speed;
    }
    public int getSpeed(){
        return speed;
    }


    public char setGear(char gear){
        this.gear = gear;
        return gear;
    }
    public char getGear(){
        return gear;
    }


    public void display(){
        System.out.printf("\nDescription: %s", getDescription());
        System.out.printf("\nOdometer: %d miles", getOdometer());
        System.out.printf("\nSpeed: %dmph",getSpeed());
        System.out.printf("\nGear: %c",getGear());

        System.out.println();
    }


}
