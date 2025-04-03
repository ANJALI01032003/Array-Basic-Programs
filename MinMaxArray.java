// Write a program to find the maximum and minimum value in an unsorted array.

//package org.anjali.basicarrayprogram;

import java.util.*;

public class MinMaxArray {
    public static void main(String[] args) {
        // Get array size from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        int n = sc.nextInt();

        // Create array
        int a[] = new int[n];

        // Get array elements from user
        System.out.println("Enter Element in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Initialize min and max with first element
        int min = a[0];
        int max = a[0];

        // Find min and max in array
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i]; // Update max
            }
            if (a[i] < min) {
                min = a[i]; // Update min
            }
        }

        // Display result
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
