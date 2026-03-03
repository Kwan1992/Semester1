package Lesson14;

import java.security.PublicKey;

public class Cat extends Tamagotchi {

    String food;
    String mood;

    Cat(String name, String energy, String food, String mood) {
        super(name, energy);
        this.food = food;
        this.mood = mood;
    }
    @Override
    public String getFood(){
        return "Cat loves " + food;

    }
    @Override
    public String getMood(){
        return "Cat is " + mood;
    }

@Override
    public String toString (){
        return " Cat " + super.toString();
    }

}