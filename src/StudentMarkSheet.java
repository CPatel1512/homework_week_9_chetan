import java.util.Scanner;

/**
 * Using if else and while
 * Write a java program to input student Name, roll No, and three subjects Math,
 * Science and English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input,
 * Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %>
 */
public class StudentMarkSheet {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String name;
            int rollNo, math, science, english;

            // Input student details
            System.out.print("Enter student Name: ");
            name = scanner.nextLine();

            System.out.print("Enter Roll No: ");
            rollNo = scanner.nextInt();
            System.out.println("Enter Maths : ");
            math = scanner.nextInt();
            System.out.println("Enter English : ");
            english = scanner.nextInt();
            System.out.println("Enter Science : ");
            science = scanner.nextInt();

            // Input marks for three subjects
            int i = 0;
            while (i < 3) {
                System.out.print("Enter marks for subject " + (i+1) + " (between 0 to 100): ");
                int marks = scanner.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid Input, Marks should be between 0 to 100");
                } else {
                    if (i == 0) {
                        math = marks;
                    } else if (i == 1) {
                        science = marks;
                    } else {
                        english = marks;
                    }
                    i++;
                }
            }

            // Call method to calculate and print mark sheet
            printMarkSheet(name, rollNo, math, science, english);
        }

        public static void printMarkSheet(String name, int rollNo, int math, int science, int english) {
            // Calculate total marks
            int totalMarks = math + science + english;

            // Calculate percentage
            double percentage = totalMarks / 3.0;

            // Determine result and grade
            String result, grade;
            if (percentage >= 35) {
                result = "Pass";
                if (percentage >= 80)
                    grade = "A+";
                else if (percentage >= 60)
                    grade = "A";
                else if (percentage >= 50)
                    grade = "B";
                else
                    grade = "C";
            } else {
                result = "Fail";
                grade = "N/A";
            }

            // Print Mark Sheet
            System.out.println("_________________________________");
            System.out.println("|                               |");
            System.out.println("|          Mark Sheet           |");
            System.out.println("|_______________________________|");
            System.out.println("| Name      : " + name + "    |");
            System.out.println("| Roll No   : " + rollNo + "      |");
            System.out.println("|_______________________________|");
            System.out.println("| Subjects  : Marks             |");
            System.out.println("|_______________________________|");
            System.out.println("| Math      : " + math + "        |");
            System.out.println("| Science   : " + science + "       |");
            System.out.println("| English   : " + english + "       |");
            System.out.println("|_______________________________|");
            System.out.println("| Total     : " + totalMarks + "       |");
            System.out.println("|_______________________________|");
            System.out.println("| Percentage: " + percentage + "      |");
            System.out.println("| Result    : " + result + "          |");
            System.out.println("| Grade     : " + grade + "           |");
            System.out.println("|_______________________________|");
        }
    }







