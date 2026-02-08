package Lesson05;

import java.util.Scanner;

public class tivoliRideTest {

    public static void main (String[] args){

        int visitorHeight;
        Scanner in = new Scanner(System.in);

        System.out.println("How tall are you?");
        visitorHeight =in.nextInt();
        System.out.println("Your height is : " + visitorHeight );


        tivoliRide ride1 = new tivoliRide("The Demon",130);
        ride1.isGuestAllowToRide(visitorHeight);


        tivoliRide ride2 = new tivoliRide("The Camel Trail",120);
        ride2.isGuestAllowToRide(visitorHeight);


    }
}
