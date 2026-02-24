package Lesson11;

public class Video extends Item {

    private int durationTime;

    public Video(String title, int loanDays,int durationTime) {
        super(title, loanDays);
        this.durationTime = durationTime;
    }

    @Override
    public String toString() {
        return "Video | " + super.toString() + " Duration time (minutes) : " + durationTime;
    }
}

