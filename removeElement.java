import java.util.Scanner;
public class removeElement {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        //declare
        int[] numbers = {1,2,3,4,5,6,7};
        boolean found = false;
        int index;
        int i;

        System.out.print("Enter the number you want to remove : ");
        int num = input.nextInt();

        for ( i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == num) {
                found = true;
                break;
            }
        }

        if (found) {
            //loop to remove an element
         for (int j = i; j < numbers.length - 1; j++) {
                numbers[i] = numbers[i + 1];
            }
        }
        else {
            System.out.println("Value not found");
        }

        for ( i = 0; i < numbers.length - 1; i++) {
            System.out.println(numbers[i]);
        }

    }
}