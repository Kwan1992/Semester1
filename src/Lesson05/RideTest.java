package Lesson05;

import java.util.Scanner;

public class RideTest {

    public static void main (String[] args) {
        int visitorHeight;
        Scanner in = new Scanner(System.in);
        System.out.println("How tall are you?");
        visitorHeight = in.nextInt();
        System.out.println("Your height : " + visitorHeight);

        Ride daemonRide = new Ride("Daemon", 150);
        daemonRide.isVisitorAllowedToRide(visitorHeight);

        Ride pirateBoatRide = new Ride("Pirate boat", 110);
        pirateBoatRide.isVisitorAllowedToRide(visitorHeight);

    }
}
