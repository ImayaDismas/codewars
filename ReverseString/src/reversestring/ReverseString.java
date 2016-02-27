package reversestring;
//Write a java algorithm to reverse a string, and print it's output
//For instance, "CodeNinja" returns: 'ajniNedoC'
import java.util.Scanner;
public class ReverseString {

	
	public static void main(String[] args) {
		String initial, reverse = "";
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	 
	    System.out.println("Enter a string to reverse: ");
	    initial = input.nextLine();
	 
	    int length = initial.length();
	    System.out.println("Without using the inbuilt function");
	    for ( int i = length - 1 ; i >= 0 ; i-- ){
	    	reverse = reverse + initial.charAt(i);
	    }
	    System.out.println("Reverse of entered string is: "+ reverse);
	    
	    System.out.println("Using the String Builder");
	    StringBuilder newInput = new StringBuilder();
	    newInput.append(initial);
	    newInput = newInput.reverse();
	    
	    System.out.print(newInput);

	}

}
