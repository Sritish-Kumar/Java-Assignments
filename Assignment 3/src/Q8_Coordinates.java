
// WAP to check where the entred coordinates lie on the axis or the quadrants
import java.util.Scanner;

public class Q8_Coordinates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("X: ");
        float x = scan.nextFloat();
        System.out.print("Y: ");
        float y = scan.nextFloat();

        if (x == 0) {
            System.out.print("Lies on the x axis");
        } else if (y == 0) {
            System.out.println("Lies on the y axis");
        } else if (x > 0 && y > 0) {
            System.out.println("Lies on the I Quad");
        } else if (x > 0 && y < 0) {
            System.out.println("Lies on the IV Quad");
        } else if (x < 0 && y < 0) {
            System.out.println("Lies in the III Quad");
        } else if (x < 0 && y > 0) {
            System.out.println("Lies on the II Quad");
        } else
            System.out.println("Its not a valid point");
        scan.close();
    }
}
