import java.util.HashSet;

public class NumberSetProgram_8 {

    /**
     * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
     * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
     * else)
     */
// Declare HashSet as an instance variable
    HashSet<Integer> numberSet;
    //Constructor to initialize the HashSet
    public NumberSetProgram_8(){
        numberSet = new HashSet<>();
    }
    // Medthod to add numbers to the HashSet
    void addNumbers(){
        //Adding numbers to the HashSet
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);
    }
    // Method to show numbers between 1 to 10 presentg in the HashSet
    void showNumberInRange(){
        System.out.println("Number between 1 to 10 present in the set: ");
        for (int i =1;i<= 10; i++){
            if(numberSet.contains(i)){
                System.out.println(i);
            }else{
                System.out.println(i + " (not in set)");
            }

        }
    }
    //Main method
    public static void main(String[] args) {
        // Create an instance of the NumberSet8
        NumberSetProgram_8 numberSetProgram_8 = new NumberSetProgram_8();

        // call the method to add numbers to the set
        numberSetProgram_8.addNumbers();

        // call the method to show numbers in the range 1 to 10 present in the set
        numberSetProgram_8.showNumberInRange();
    }

}


