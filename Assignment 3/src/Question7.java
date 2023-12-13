import java.util.Scanner;

public class Question7 {

    static double getBill(double units) {
        double bill = 0;

        if (units <= 50)
            bill = units * 3;

        else if (units > 50 && units <= 200)
            bill = 50 * 3 + (units - 50) * 4.80;
        else if (units > 200 && units <= 400)
            bill = 50 * 3 + (150 * 4.80) + (units - 200) * 5.80;
        else if (units > 400)
            bill = 50 * 3 + (150 * 4.80) + (200 * 5.80) + (units - 400) * 6.20;

        return bill;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the units: ");
        double units = scan.nextDouble();
        double bill = getBill(units);
        System.out.println("Your total bill is : " + bill);

        System.out.print("Do you want to pay online(y/n): ");
        scan.nextLine();
        String check = scan.nextLine().toLowerCase();
        System.out.println(check);
        if (check.equals("y")) {
            double dis = 0.03 * bill;
            System.out.println("Discount(3%) : " + (float) dis);
            System.out.println("Payable Amount : " + (bill - dis));
        } else {
            System.out.println("Total Payable amount is: " + bill);
            System.out.println("pay online next time to avail 3% discount");
        }

        scan.close();

    }

}
