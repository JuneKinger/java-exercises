package exercises;

import java.util.ArrayList;

public class ArrayList_Strings {
    public static void main(String[] args) {
        ArrayList<String> arrString = new ArrayList<>();

        arrString.add("The");
        arrString.add("quick");
        arrString.add("brown");
        arrString.add("fox");
        arrString.add("jumps");
        arrString.add("over");
        arrString.add("the");
        arrString.add("fence");

        int j = 0;
        for (j=0; j < arrString.size(); j++) {
            //System.out.println(arrString.get(j).length());//
             if (arrString.get(j).length() == 5) {
                System.out.println(arrString.get(j));

            }
        }

    }
}
