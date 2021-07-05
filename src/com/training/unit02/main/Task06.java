package com.training.unit02.main;

public class Task06 {

	public static void main(String[] args) {
		//Вычислить значение выражения по формуле (все переменные принимают
		//действительные значения):
		
		int a,b,c,d;
		double result;
		a = (int)(Math.random()*50 - 50);
		b = (int)(Math.random()*50 - 50);
		c = (int)(Math.random()*50 - 50);
		d = (int)(Math.random()*50 - 50);
		System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
		
		if ((c == 0) || (d == 0)) {
			System.out.println("Некорректные исходные данные: деление на ноль");
			return;
		}
		
		result = a/c*b/d - (a*b-c)/c/d;
		System.out.println("result=" +result);

	}

}
