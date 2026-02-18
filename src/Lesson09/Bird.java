package Lesson09;

public class Bird extends Pet {
    //Add a new private attribute winSpan:
    private double wingSpan;

    //A constructor
    //Getter and setter methods
    Bird(String name, double wingSpan) {
    super(name);
    this.wingSpan = wingSpan;
    }

    //Override the toString() method
    //The toString() method should print:
    //Name, Wing span
    @Override
    public String toString (){
        return "Bird: " + getName() +  " (chirp chirp!) ";
    }
}






    //Getter and setter methods


