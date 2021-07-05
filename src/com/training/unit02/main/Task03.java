package com.training.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Программа запрашивает у пользователя значения чисел a, b, c, и затем
				//вычисляет значение выражения
				
				double res1,res2, result;
				int a,b,c,i;
				i=0;
				Scanner sc = new Scanner(System.in);
				int[] mas = new int[3];
				
				do {
					System.out.print("Введите целое число> ");
					while (!sc.hasNextInt()) {
						sc.nextLine();
						System.out.print("Некорректный ввод> ");
					}
					mas[i] = sc.nextInt();
					i++;
				} while (i<3);
				
				a = mas[0];
				b = mas[1];
				c = mas[2];
						
				res1 = Math.pow((b-c), 2);
				res2 = Math.pow(b, 2)+1;
				result = Math.pow(a,2) - res1 + Math.log(res2);
								
				System.out.println("Результат = " +result);

			}

		}
