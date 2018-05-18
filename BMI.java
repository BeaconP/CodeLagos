/**
 * 
 */

/**
 * @author BEACON
 *
 */
import java.util.Scanner;
public class BMI {

	/**
	 * 
	 */
	public BMI() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double weight = 0.0;
		double height = 0.0;
		double Height = 0.0;
		double FinalHeight = 0.0;
		double bmi = 0.0;
		
		// TODO Auto-generated method stub
		System.out.println("This is Body Mass Index Calculator \nCreated by OLOMITUTU OLUFEMI\n-----------------------------------");
System.out.println("Please Enter your weight in Kilogram:");
weight = input.nextDouble();
//This get user's weight in kilogram

System.out.println("Please Enter Your Height in Centimeter:");
height = input.nextDouble();
//this get user's height
Height = height/100;
FinalHeight = Height * Height;
//this converts height ti m2
bmi = weight / FinalHeight;
System.out.println("Your BMI is " + bmi + "Kg/m2");
if (bmi > 25 ) {
	System.out.println("You're at Risk");
}else {
	System.out.println("You're Healthy");
}

	}

}
