package Lesson14;
import Lesson11.Book;
import Lesson11.Item;
import java.util.ArrayList;
import java.util.Scanner;

public class TamagotchiTest {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int type = askForTamagotchiType(scanner);
        createTamagotchi(scanner, type);

        scanner.close();
    }

    public static int askForTamagotchiType(Scanner scanner) {

        System.out.println(" Hello, Would you like to create a dog or a cat?\n Press 1 for dog, and press 2 for cat");

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();

                if (number == 1) {
                    System.out.println("Ahh! You would like to create a dog.");
                    return 1;

                } else if (number == 2) {
                    System.out.println("Ahh! You would like to create a cat.");
                    return 2;

                } else {
                    System.out.println("Enter the correct number");
                    scanner.nextLine();
                    System.out.println("Please enter a number.");
                    scanner.nextLine();

                }
            }
        }
    }
    public static void createTamagotchi (Scanner scanner, int type) {

        System.out.println("What should the name be?");
        String name = scanner.nextLine();

        if (type ==1){
            System.out.println( "Nice! You created a dog name " + name);
            System.out.println(
                    " " +
                    "  _='`'=_\n" +
                    "  //(@_@)\\\\\n" +
                    "  |||(Y)|||    " +
                    "  \\\\\\\\ ////" +
                    "   / )`( \\   " +
                    "<\\(  )'(  )\n" +
                    " (__w)_(w__)");
        } else {
            System.out.println( "Nice! You created a cat named " + name);
            System.out.println("     /\\_____/\\\n" +
                    "   /  o   o  \\\n" +
                    "  ( ==  ^  == )\n" +
                    "   )         (\n" +
                    "  (           )\n" +
                    " ( (  )   (  ) )\n" +
                    "(__(__)___(__)__)");
        }
    }
}
/*public static int askForTamagotchiMood(Scanner scanner) {

    System.out.println("What would you like to do?");

    while (true) {
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            scanner.nextLine();

            if (number == 1) {
                System.out.println("1 - Play");
                return 1;

            } else if (number == 2) {
                System.out.println("2 - Feed");
                return 2;

            } else if (number == 3) {
                System.out.println("3 - Sleep");
                return 3;

            } else {
                System.out.println("Enter the correct number");
                scanner.nextLine();
                System.out.println("Please enter a number.");
                scanner.nextLine();

            }
        }
    }*/



