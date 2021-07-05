package com.training.unit02.main;

public class Task02 {

	public static void main(String[] args) {
		//Напишите программу нахождения гипотенузы и площади прямоугольного
		//треугольника по двум катетам
			
		double x,y,pl,gip;
		
		x = 5;
		y = 9;
		
		gip = Math.pow(x,2) + Math.pow(y,2);
		pl = x * y / 2;
		
		System.out.println("Гипотенуза = "+gip);
	    System.out.println("Площадь = "+pl+" кв.ед");

		}

	}