import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        double avg, a, b, c;
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        avg = (a + b + c) / 3;

        System.out.println("The average of " + a + " " + b + " " + c + " is " + avg);

    }
}