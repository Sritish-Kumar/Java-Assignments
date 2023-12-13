import java.util.Scanner;

public class Q1_Vote {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        if (age >= 18)
            System.out.println("You are eligible to cast your vote");
        scan.close();
    }

}
