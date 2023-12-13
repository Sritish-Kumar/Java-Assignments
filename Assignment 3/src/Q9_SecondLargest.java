// WAP to find the second largest element of n numbers. 

import java.util.Arrays;
import java.util.Scanner;

public class Q9_SecondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers separated by space. Like 1 2 3 4 5");
        String[] st = scan.nextLine().split(" "); // Taking input in one line and spliting them by " "

        int[] list = new int[st.length];
        int j = 0;
        for (String i : st) { // Converting the String elements of the list to int
            list[j] = Integer.parseInt(i);
            j++;
        }

        System.out.println(Arrays.toString(list)); // The obtained list with int elemetns

        int max = list[0]; // Let the 1st elemt is max
        int maxp = Integer.MIN_VALUE; // 2nd last ele holder

        for (int i : list) {
            if (i > max) { // if ele > max
                maxp = max; // we got a element greater than max therfore max becomes the 2nd largest
                            // element
                max = i; // the new element becomes the max element
            }
            if (i < max & i > maxp) {
                maxp = i;
            }

        }
        System.out.println("Maximum is: " + max);
        System.out.println("2nd Maximum is: " + maxp);
        scan.close();
    }

}
