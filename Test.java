/**
 * 
 */

/**
 * @author BEACON
 *
 */

 /*This is a simple hat prints the numbers from 1 to 100. But for multiples of three print “Fizz” 
 * instead of the number and for the multiples of five print “Buzz”. 
 * For numbers which are multiples of both three and five print “FizzBuzz”
 * This program is written by OLOMITUTU OLUFEMI
 */
 public class Test 
  {
	public static void main(String[] args)	
	{
	String buzz =  "buzz", fizz = "fizz"; //initialise the string variables
	for (int i = 1; i <= 100; i++)
	{
	if (i % 15 == 0) //check if number in position i is divisible by 15, if so don't check other 2 conditions - we don't want a double print
	{
	  System.out.println(buzz + fizz + " " + i);
	}
	else if (i % 3  == 0 )
	{
	  System.out.println(buzz + " " + i);
	}
	else if (i % 5== 0)
	{
	  System.out.println(fizz + " "+ i);
	}
	}
	}
  }