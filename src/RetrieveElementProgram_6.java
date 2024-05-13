import java.util.ArrayList;

public class RetrieveElementProgram_6 {

    /**
     * Write a Java program to retrieve an element (at a specified index) from a given
     * array list
     */

    // Declare ArrayList as an Instance variable
    ArrayList<String> elements;
    //Constructor to initialize the ArrayList
    public RetrieveElementProgram_6(){
        elements = new ArrayList<>();
    }
    //Method to add elements to the ArrayList
    void addElements(){
        //adding some elements to the ArrayList
        elements.add("Element 1");
        elements.add("Element 2");
        elements.add("Element 3");
        elements.add("Element 4");
        elements.add("Element 5");
    }
    //Method to Retrieve an element at a specified index from the ArrayList
    String getElementAtIndex(int index){
        if (index >= 0 && index < elements.size()){
            return elements.get(index);
        }else{
            return "Index out of bounds";
        }
    }
    // Main Method
    public static void main(String[] args) {
        // Crfeate an object
        RetrieveElementProgram_6 retrieveElementProgram_6 = new RetrieveElementProgram_6();
        // Call the method to add elements
        retrieveElementProgram_6.addElements();
        // specify the index to retrive
        int indexToRetrieve = 2;
        // Call the method to retrieve an element at the specified index
        String element = retrieveElementProgram_6.getElementAtIndex(indexToRetrieve);
        //Print the retrieved element
        System.out.println("Element at index " + indexToRetrieve + " : " + element);
    }

}
