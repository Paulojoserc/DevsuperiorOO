package _06.orientacaoobjetos.estaticos.exem3.application;

import java.util.Locale;
import java.util.Scanner;

import _06.orientacaoobjetos.estaticos.exem3.util.Calculator;



public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter radius: ");
		double radios = sc.nextDouble();
		
		double c = Calculator.circumference(radios);
		double v = Calculator.volume(radios);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		
		sc.close();
	}
}
