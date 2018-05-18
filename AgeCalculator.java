import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class AgeCalculator
{
   public static void main(String []args)
     {
	   Scanner age = new Scanner(System.in);
       System.out.println("Hey there, I'm about to tell you your Age Now!!!");
       System.out.println("Add 5 to your AGE in your mind,\n---------------------------");
       System.out.println("Then 1 to proceed");
       int Input1;
       String app ="Cheers. Thanks for using this APP!";
      Input1 = age.nextInt();
switch (Input1){
   case 1:
       System.out.println(" Now Multiply the number by 4");
       System.out.println("Heheheheheh............Now press 1 to proceed Again!");
       int input2;
       input2 = age.nextInt();
       switch (input2){
   case 1:
       System.out.println("Let's do this, Now Divide your answer by 2 "
               + "and enter your the number");
     int ans;
       ans = age.nextInt();
       System.out.println( "Cheers! You are " + ( (ans*2)/4-5 ) +  " years old, Am I right?" ) ;
       System.out.println("Type 1 if I'm right");
       int pro;
 	  pro = age.nextInt();
 	  if (pro == 1) {
 		  System.out.println(app);
 	  }else {
 		  System.out.println("Try Again!");
 	  }
       }
   }
}
}