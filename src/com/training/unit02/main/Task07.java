package com.training.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		//Даны три действительных числа. Возвести в квадрат те из них, значения
		//которых неотрицательны, и в четвертую степень — отрицательные.
		
		int mas[] = new int[3];
		
		for (int i=0; i<3; i++) {
			mas[i]=(int)(Math.random()*20 - 10);
			System.out.println(mas[i]);
		}
		
		for (int i=0; i<3; i++) {
			if (mas[i]>0) {
				System.out.println((i+1) + " значение=" + Math.pow(mas[i],2));
			}else if (mas[i]<0){
				System.out.println((i+1) + " значение=" + Math.pow(mas[i],4));
				}else {
					System.out.println((i+1) + " число равно 0");
			}
		}
		
	}

}
