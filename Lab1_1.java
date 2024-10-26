package edu.neu.mgen;

import java.util.Arrays;

public class Lab1_1 {
    public static void main(String[] args) {
        int[] x = {1, 27, 3, 40, 15};
        int[] y = {6, 17, 82, 4, 10};

        // Create a array to hold all elements
        int[] combined = new int[x.length + y.length];
        System.arraycopy(x, 0, combined, 0, x.length);
        System.arraycopy(y, 0, combined, x.length, y.length);

        // Sort the combined array
        Arrays.sort(combined);
        
        // Create array z to hold the top maximum elements
        int[] z = new int[5];
        for (int i = 0; i < x.length; i++) {
            z[i] = combined[combined.length - 1 - i];
        }

        Arrays.sort(z);

        printArray("Array x", x);
        printArray("Array y", y);
        printArray("Array z = x + y", z);
    }

    private static void printArray(String name, int[] array) {
        System.out.print(name + " = { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
}
