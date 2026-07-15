import java.util.Scanner;
public class SearchElement {

    public static void main ( String[] args) {
        
        Scanner input = new Scanner(System.in);

        //delares array
        int[] numbers = { 12,34,454,56,87,25,23};
        boolean found = false;

        //user input value
        System.out.print("Search value : ");
        int searchResult = input.nextInt();

        //initail loop to find number
        int i;
        for (i = 0; i < numbers.length; i++) {
            if ( numbers[i] == searchResult) {
                found = true;
                break;
            }
        };

        //check condition
        if (found) {

            System.out.print("found at index : " + i);
        }else {

            System.out.print("Not found");
        }

        input.close();
    }
}
