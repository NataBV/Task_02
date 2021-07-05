package com.training.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		//Составить программу для вычисления значений функции F(x) на отрезке [а, b]
		//с шагом h. Результат представить в виде таблицы, первый столбец которой –
		//значения аргумента, второй - соответствующие значения функции:

		int a, b, h;
		double F, x;
		a=-10;
		b=5;
		h=2;
		System.out.println("---------------------------------");
		System.out.printf("|\t%-6s\t|\t%-6s\t|\n", "x", "F(x)");

		for (x=a;x<=b;x=x+h) {
			F = 2* (Math.tan(x/2))+1;
			System.out.println("---------------------------------");
			System.out.printf("|\t%-6.0f\t|\t%-6.2f\t|\n", x , F);
		}
		System.out.println("---------------------------------");
	} 
}