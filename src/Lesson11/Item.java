package Lesson11;

public abstract class Item {

    private String title;
    private int loanDays;


    // Constructor
    public Item(String title, int loanDays) {
        this.title = title;
        this.loanDays = loanDays;
    }

    // Getter
    public String getTitle() {
        return title;
    }


    public abstract String getDescription();


    // toString method
    @Override
    public String toString() {
        return "Title: " + title + ", " + getDescription() + ", Loan days: " + loanDays;
    }
}

