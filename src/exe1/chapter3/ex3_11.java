package chapter3;

import java.util.Scanner;

public class ex3_11 {

	public static void main(String[] args){

		Scanner input=new Scanner(System.in);
		System.out.print("Enter a month and a year: ");

		int month=input.nextInt();
		int year=input.nextInt();

		if ((year % 4 == 0 && year %100 != 0)||(year % 400 == 0)){
			if ((month==1) || (month==3) || (month==5) || (month==7) || (month==8) ||(month==10) || (month==12)){
				System.out.println(month + " " + year + " has 31 days");
			}
			if ((month==4) || (month==6) || (month==9) || (month==11)){
				System.out.println(month + " " + year + " has 30 days");
			}
			if(month==2) System.out.println("February " + year +" has 29 days");
		}

		else{
			if ((month==1) || (month==3) || (month==5) || (month==7) || (month==8) ||(month==10) || (month==12)){
				System.out.println(month+ " " + year + " has 31 days");
			}
			if ((month==4) || (month==6) || (month==9) || (month==11)){
				System.out.println(month+ " " + year + " has 30 days");
			}
			if(month==2) System.out.println("February " + year +" has 28 days");
		}

	}

}
