package chapter3;

import java.util.Scanner;

public class ex3_19 {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
	    System.out.print("�����������ε�������:");

	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double c = input.nextDouble();

	    if ((a + b > c) && (a + c > b) && (b + c > a)){

	        System.out.println("�������ܳ�Ϊ��" + (a+b+c));

	    }
	    else System.out.println("���ܹ���������");

	}

}
