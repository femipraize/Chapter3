import java.util.Scanner;

public class Exercise7{
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

	int result3 = integer1 * integer2 * integer3;
	System.out.printf("third result is %d%n", result3);

	int smallestInteger = 0;
	
	 if(integer1 < integer2){
		smallestInteger = integer1;
		}
	if(integer2 < integer1){
		smallestInteger = integer2;
		}
	if(smallestInteger < integer3){
		smallestInteger = smallestInteger;
		}
	if(integer3 < smallestInteger){
          	smallestInteger = integer3;
                }
	System.out.printf("The smallest number is  %d%n", smallestInteger);	

	int biggestInteger = 0;

 if(integer1 > integer2){
		biggestInteger = integer1;
		}
	if(integer2 > integer1){
		biggestInteger = integer2;
		}
	if(smallestInteger > integer3){
		biggestInteger = biggestInteger;
		}
	if(integer3 > biggestInteger){
          	biggestInteger = integer3;
                }
	System.out.printf("The Biggest number is  %d%n", biggestInteger);	
	}
}