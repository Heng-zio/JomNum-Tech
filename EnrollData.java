import java.util.Scanner;
public class EnrollData {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter your username : ");
        String userName = input.nextLine();
        System.out.print("Enter your fullname : ");
        String fullName = input.nextLine();
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        System.out.print("Enter your GPA : ");
        double GPA = input.nextDouble();
        System.out.print("Enter your enrollment status (true or false) : ");
        boolean isEnrolled = input.nextBoolean();

        System.out.println("==========Display Details==========");

        System.out.println("Your username : " + userName);
        System.out.println("Your full name : " + fullName);
        System.out.println("Your age : " + age);
        System.out.println("Your GPA : " + GPA);
        System.out.println("Your enrollment status: " + isEnrolled);
        input.close();
    }
}
