import java.util.Scanner;
public class ATM {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
   
        int option;
        float accountBalance = 20000;
        
        do {
        System.out.println("==========================================");
        System.out.println("============= Bank ATM ===================");
        System.out.println("==========================================");
        System.out.println("1. Check Balance.");
        System.out.println("2. Deposit Money.");
        System.out.println("3. Withdraw Money.");
        System.out.println("4. Exit.");

        System.out.print("Please enter your option: ");

        option = input.nextInt();
        switch  (option) {
            case 1:
                System.out.println("Your balance is: " + accountBalance + " USD");
                break;
            case 2:
                System.out.print("Enter your account to deposit: ");
                float depositAmount = input.nextFloat();
                 accountBalance += depositAmount;
                System.out.println("You have add: " + depositAmount + " USD.");
                System.out.println("Your balance after deposit is: " + accountBalance + " USD.");
                break;
            case 3:
                System.out.print("Enter the amount to withdraw: ");
                float withdrawAmount = input.nextFloat();

                if (withdrawAmount > accountBalance) {
                    System.out.println("Insufficient balance. You can't withdraw " + withdrawAmount + " USD.");
                } else {
                    accountBalance -= withdrawAmount;
                    System.out.println("You have withdraw: " + withdrawAmount + " USD.");
                    System.out.println("Your balance after withdraw is: " + accountBalance + " USD.");
                }
                break;
            case 4:
                System.out.println("Thank you for support us.");
                break;
            default:
                System.out.println("Invalid option");
        }
        }while(option != 4);
        input.close();
    }
}
