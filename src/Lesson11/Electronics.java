package Lesson11;

public class Electronics extends Item {

    public Electronics(String title, int loanDays) {
        super(title, loanDays); }


    public String getDescription() {
        return "base value : ";
    }
    @Override
    public String toString() {
        return "Electronics | " + super.toString() + getDescription(); // String is the text not getting value
    }
}

