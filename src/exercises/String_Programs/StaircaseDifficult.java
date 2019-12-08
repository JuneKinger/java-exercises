package exercises.String_Programs;

import java.util.Scanner;


//Pseudocode
//
//        I will need a for loop, and within that loop I will need to nest 2 additional for loops.
//        My plan is to create a blank string that will have spaces added to it first,
//        then pound signs added second. The loops for spaces and pounds will depend on where
//        we are in the original loop.
//
//        for loop -> goes from 0 to n
//        variable print_string = ''
//        for loop -> adds the number of spaces to print_string
//        for loop -> adds the appropriate number of pounds to print_string
//        print(print_string)

public class StaircaseDifficult {

    /// Complete the staircase function below.
    static void staircase(int n) {
        String print_str = "";
        for (int i = 0; i < n; i++) {
            print_str = "";
            for (int j = 0; j < n-i; j++) {
                print_str = print_str + " ";
            }
            for (int k = 0; k <= i; k++) {
                print_str = print_str + "#";
            }
            System.out.println(print_str);
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
