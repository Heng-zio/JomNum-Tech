import java.util.Scanner;
public class UpdateElement {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {12,23,67,67,90};

        //Loop before update
        System.out.println("Array before update");
        for (int num : numbers) {

            System.out.println(num);
        }

        System.out.println("Enter index to update (0-4) : ");
        int index = input.nextInt();

        System.out.println("Enter new value : ");
        int value = input.nextInt();

        //Update value here
        numbers[index] = value;
        
        System.out.println("==============after update===========");
        //Loop after update value
        for (int num : numbers) {

            System.out.println(num);
        }
        input.close();
        
    } 
}
