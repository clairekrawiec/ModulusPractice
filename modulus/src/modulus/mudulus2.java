package modulus;

import java.util.Scanner;
public class mudulus2
{

	public static void main(String[] args)
	{
		greetUser();
		System.out.println("Tell us a number, we will tell you if its odd or even");
	Scanner userInput = new Scanner (System.in);
	int number = userInput.nextInt();
	
	
	
	if (number % 2 == 0)
		{
			System.out.println("your number is even");
		}
	else
		{
			System.out.println("your number is odd");
		}
	System.out.println("give us a year, we can tell you if its a leap year!");
	int year = userInput.nextInt();
	if (year % 4==0)
		{
			System.out.println("this year is a leap year");
		}
	else
		{
			System.out.println("your year is not a leap year");
		}
	}
	private static void greetUser()
	{
		System.out.println("Hello, what is your name?");
		Scanner userInput = new Scanner (System.in);
		String name = userInput.nextLine();
		System.out.println("hello, " + name + " Welcome to odd or even!");
	}
}
