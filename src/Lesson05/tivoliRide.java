package Lesson05;

public class tivoliRide {
 String ride;
 int minimumHeight;

    tivoliRide (String ride, int minimumHeight){
     this.ride = ride;
     this.minimumHeight = minimumHeight;
 }

public void isGuestAllowToRide (int visitorHeight){
    if ( visitorHeight < minimumHeight ){
        System.out.print(" Sorry, You almost make it!");

    }else{
        System.out.println(
                " Your height is : " + visitorHeight + "cm," +
                " You can fo on " + ride + "," +
                " Enjoy the ride!"
        );
    }
}
}