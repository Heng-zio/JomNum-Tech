import java.util.Scanner;
public class NestedCondition {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int driverAge = input.nextInt();

        if (driverAge >= 18 && driverAge < 60) {

           System.out.print("Confirm your License(true or false): ");
            boolean hasLicense = input.nextBoolean();
            if (hasLicense == true) {

                 System.out.println("You can driving.");
                     }
          else {

                 System.out.println("You can't driving because you don't have driver license.");
        }  
    } else {

        System.out.println("You not old enough to driving or over age.");
    }
   }
}
