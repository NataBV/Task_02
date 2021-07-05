package com.training.unit02.main;


public class Task09 {

	public static void main(String[] args) {
		//Вычислить значение функции:
		
		double F, x;
		x = (int)(Math.random()*50 - 20);
		
		if (x > 3) {
			F = 1/(x*x+1);
		} else if (x <= -3) {
			F=9;
		}else {
			System.out.println("Значение x не входит в допустимый диапозон");
			return;
		}
		System.out.println("Значение F(" + x + ")=" + F);

	}

}
