package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        System.out.println("Number of miles driven: ");
        double miles = in.nextDouble();

        System.out.println("Gas consumed (in gallons): ");
        double gallons = in.nextDouble();

        double milesPerGallon = miles / gallons;
        System.out.println("Your miles per gallon: " + milesPerGallon);

    }
}
