public class Operator {
    public static void main (String[] args) {

        int age = 18;
        if (age >= 18) {

            System.out.println("You can voting");
        } else {

            System.out.println("You can't voting");
        }

        int personAge = 15;
        String result = (personAge >= 15) ? "You are adult" : "Children";
        System.out.println(result);
        System.out.println(result instanceof String);
    }
}
