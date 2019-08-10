
/**********************************************************************************
*MSUnit3Ch12.java
*Molina
*
*This program converts each character of a string into ASCII values and hex values.
***********************************************************************************/

import java.util.Scanner;

public class MSUnit3Ch12
{
	public static void main(String[] args)//main
	{

//Get input for a string containing both numbers and letters of any length
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a string of any length: ");
		String line = scan.nextLine();


		System.out.println("\nInitial\tASCII(char)\tASCII(int)\tHex"); //print titles


//Use a for loop with postfix notation to increment through the string
		for (int i=0; i<line.length(); i++)
		{
			char ch = line.charAt(i);
			if (Character.isDigit(ch))
			{
				System.out.println(line.charAt(i) + "\t\t\t" + //initial value
									(int)(line.charAt(i)) + "\t\t" + //ASCII value
									  Integer.toString(line.charAt(i), 16).toUpperCase()); //hex value
			}
			if (!(Character.isDigit(ch)))
			{
				System.out.println(line.charAt(i) + "\t" + //intial value
									(int)(line.charAt(i)) + "\t\t\t\t" + //ASCII value
										Integer.toString(line.charAt(i), 16).toUpperCase()); //hex value
			}
		}//end for

//Output “Thank you for playing!”
		System.out.println("\nThank you for playing!");

	}//end main
}//end class
