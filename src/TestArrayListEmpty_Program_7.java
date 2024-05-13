import java.util.ArrayList;

public class TestArrayListEmpty_Program_7 {
    /**
     * Write a Java program to test if an array list is empty or not.
      */

//Declare ArrayList as an Instance variable
    ArrayList<String> elements;
    // Constructor to initializing ArrayList
    public TestArrayListEmpty_Program_7(){
        elements = new ArrayList<>();
    }
    // Method to add elements to the ArrayList
    void addElements(){
        //Adding some elements to ArrayList
        elements.add("Element 1");
        elements.add("Element 2");
        elements.add("Element 3");
        elements.add("Element 4");
    }
    //Method to test if the ArrayList is empty
    boolean isArrayListEmpty(){

        return elements.isEmpty();
    }
    // Main method
    public static void main(String[] args) {
        //creat an instance of TestArrayListEmpty7
        TestArrayListEmpty_Program_7 testArrayListEmpty_program_7 = new TestArrayListEmpty_Program_7();
        //Call the Method to add elements
        testArrayListEmpty_program_7.addElements();

        //Call the method to test if the ArrayList is empty
        boolean isEmpty = testArrayListEmpty_program_7.isArrayListEmpty();
        // Print the result
        if (isEmpty){
            System.out.println("The ArrayList is empty ");

        }else {
            System.out.println("The ArrayList is not empty ");
        }
    }
}
