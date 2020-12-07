import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {

		int feet, inches, totalInches; 
		int femaleWeight, maleWeight;
		
		Scanner in = new Scanner(System.in);
		System.out.println( "This program will calculate the ideal weight for both a male and a female given the height in feet and inches...");
		
		System.out.print("Enter the height in feet: ");
		feet = in.nextInt();
		System.out.print("Enter the height in inches: ");
		inches = in.nextInt();
		System.out.println("You entered a height of " + feet + "' " + inches + "\"");
		
		totalInches = feet*12 + inches;
		femaleWeight = 100 + (totalInches - 60)*5;
		maleWeight = 106 + (totalInches - 60)*6;
		
		double kiloFemale = femaleWeight * 0.45;
		
		System.out.println("The ideal weight for a female is " + kiloFemale + " kg.");
		
		double kiloMale = maleWeight * 0.45;
		
		System.out.println("The ideal weight for a male is " + kiloMale + " kg.");
	}

}
