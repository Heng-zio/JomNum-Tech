import java.util.Scanner;
public class TestSkipAline {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.println("Enter something : ");
		int number = input.nextInt();
		System.out.println("What do you wanna do: ");
		String name = input.next();

		System.out.println(number);
		System.out.println(name);
	}    
}
