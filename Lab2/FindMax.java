package Lab2;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            scanner.close();
            return;
        }

        int[] array = new int[n];

        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        int maxValue = array[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        System.out.println();
        System.out.println("Result");
        System.out.println("Maximum Value : " + maxValue);
        System.out.println("Found at Index: " + maxIndex);

        scanner.close();
    }
}

