import java.util.Scanner;
public class Main {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score: ");
        Float score = input.nextFloat();

        char grade;

        if (score >= 90) {
            grade = 'A';
            System.out.println("You got grade : " + grade);
        }
        else if (score >= 80) {
            grade = 'B';
            System.out.println("You got grade : " + grade);
        }
        else if (score >= 70) {
            grade =  'C';
            System.out.println("You got grade : " + grade);
        }
        else if (score >= 60) {
            grade = 'D';
            System.out.println("You got grade : " + grade);
        }
        else if (score >= 50) {
            grade = 'E';
            System.out.println("You got grade : " + grade);
        }
        else {
            grade = 'F';
            System.out.println("You got grade : " + grade);
        }

    }
}
