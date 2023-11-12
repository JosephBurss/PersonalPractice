package calculatorPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicCalculator {
	
	public static void main(String[] args) throws IOException {
		
		performOperation();

	}
	
	public static int add() throws IOException {
		
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        
		System.out.println("please enter the first number to add");
		// Reading data using readLine
        String input = reader.readLine();
        int addend1 = Integer.parseInt(input);
        
        System.out.println("please enter the second number to add");
		// Reading data using readLine
        input = reader.readLine();
        int addend2 = Integer.parseInt(input);
		
		int result = addend1 + addend2;
		System.out.println("The sum of this addition is " + result);
		System.out.println("//");
		System.out.println("//");
		System.out.println("//");
		return result;
	}
	
	public static int subtract() throws IOException {
		
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        
		System.out.println("please enter your first number");
		// Reading data using readLine
        String input = reader.readLine();
        int minuend = Integer.parseInt(input);
        
        System.out.println("please enter the number to subtract");
		// Reading data using readLine
        input = reader.readLine();
        int subtrahend = Integer.parseInt(input);
		
		int result = minuend - subtrahend;
		System.out.println("The difference is " + result);
		System.out.println("//");
		System.out.println("//");
		System.out.println("//");
		return result;
	}
	
	public static int multiply() throws IOException {
		
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        
		System.out.println("please enter your first number");
		// Reading data using readLine
        String input = reader.readLine();
        int multiplicand = Integer.parseInt(input);
        
        System.out.println("please enter the number to multiply by");
		// Reading data using readLine
        input = reader.readLine();
        int multiplier = Integer.parseInt(input);
		
		int result = multiplicand * multiplier;
		System.out.println("The product is " + result);
		System.out.println("//");
		System.out.println("//");
		System.out.println("//");
		return result;
	}
	
	public static double divide() throws IOException {
		
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        
		System.out.println("please enter your first number");
		// Reading data using readLine
        String input = reader.readLine();
        double dividend = Double.parseDouble(input);
        
        System.out.println("please enter the number to divide by");
		// Reading data using readLine
        input = reader.readLine();
        double divisor = Double.parseDouble(input);
		
        double result = (double)Math.round((dividend / divisor) * 10000d) / 10000d;
		System.out.println("The quotient is " + result);
		System.out.println("//");
		System.out.println("//");
		System.out.println("//");
		return result;
	}
	
	public static void performOperation() throws IOException {
		
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
			
		System.out.println("what operation do you want to perform? add - subtract - multiply - divide");
		System.out.println("//");
		System.out.println("Enter 0 to close the calculator");
		System.out.println("//");
		System.out.println("please enter one of the following a , s , m , d");
		
		// Reading data using readLine
        String operationInput = reader.readLine();
        
        switch (operationInput)
        {
            case "a":
            	System.out.println("addition selected");
            	add();
            	performOperation();
	            break;
			case "s":
            	System.out.println("subtraction selected");
            	subtract();
            	performOperation();
            	break;            
            case "m":
            	System.out.println("multiplicaion selected");
            	multiply();
            	performOperation();
            	break;            
            case "d":
            	System.out.println("division selected");
            	divide();
            	performOperation();
            	break;    
            case "0":
            	System.out.println("calculator closed.  Thanks for computing!");
            	break;    
            default:
                System.out.println("Invalid opertaion, please try again");
                performOperation();
        }
	}
}
















