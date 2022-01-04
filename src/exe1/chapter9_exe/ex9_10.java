package chapter9_exe;

import java.util.Scanner;

public class ex9_10 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("请输入a、b、c的值：");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();

		QuadraticEquation object = new QuadraticEquation(a, b, c);

		if (object.getDiscriminant() > 0)
			System.out.println("判别式>0,方程有两个根,分别为: r1=" + object.getRoot1() + ", r2=" + object.getRoot2());
		else if (object.getDiscriminant() == 0)
			System.out.println("判别式=0,方程只有一个根: r=" + object.getRoot1());
		else
			System.out.println("The equation has no roots.");

	}
}

class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;

	}

	public double getB() {
		return b;

	}

	public double getC() {
		return c;

	}

	public double getDiscriminant() {
		double p = Math.pow(b, 2) - 4 * a * c;
		return p;
	}

	public double getRoot1() {
		double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		return r1;
	}

	public double getRoot2() {
		double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		return r2;
	}
}