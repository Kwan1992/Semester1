package Lesson05;

public class Ride {
    String name;
    int minimumHeight;

    Ride(String name, int minimumHeight){
        this.minimumHeight = minimumHeight;
        this.name = name;
    }

    void isVisitorAllowedToRide(int visitorHeight) {
        if(visitorHeight > this.minimumHeight){
            System.out.println("Visitor is allowed to ride on the " + this.name);
        }
        else {
            System.out.println("Can't ride on " + this.name);
        }
    }

}
