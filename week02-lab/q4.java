import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {

        String[] zodiac = { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit",
                "dragon", "snake", "horse", "sheep" };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");

        int year = sc.nextInt() % 12;

        System.out.println(zodiac[year]);

    }

}