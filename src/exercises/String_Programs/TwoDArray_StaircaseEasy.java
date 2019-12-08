package exercises.String_Programs;

import java.util.Scanner;


//Pseudocode
//
//    Complete the staircase function below.
//    The staircase is actually printed on a 2D array.
//    If (row index + column index) > n, print “#”; otherwise, print ” “

public class TwoDArray_StaircaseEasy {

    static void staircase(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if ((i + j) < n) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int n = 6;
        staircase(n);

//        scanner.close();
    }
}
