
// WAP to check whether the numbers are increasing, desc or both from a sequence of n numbers;
import java.util.Scanner;

public class Q3_InscDesc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int c = scan.nextInt(); // 1st number
        boolean insc = false;
        boolean desc = false;
        for (int i = 1; i < 3; i++) { // other numbers. Here will take 2 more numbers;
            int n = scan.nextInt();
            if (n > c) {
                insc = true;
                c = n;
            } else if (c > n) {
                c = n;
                desc = true;
            }
        }
        if (insc && desc == true)
            System.out.println("Neither insc or desc");

        else if (insc == true)
            System.out.println("Incresing");
        else if (desc == true)
            System.out.println("Decreasing");
        else
            System.out.println("All number are same");
        scan.close();
    }
}
// If you dont like the previous one you can try this one:

// int a=5,b=10,c=3;
// System.out.println((a<b&b<c)?"Insc":(a>b&b>c)?"Desc":"Neither");
