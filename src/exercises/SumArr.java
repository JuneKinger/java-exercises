package exercises;

public class SumArr {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {25, 4, 2, 9, 16};
        boolean ans = comp(a, b);
        System.out.println(ans);
    }

    public static boolean comp(int[] a, int[] b) {

        int count = 0;
        int mult = 0;
        for (int i = 0; i <= a.length; i++) {
            for (int j = 0; j <= b.length; j++) {
                mult = a[i] * a[i];
                if (mult == b[j]) {
                    count += 1;
                    break;
                }
            }
        }

        if (count == a.length) {
            return true;
        } else {
            return false;
        }
    }
}