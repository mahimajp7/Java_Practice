package practice;

import java.util.Scanner;

public class p1 {
	Scanner input = new Scanner( System.in );
	Double value = null;
	{
	while (value==null) {
	   System.out.print("Please enter number: ");
	   java.lang.String s = input.nextLine();
	   if (s.length()==0) {
	      System.out.println("You did not enter a value; Try again");
	   } else {
	      try {
	         value = new Double(s);
	      } catch (Exception ex) {
	         System.out.println("You did not enter a valid value; Try again");
	      }
	   }
	}
	double d = value.doubleValue();

}
}
