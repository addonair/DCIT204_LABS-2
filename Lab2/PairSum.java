package Lab2;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least 2 elements to form a pair.");
            scanner.close();
            return;
        }

        int[] array = new int[n];

        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n - 1 && !found; i++) {
            for (int j = i + 1; j < n && !found; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println();
                    System.out.println(" Pair Found ");
                    System.out.println("Index " + i + " and Index " + j);
                    System.out.println("Values: " + array[i] + " and " + array[j]);
                    System.out.println("Equation: " + array[i] + " + " + array[j] + " = " + target);

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println();
            System.out.println("No pair found that sums to " + target + ".");
        }

        scanner.close();
    }
}