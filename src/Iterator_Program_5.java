import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Program_5 {

    /**
     * Write a Java program to iterate through all elements in an array list using
     * Iterater.
     */

    //Declare ArrayList as an instance variable
    ArrayList<String> elements;

    //Constructor to initialize the Arraylist
    public Iterator_Program_5() {
        elements = new ArrayList<>();
    }

    //method to add elements to the ArrayList
    void addElements() {

        //Adding some elements to the ArrayList
        elements.add("Element 1");
        elements.add("Element 2");
        elements.add("Element 3");
        elements.add("Element 4");
        elements.add("Element 5");
    }

    //Method to iterate through all elements in the ArrayList using Iterator
    void iteratorWithIterator() {
        System.out.println("Iterating through elements using Iterator: ");
        Iterator<String> iterator = elements.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
    //Main Method
    public static void main(String[] args) {

        // Creating an instance of ArrayListIterator
        Iterator_Program_5 iteratorProgram5 = new Iterator_Program_5();
        // Call the method to add elements
        iteratorProgram5.addElements();
        // Call the method to iterate through elements using Iterator
        iteratorProgram5.iteratorWithIterator();
    }
}
