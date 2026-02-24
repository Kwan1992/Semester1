package Lesson10;

public class Bed extends Furniture {
   private String size;

        public Bed (String name, double price, String material, String size) {
            super(name, price, material);
            this.size = size;
        }
        String getSize() {
        return size;
    }

        void setSize (String size) { this.size = size;}

        public String getDescription() {return "Bed with size King bed";}
        public double calculateShippingCost() {return getPrice() * 100;}

        @Override
        public String toString() {
            return " Bed | " + super.toString() + "\n "
            + getDescription() + "\n " +
            " The shipping cost : " + calculateShippingCost();
        }
    }

