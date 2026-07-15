public class BlockCode {

    //Declare method 
    //1. Function no parameter and no return
    public static void greetingMessage() {
        System.out.println("\n Hello Everyone, I'm Junior Java Developer. Welcome to Jomnum Tech.");
    }

    //with return
    public static int sum() {
        int num1 = 10, num2 = 20;
        int result = num1 + num2;
        return result;
    }

    public static int ValidateAge() {
        int age = 18;

        if (age >= 18) {
            System.out.println("\n You're eligible to vote.");
            return age;
        }else {
            System.out.println("\n You're not eligible to vote!.");
            return age;
        }
    }
    //Main method
    public static void main (String[] args) {
        
        //Call method
        greetingMessage();

        //call operator sum
        System.out.println("\n Sum of numbers is : " +  sum());

        //Call validateAge
        ValidateAge();

    }
}