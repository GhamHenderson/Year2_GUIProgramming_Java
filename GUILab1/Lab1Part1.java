package guiExercise1;

import java.util.Scanner;

public class Lab1Part1
{

	public static void main(String[] args) 
	{
		ageRange();
	}

	static void ageRange()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		scan.close();
		
		if(age <= 17) {
			System.out.println("0-17");
		}
		else if (age > 18 && age <= 49) {
			System.out.println("18-49");
		}
		else if (age > 50 && age <= 64) {
			System.out.println("50-64");
		}
		else if (age > 65 && age <= 79) {
			System.out.println("65-79");
		}
		else if (age > 80) {
			System.out.println("80+");
		}
		
		switch(age) {
			case 17: 
				System.out.println("Your 17 years old");
				break;
			case 49:
				System.out.println("Your 49 years old");
				break;
			case 64:
				System.out.println("Your 64 years old");
				break;
			case 79: 
				System.out.println("Your 79 years old");
				break;
			default: 
				System.out.println("Your " + age + " years old");
				break;
		}
	}	
}
