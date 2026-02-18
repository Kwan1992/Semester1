package Lesson10;

public  class Table extends Furniture {

        private int numberOfLegs;

        public Table (String name, double price, String material, int numberOfLegs) {
            super(name, price, material);
            this.numberOfLegs = numberOfLegs;
        }

    int getNumberOfLegs() {
        return numberOfLegs;
    }

    void setNumberOfLegs (int size) { this.numberOfLegs = numberOfLegs;}

    public int getDescription() {return  4 ;}
    public double calculateShippingCost() {return getPrice() * 100;}

    @Override
        public String toString() {
            return " Table | " + super.toString() + getDescription() + calculateShippingCost();
        }
    }

