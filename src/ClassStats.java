import java.util.Scanner;

public class ClassStats {
    public static void main(String[] args) {
        int numStudents;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numStudents = input.nextInt();
        while (numStudents <= 0) {
            System.out.print("Number of items must be positive, re-enter the number of items: ");
            numStudents = input.nextInt();
        }

        int[] grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student number "+ (i+1) + ": ");
            grades[i] = input.nextInt();
        }

        double sum = 0;

        for (int i = 0; i < numStudents; i++) {
            sum += grades[i];
        }
        double average = sum/numStudents;
        int min = grades[1];
        int max = grades[1];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            } else if (grades[i] > max) {
                max = grades[i];
            }
        }

        System.out.println("The average is: "+ String.format("%.2f", average));
        System.out.println("The minimum is: "+ min);
        System.out.println("The maximum is: "+ max);

    }
}
