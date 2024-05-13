import java.util.ArrayList;

public class DeclareArrayList {
    /**
     * Declare following two arrylist and compare it.
     * ArrayList<String> c1= new ArrayList<String>();
     * c1.add("Red");
     * c1.add("Green");
     * c1.add("Black");
     * c1.add("White");
     * c1.add("Pink");
     * ArrayList<String> c2= new ArrayList<String>();
     * c2.add("Red");
     * c2.add("Green");
     * c2.add("Black");
     * c2.add("Pink");
     */
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Check if all elements of c1 are present in c2
        boolean isEqual = true;
        for (String element : c1) {
            if (!c2.contains(element)) {
                isEqual = false;
                break;
            }
        }

        // Check if all elements of c2 are present in c1
        for (String element : c2) {
            if (!c1.contains(element)) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            System.out.println("ArrayLists c1 and c2 are equal.");
        } else {
            System.out.println("ArrayLists c1 and c2 are not equal.");
        }
    }


}
