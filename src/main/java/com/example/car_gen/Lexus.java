package com.example.car_gen;

public class Lexus extends Car{
    private boolean hasLeatherSeats;
    public Lexus(String color,int year, int maxSpeed
            ,boolean hasLeatherSeats)
    {
        super(color,year, maxSpeed);
        this.hasLeatherSeats = hasLeatherSeats;
    }


    public boolean getHasLeatherSeats(){
        return this.hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean hasLeatherSeats){
        this.hasLeatherSeats = hasLeatherSeats;
    }
}
