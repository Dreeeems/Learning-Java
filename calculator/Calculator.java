package calculator;
import java.util.Scanner;
public class Calculator {
	static double sum ;
	public static double findResult( double  num1, String operation, double num2) {

		if(operation.length()==1) {
		switch(operation) {
		case"+":
			sum = num1 + num2;
			break;
		case "-":
			sum = num1 - num2;
			break;
		case "*":
			sum = num1 * num2;
			break;

		case "/":
			if((num2!=0 )& (num1 !=0)) {
				sum = num1 / num2;
			}else {
				System.out.println("Invalid numbers");

			}
			break;
		}
		}else {
			System.out.println("Invalid operation: "+operation );
		}
		return sum;
	}

	public static void main(String[] args) {


		System.out.println("Hello World");

		Scanner  scanner  = new Scanner(System.in);
		System.out.print("First number ");
		double num1  = scanner.nextDouble();
		System.out.print("Operator");
		String operation  = scanner.next();
		System.out.print("Second number");
		double num2  = scanner.nextDouble();
		findResult(num1,operation,num2);
		scanner.close();
		System.out.println("result:" + sum);

	}
}
