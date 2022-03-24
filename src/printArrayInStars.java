import java.util.Scanner;

public class printArrayInStars {
    public static void main(String[] args) {
        int NUM_ITEMS;
        int i;
        int u;
        String star = "*";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = input.nextInt();
        while (NUM_ITEMS <= 0) {
            System.out.print("Number of items must be positive, re-enter the number of items: ");
            NUM_ITEMS = input.nextInt();
        }

        int[] myArray = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
        for (i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt();
        }

        for (u = 0; u < myArray.length; u++) {
            System.out.println(u + ":" + star.repeat(myArray[u]) + "(" + myArray[u] + ")");
        }
    }
}
