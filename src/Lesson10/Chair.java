package Lesson10;

public class Chair extends Furniture {
    //Chair: private boolean hasArmRest
    boolean hasArmRest;

    public Chair (String name, double price, String material, boolean hasArmRest) {
        super(name, price, material);
    }
    public boolean getHasArmRest() {
        return hasArmRest;
    }

    public void setHasArmRest(boolean hasArmRest) {
        this.hasArmRest = hasArmRest;
    }
    public String getDescription() {return "Chair with Armrest" + hasArmRest;}
    public double calculateShippingCost() {return getPrice() * 20;}

    @Override
    public String toString() {
        return "Chir " + super.toString()
                + hasArmRest + getDescription()
                + calculateShippingCost();
    }
}


