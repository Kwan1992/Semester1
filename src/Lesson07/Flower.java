package Lesson07;

import Lesson06.Tile;

import java.util.Scanner;

public class Flower {
    // Contain attributes that describe a flower
    String name;
    String colour;
     int price;
    private boolean isAvailable;


    // have at least one constructor
    Flower (String name, String colour, int price, boolean isAvailable){
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.isAvailable = isAvailable;
    }

        Flower (String name, int price, boolean isAvailable){
            this.name = name;
            this.colour = "";
            this.price = price;
            this.isAvailable = isAvailable;

    }
    // include getter methods

         String getName(){
            return this.name = name;
         }
        String getColour(){
        return this.colour = colour;
    }
        int getPrice(){
        return this.price = price;
    }

        boolean getIsAvailable(){
        return this.isAvailable = isAvailable;
    }
    // include at least one setter method

         void setPrice (int price){
            this.price = price;
        }
         void setIsAvailable (boolean isAvailable){
            this.isAvailable = isAvailable;
        }
    // include a toString method

    @Override
    public String toString() {
        return getName() + ":" + getColour()
                + "\t" + "price " + getPrice() + " kr."
                + " " + getIsAvailable() + "\t" + ":" +
                (isAvailable? "It's available" : "It's our of order");
    }

}
