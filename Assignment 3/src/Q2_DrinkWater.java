import java.util.Scanner;

public class Q2_DrinkWater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the ml of water you drank today: ");
        long water = scan.nextLong();
        final int prescribed = 5000;
        if (water >= prescribed)
            System.out.println("Alice is following doctor's Advise");
        else
            System.out.println("Alice is not following doctors Advide");
        scan.close();
    }
}
