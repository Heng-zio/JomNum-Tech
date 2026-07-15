import java.util.Scanner;
import java.util.UUID;
public class TestInput {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 1, max = 99;
        int id = (int) (Math.random() * (max-min+1) + min);
        UUID uuid = UUID.randomUUID();
        String uuID = uuid.toString();

        System.out.print("Enter your username : ");
        String username = input.nextLine();
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        System.out.print("Enter you GPA : ");
        double GPA = input.nextDouble();
        System.out.print("Enter your enrollment Status(true/false) : ");
        boolean enrollment = input.nextBoolean();
        System.out.println("==========Display Data==========");
        
        System.out.println("Your UUID : " + uuID );
        System.out.println("Your id : " + id);
        System.out.println("Your username : " + username);
        System.out.println("Your age : " + age);
        System.out.println("Your GPA : " + GPA);
        System.out.println("Your enrollment : " + enrollment);
        
    }
}
