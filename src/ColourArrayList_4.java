import java.util.ArrayList;

public class ColourArrayList_4 {

    /**
     * Write a Java program to create a new array list, add some colours (string) and
     * printout the collection using for each loop.
     *

     */

    // Declare ArrayList as an Instance variable
    ArrayList<String> colors;
    // Declare Constructor to initialize the ArrayList
    public ColourArrayList_4(){
        colors = new ArrayList<>();
    }
    //Method to add colors to the ArrayList
    void addColors(){
        //Adding some colors to the ArayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
    }
    //Method to Print the ArrayList using a foreach loop
    void printColors(){
        System.out.println("Colors in the list: ");
        for(String color : colors){
            System.out.println(color);
        }
    }
    //Main method
    public static void main(String[] args) {
        //create an Instance of ColorArrayList_4
        ColourArrayList_4 colourArrayList_4 = new ColourArrayList_4();
        //Call the Method to add colors
        colourArrayList_4.addColors();
        // Call the method to print colors
        colourArrayList_4.printColors();
    }
}
