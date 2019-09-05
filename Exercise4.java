import java.util.Scanner;

public class Exercise4{
	public static void main(String... args){
	
	System.out.print("Enter first number");
	Scanner input = new Scanner(System.in);
	int number1 = input.nextInt();
	
	System.out.print("Enter second number"); 
	int number2 = input.nextInt();

	if(number1 > number2) {
		System.out.printf("%d is larger ", number1);
 		}
	if(number1 < number2) {
		System.out.printf("%d is larger", number2);
		}
	if(number1 == number2) {
		System.out.println("These numbers are equal");
		}
	
	}
}