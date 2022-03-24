import java.util.Scanner;
import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int NUM_ITEMS;
        int i;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = input.nextInt();
        while (NUM_ITEMS<=0) {
            System.out.print("Number of items must be positive, re-enter the number of items: ");
            NUM_ITEMS = input.nextInt();
        }


        int[] myArray = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
        for (i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }

        System.out.println("The values are: "
                + Arrays.toString(myArray));
    }
}
