package com.training.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		//Вычислить значение выражения по формуле (все переменные принимают
		//действительные значения)
		double res1,result;
		int a, b, c;
			
		a=(int)(Math.random()*50 - 50);
		b=(int)(Math.random()*50 - 50);
		c=(int)(Math.random()*50 - 50);
		System.out.println("a=" + a + " b=" + b + " c=" + c);
			
		if (a == 0) {
			System.out.println("Некорректные исходные данные");
			return;
		}
					
		res1 = Math.sqrt(Math.pow(b,2) + 4*a*c);
		result = (b + res1) /2/a - Math.pow(a,3) * c + b;
			
		System.out.println("result = " + result);
	}
}
