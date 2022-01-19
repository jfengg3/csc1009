import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = (totalMilliseconds / 1000) % 60;
        long totalMinutes = ((totalMilliseconds / 1000) / 60) % 60;
        long totalHours = (((totalMilliseconds / 1000) / 60) / 60) % 24;
        System.out.println("Current time is " + totalHours + ":" + totalMinutes + ":" + totalSeconds);
    }

}
