/* Find the largest and smallest element in an array */

//package org.anjali.basicarrayprogram;

import java.util.*;

public class SmallLargeElement {
    public static void main(String[] args) {
        // Get user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements to insert in array");
        int n = sc.nextInt();

        // Create array
        int a[] = new int[n];

        // Enter array elements
        System.out.println("Enter values in array to check Min and Max");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Display array
        System.out.println("Display Array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        // Initialize min and max
        int min = a[0];
        int max = a[0];

        // Find min and max
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) min = a[i];
            if (a[i] > max) max = a[i];
        }

        // Display result
        System.out.println("\nSmallest Element in Array : " + min);
        System.out.println("Largest Element in Array : " + max);
    }
}


//OUTPUT

/*
 Enter Number of Elements to insert in array
10
Enter values in array to check Min and Max
10
20
30
40
50
60
70
80
90
100
Display Array
10	20	30	40	50	60	70	80	90	100	
Smallest Element in Array : 10
Largest Element in Array : 100
 
*/
