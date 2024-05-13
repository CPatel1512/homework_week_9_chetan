package calculate;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char choice = 1;
        do {
            System.out.print("Enter firstr number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Please enter one of the symbols +, -, *, /: ");
            char symbol = scanner.next().charAt(0);
            calculator.calculateResult(num1, num2,symbol);
            System.out.print("Would you like to do more calculation? please enter  'Y' or 'N'");

        }while (choice == 'Y' || choice == 'y');
        scanner.close();
    }


}
