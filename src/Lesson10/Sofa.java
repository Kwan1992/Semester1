package Lesson10;

public class Sofa extends Furniture {
        private int seats;

        public Sofa (String name, double price, String material, int seats) {
            super(name, price, material);
            this.seats = seats;
        }

    int getSeats() {
        return seats;
    }

    void setSeats (int seats) { this.seats = seats;}


    public int getDescription() {return 4;}
    public double calculateShippingCost() {return getPrice() * 25;}


        @Override
        public String toString() {
            return "Sofa | " + super.toString()
                    + getDescription() + calculateShippingCost();
        }
    }
