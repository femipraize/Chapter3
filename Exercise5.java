import java.util.Scanner;

publuc class Exercise5{
	public static void main(String... arg){
	
	System.out.println("Enter first integer");	
	Scanner input = new Scanner(System.in);	
	int integer1 = input.nextInt();
	
	System.out.println("Enter second integer");
	int integer2 = input.nextInt();

	System.out.println("Enter third integer");
	int integer3 = input.nextInt();

	int result1 = integer1 + integer2 + integer3;
	System.out.printf("frist result is %d%n", result1);

	int result2 = ((integer1 + integer2 + integer3)/3);
	System.out.printf("second result is %d%n", result2);

			
	}
}