package com.example.car_gen;

public class Main {
    public static void main(String[] args){
        Honda civic = new Honda("grey",2021,13,false);
        Lexus rx350 = new Lexus("red",2020,100,true);
        Toyota supra = new Toyota("green",2022,80,true);

        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());

        for(int i=0 ; i< 20; i++) {
            System.out.println("For "+ i + " loop: Current speed is " + civic.getSpeed()
                    + " MaxSpeed for the car is " + civic.getMaxSpeed());

            //civic.accelerateSpeed();
            //civic.decelerateSpeed();
            if(Math.random() < 0.5) {
                //System.out.println("Accelerating");
                civic.accelerateSpeed();
            }
            else{
                //System.out.println("Decelerating");
                civic.decelerateSpeed();
            }
        }

        if(civic.getIsElectric()){
            System.out.println(civic.getClass() + "Already electric car");
        }
        else
        {
            civic.convertToElectric();
            System.out.println("Converted to Electric ");
        }

    }
}
