package util;

public class Calculator {
	public static final double PI = 3.14159; //declaração de uma constante, sendo ela obrigatoriamente MAIUSCULA
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume (double radius) {
		return 2.0 * PI  * radius * radius * radius / 3.0;
	}
}
