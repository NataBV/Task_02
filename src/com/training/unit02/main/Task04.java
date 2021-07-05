package com.training.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		//Создать программу ввода целых чисел с клавиатуры, подсчета их суммы и
		//вывода результата на консоль
		
int x=0;
		
		Scanner sc = new Scanner(System.in);
			
		do {
			System.out.print("Введите целое число> ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Некорректный ввод> ");
			}
			x=x+sc.nextInt();
			System.out.println("Сумма введенных чисел равна: " + x );
		} while (true);		
	}
}
