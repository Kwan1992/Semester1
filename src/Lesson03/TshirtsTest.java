package Lesson03;

public class TshirtsTest {
    public static void main (String[] args){

        Tshirts t1 = new Tshirts();
        Tshirts t2 = new Tshirts();

        t1.color = "pink";
        t1.size = "S";
        t1.print = "unicorn";
        t1.cost = 19.50;
        t1.buyItem();

        t2.color = "black";
        t2.size = "M";
        t2.print = "smiley face";
        t2.cost = 19.50;
        t2.buyItem();


    }
}
