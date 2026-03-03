package Lesson15;
import java.io.FileWriter;
import java.io.IOException;

public class StoryFileWriter {
    public static void main(String[] args) {
        long start = System.nanoTime();

        try (FileWriter fileWriter = new FileWriter("fairytaleOutput.txt")) {
            fileWriter.write("Once upon a time in a small village,\n" +
                    "there lived a young programmer.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long duration = endTime - start;

        System.out.println("CPU tid (nanoSecond): " + duration);
        System.out.println("File should be in: " + System.getProperty("user.dir"));
    }
}
