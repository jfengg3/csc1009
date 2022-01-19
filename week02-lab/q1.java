import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        final double PI = 3.14159;

        System.out.println("Enter a number for radius: ");

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        System.out.println("The area for the circle of radius " + radius + " is " + (radius * radius * PI));
    }

}