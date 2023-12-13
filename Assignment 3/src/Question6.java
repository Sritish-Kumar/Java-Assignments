// WAP to calculate the electric bill of a house based on the units consumed. For each segment of units consumed the price increases.

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the units used: ");
        double units = scan.nextDouble();
        double bill = 0;

        if (units <= 50)
            bill = units * 3;

        else if (units > 50 && units <= 200)
            bill = 50 * 3 + (units - 50) * 4.80;
        else if (units > 200 && units <= 400)
            bill = 50 * 3 + (150 * 4.80) + (units - 200) * 5.80;
        else if (units > 400)
            bill = 50 * 3 + (150 * 4.80) + (200 * 5.80) + (units - 400) * 6.20;

        System.out.println("Your bill is : " + bill);

        scan.close();

    }

}
