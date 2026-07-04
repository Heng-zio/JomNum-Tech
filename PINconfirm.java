import java.util.Scanner;
public class PINconfirm {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your PIN : ");
        int UserPin = input.nextInt();

        final int PIN = 882910481;

        while (UserPin != PIN) {

            System.out.print("Try again : ");
            UserPin = input.nextInt();
        }
        System.out.println("Unlock");
        input.close();
    }
}
