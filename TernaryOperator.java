import java.util.Scanner;
public class TernaryOperator {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the score: ");
        float score = input.nextFloat();

        char grade = (score >= 90) ? 'A'
                    :(score >= 80) ? 'B'
                    :(score >= 70) ? 'C'
                    :(score >= 60) ? 'D'
                    :(score >= 50) ? 'E'
                    : 'F';
        System.out.println("You got grade: " + grade);
    }
}
