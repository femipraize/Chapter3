import java.util.Scanner;
public class Adds{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Firt Number: ");
		int number1 = input.nextInt();	
		
		System.out.print("Enter Second Number: ");
		int number2 =input.nextInt();
		
		System.out.print("Enter Third Number: ");
		int number3 =input.nextInt();
		
		int sum = number1 + number2 + number3;
		System.out.printf("result is %d%n", sum);
 }
}