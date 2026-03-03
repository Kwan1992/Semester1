package Lesson14;

public class Dog extends Tamagotchi {

    String food;
    String mood;

    Dog(String name, String energy, String food, String mood) {
        super(name, energy);
        this.food = food;
        this.mood = mood;
    }
    @Override
    public String getFood(){
        return "Dog loves " + food;

    }
    @Override
    public String getMood(){
        return "Dog is " + mood;
    }

    @Override
    public String toString (){
        return " Dog " + super.toString();
    }

}