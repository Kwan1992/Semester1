package Lesson02;
//Exercise 3
//(1) use some of the arithmetic operators
//(2) start thinking about compound entities

public class Time {
    public static void main (String [] args){
       int hour = 10;
       int minute = 47;          //create variables named hour, minute, and second
       int second = 20;          //Assign values that are roughly the current time. Use a 24-hour clock
        System.out.print( "The number of seconds since midnight is ");
        System.out.print((hour*120)+minute*60+second);
        System.out.println("\tsecond");

        //Calculate and display the number of seconds remaining in the day.
        System.out.print( "The number of seconds remaining in the day is ");
        System.out.print(24*3600-((hour*3600)+minute*60+second));
        System.out.println("\tsecond");

        //Calculate and display the percentage of the day that has passed.
        System.out.print( "The percentage of the that has passed ");
        System.out.print((86400/38840)*100);
        System.out.println("\tsecond");

    }
}
