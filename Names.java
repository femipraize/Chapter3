import java.util.Scanner;
public class Names{
	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name");
		String firstName = input.nextLine();
		
		System.out.print("Enter other names");
		String otherNames = input.next();
		
		String names = firstName + otherNames;
		System.out.printf("your is %s%n", names);
	}
}
