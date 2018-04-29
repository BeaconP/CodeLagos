/**
 * 
 */

/**
 * @author BEACON
 *
 */
import java.util.Scanner;
public class Grade2 {

	/** This is a simple Java program to get student scores and  grades
	 *  This program read user input which is test and exam scores then add them together and placed on a grade scale.
	 *  This program is written by OLOMITUTU OLUFEMI as a part of CodeLagos Assessment Test for students undergoing 
	 *  Introduction to Java Programming organized by Lagos State and supported by Lagos State Ministry of Education
	 */ 
	public Grade2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Grade= new Scanner(System.in);

int test, exam, total;
// this gets the test score
System.out.println("This Program Performs Student Grading");
System.out.println("by adding the Test score and Exam Score Together,");
System.out.println("then assign the grade based on scale provided.");
System.out.println("--------------------------------");
System.out.println("Enter Your test score here");
test = Grade.nextInt();
//exam scores goes her
System.out.println("Enter Your exam score here");
exam = Grade.nextInt();
//performs the addition of the test and exam score to give final grade
total = test + exam;
//compares with assigned grade value and print out the grade and score
if (total >= 70)
	System.out.println( "Your score is " + total +" You have A" );
	else
		if (total >= 60)
		System.out.println( "Your score is " + total + " You have B");
		else
			if (total >= 50)
				System.out.println("Your score is " + total + " You have C");
			else
				if(total >= 40)
					System.out.println("Your score is " + total + " You have D");
				else
					if (total >= 30)
						System.out.println("Your score is " + total + "  30You have E");
					//This is program is written by me 
System.out.println("--------------------------------------");
System.out.println("This program is written by Olomitutu Olufemi");
System.out.println("A student of CodeLagos Learning Java Programming");
						
	}

}
