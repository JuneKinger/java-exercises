package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args)  {
        double radius = -1;
        Scanner in = new Scanner(System.in);

         while (radius < 0) {
             System.out.print("Enter a radius: ");
             radius = in.nextDouble();
             if (radius < 0) {
                 System.out.print("Invalid input... ");
            } else {
               System.out.println("The area of a circle of radius " + radius + " is: " + 3.14 * radius * radius);
            }

        }
    }
}
