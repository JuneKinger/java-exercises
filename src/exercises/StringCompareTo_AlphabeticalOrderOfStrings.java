package exercises;

import java.util.Scanner;

public class StringCompareTo_AlphabeticalOrderOfStrings {
    public static void main(String[] args) {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of strings you would like to enter: ");
        count = scan.nextInt();

        Scanner scanStr = new Scanner(System.in);
        // String array size initialized to size of count entered
        String[] arr = new String[count];
        // User enters strings which are stored in the array
        System.out.println("Please enter your strings one at a time");

        for (int i = 0; i < count; i++) {
            arr[i] = scanStr.nextLine();
        }
        // close scanner
        scan.close();
        scanStr.close();

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        // display sorted strings
        System.out.println("Strings in sorted order:");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i] + ",");
        }
    }
}
