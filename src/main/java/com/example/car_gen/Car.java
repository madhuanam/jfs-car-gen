package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed ;
    private boolean isElectric ;

    public Car(String color,int year, int maxSpeed){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public int accelerateSpeed() {
        int newSpeed = this.speed + 5;
        if(newSpeed <= this.maxSpeed){
            this.speed = newSpeed;
        }
        else{
            this.speed = maxSpeed;
        }
        return this.speed;
    }

    public int decelerateSpeed() {
        int newSpeed = this.speed - 5;
        if(newSpeed >= 0){
            this.speed = newSpeed;
        }
        else{
            this.speed = 0;
        }
        return this.speed;
    }

    public boolean convertToElectric()
    {
        if(this.isElectric){
            System.out.println("Already electric car");
        }
        else{
            this.isElectric = true;
        }
        return this.isElectric;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }


    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }


    public boolean getIsElectric(){
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric){
        this.isElectric = isElectric;
    }
}
