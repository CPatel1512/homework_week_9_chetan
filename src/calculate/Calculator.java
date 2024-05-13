package calculate;

public class Calculator {

    public void addition(int a,int b){

        System.out.println("Additon of " + a + " and " + b + " is :" +(a+b));
    }
    public void subtraction(int a , int b){
        System.out.println("subtraction of " + a + " and " + b + "is :" + (a-b));
    }
    public void multiplication(int a, int b){
        System.out.println("multiplication of " + a + " and " + b + " is :" +(a * b));
    }
    public void division(int a, int b) {
        if (b != 0) {
            System.out.println("Division of " + a + " and " + b + " is: " + ((double) a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }

    }
    public void calculateResult(int a, int b, char symbol){
        switch (symbol){
            case '+':
                addition(a,b);
                break;
            case'-':
                subtraction(a,b);
                break;
            case'*':
                multiplication(a,b);
                break;
            case'/':
                division(a,b);
                break;
            default:
                System.out.println("Invalid operation.");
        }

    }
}
