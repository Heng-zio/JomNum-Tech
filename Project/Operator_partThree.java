public class Operator_partThree {
    public static void main (String[] args) {
    
        int num1 = 20, num2 = 20, num3 = 60;
        boolean result;
        result = (num1 == num2 || num1 == num3);
        System.out.println("Result : " + result);
        System.out.println("Not use (i) operator : " + !result);
        boolean result1 = !result;
        System.out.println(!result);

    }
}
