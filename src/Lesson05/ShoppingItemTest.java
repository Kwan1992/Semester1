package Lesson05;

import Lesson03.Tshirts;

import java.util.Scanner;

public class ShoppingItemTest {
    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);
        int budget;

        // TODO: show the user what items are available and how much they are, so that the user knows what to write as answer to the next questions
        System.out.println("Welcome to our show! We have Bags and Shoes, what you would like to buy?");
        String itemName = in.nextLine();
        System.out.println("Your item is :" + itemName);

        System.out.println("Type your budget : ");
        budget = in.nextInt();
        System.out.println("Your budget is: " + budget + " kr.");


        // TODO: compare "itemName" to the available items' name, so that you are not attempting to buy all the available items

        ShoppingItem item1 = new ShoppingItem("Shoes", 200);
        ShoppingItem item2 = new ShoppingItem("Bag", 100);

        if (itemName.equals(item1.itemName)){
            item1.payItem(budget);
        }
        if (itemName.equals(item2.itemName)){
            item2.payItem(budget);
        }

    }
}
