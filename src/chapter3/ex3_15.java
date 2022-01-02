package chapter3;

import java.util.Scanner;

public class ex3_15 {

	public static void main(String[] args){

		int loterry = (int)(100 + Math.random() * 900);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your loterry pick (three digits):");
		int guess = input.nextInt();
		if(guess > 999 || guess < 100)
		{
			System.out.println("ERROR");
			return ;
		}
		int guessA = guess / 100;
		int guessB = guess / 10 % 10;
		int guessC = guess % 10;
		int loterryA = loterry / 100;
		int loterryB = loterry / 10 % 10;
		int loterryC = loterry % 10;

		System.out.println("The loterry number is "+loterry);

		if(guess == loterry)
		{
			System.out.println("Exact match: you win $10,000");
		}
		else if((guessA == loterryA && guessB == loterryC && guessC == loterryB) ||
				(guessA == loterryB && guessB == loterryA && guessC == loterryC) ||
				(guessA == loterryB && guessB == loterryC && guessC == loterryA) ||
				(guessA == loterryC && guessB == loterryA && guessC == loterryB) ||
				(guessA == loterryC && guessB == loterryB && guessC == loterryA))
		{
			System.out.println("Match all digits: you win $3,000");
		}
		else if((guessA == loterryA) || (guessA==loterryB) || (guessA==loterryC) ||
				(guessB == loterryB) || (guessB==loterryB) || (guessB==loterryC) ||
				(guessC == loterryA) || (guessC==loterryB) || (guessC==loterryC))
		{
			System.out.println("Match one digit: you win $1,000");
		}
		else
		{
			System.out.println("Sorry, not match");
		}

	}

}
