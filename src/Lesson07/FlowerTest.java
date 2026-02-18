package Lesson07;

import javax.sql.RowSet;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FlowerTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Ask user

        Flower[] shop = new Flower[4];           // several Flower objects using new

        Flower flower1 = new Flower("Rose", "red", 30, true);
        Flower flower2 = new Flower("Sunflower", 25, true);
        Flower flower3 = new Flower("Tulip", "pink", 20, true);
        Flower flower4 = new Flower("Orchid", "white", 45, true);

        shop[0] = flower1;          //Store the objects in the array
        shop[1] = flower2;
        shop[2] = flower3;
        shop[3] = flower4;

        flower1.setIsAvailable(false);
        flower3.setIsAvailable(false);
        flower2.setPrice(100);

        System.out.println("Welcome to our Flower shopping Online. Here are our flower information");
        System.out.println();

        for (int i = 0; i <= 3; i++) {          // Print all flowers stored in the array
            System.out.println(shop[i]);
        }
        // search
        System.out.println();
        System.out.println ("Type which flower would you like to buy buy?");
        String name = in.nextLine();

        boolean found = false;
        //calculate total price for the payment
        for (int i = 0; i < shop.length; i++) {
            if (name.equalsIgnoreCase(shop[i].getName())) {
                found = true;

                System.out.println("How many do you want"); // do this in loop
                int amount = in.nextInt();
                System.out.println("Total price : " + (amount * shop[i].getPrice()));
                break;
            }
        }
            if (!found) {
                System.out.println("Sorry, we don’t have that flower.");
            }
        }
    }
