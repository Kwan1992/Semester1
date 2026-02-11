package Lesson06;

public class BookTest {

    static void main(String[] args) {
        Book B1 = new Book("The Lord of the Rings: The fellowship of the Ring","J.R.R. Tolkien", 432 , true);
        Book B2 = new Book(" Harry Potter and the Philosopher's Stone", "J.K. Rowling");

        B1.setIsAvailable(false);
        B2.setIsAvailable(true);

        System.out.println(B1.toString());
        System.out.println();
        System.out.println(B2.toString());
    }
}
