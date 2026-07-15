public class Operator {

    public static void main (String[] args) {
        
        int age = 21;

        if (age >= 18) {
            
            System.out.println("You can vote.");
        } else {
            System.out.println("You can not vote.");
        }

        System.out.println("Use equal to operator : " + (age == 21));
        System.out.println("Use not equal to operator : " + (age != 21));
    }
}
