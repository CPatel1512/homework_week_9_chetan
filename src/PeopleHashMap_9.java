import java.util.HashMap;
import java.util.Map;

public class PeopleHashMap_9 {

    /**
     * Create a HashMap object called people that will store String keys and Integer
     * values: And use for each loop to iterate the value from Map.
     */

    // Declare GHashMap as an instance variable
    Map<String ,Integer> people;
    //Constructor to initialise HashMap
    public PeopleHashMap_9(){

        people = new HashMap<>();
    }
    // Method to add entries to the HashMap
    void addEntries(){
        //Adding some entries to the HashMap
        people.put("John", 25);
        people.put("Alice", 30);
        people.put("Bob" ,28);
        people.put("Emily", 35);
        people.put("David", 40);
    }
    // Method to iterate through the values in the HashMap using a forEach loop
    void iterateValues(){
        System.out.println("Values in the map: ");
        for(Integer value : people.values()){
            System.out.println(value);
        }
    }
    //Main method
    public static void main(String[] args) {
        // Create an instance of PeoplehashMap9
        PeopleHashMap_9 peopleHashMap_9 = new PeopleHashMap_9();
        // call the method to add entries to the map
        peopleHashMap_9.addEntries();
        // call the method to iterate through the values in the map
        peopleHashMap_9.iterateValues();
    }
}
