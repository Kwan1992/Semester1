package Lesson05;

public class ShoppingItem {
    String itemName;
    int price;


    public ShoppingItem (String itemName,int price) {
        this.itemName = itemName;
        this.price = price;

    }

        public void payItem (int budget) {

            if (budget >= price) {
                System.out.println("You can buy our items : " + itemName);
            } else {
                System.out.println("You cant buy our items");
            }
        }
    }

