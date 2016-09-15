import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberRevo {

	public static void main(String[] args) {
		
		//Create scanner object
		Scanner s = new Scanner(System.in);
		
		int input = 0;		
		
		//Exception argument
		try { 
		
		//Output the prompt
		System.out.print("Enter your number ");
		
		
		//Receiving the value
		input = s.nextInt();
		
		} catch (InputMismatchException e) {
		System.out.println("No bueno");
		
		}
		//Result of loop
		int result = reverse(input);
		
		//Output the result
		System.out.println("The reverse of the number is " + result);
		
		//Close Scanner
		s.close();
	}
	
	
	public static int reverse(int n) {
		
		//Input data
		int result = 0;
		
		//Declare remainder as an int
		int rem;
		
		//While loop
		while (n > 0) {
			
			//the remainder of n = rem
			rem =n % 10;
			
            //Divide n by 10 every loop
			n = n / 10;
			
			result = result * 10 +rem;
		}
		return result;
		
		
		
	}

}
