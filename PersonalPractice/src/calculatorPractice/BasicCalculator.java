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
	
	public static int multiply(int multiplicand, int multiplier) {
		
		int result = multiplicand * multiplier;
		return result;
	}
	
	public static int divide(int dividend, int divisor) {
		
		int result = dividend / divisor;
		return result;
	}
	
	public static void performOperation() throws IOException {
		
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
			
		System.out.println("what operation do you want to perform? add - subtract - multiply - divide");
		System.out.println("//");
		System.out.println("//");
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
            	break;            
            case "d":
            	System.out.println("division selected");
            	break;            
            default:
                System.out.println("Invalid opertaion, please try again");
                performOperation();
        }
	}
	

	
}
















