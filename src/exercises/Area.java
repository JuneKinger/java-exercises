package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");

        double length = in.nextDouble();

        System.out.println("Enter the width of the rectangle: ");

        double width = in.nextDouble();

        System.out.println("The area of the rectangle is: " + length * width);


    }
}
