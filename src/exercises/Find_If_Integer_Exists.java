package exercises;

public class Find_If_Integer_Exists {

    public static void main(String[] args) {

        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;

        for (int i : someInts) {
            // since arrays are primitive type, can use ==
            if (i == searchTerm) {
                System.out.println("Found it!");
                break;
            }
        }

    }
}
