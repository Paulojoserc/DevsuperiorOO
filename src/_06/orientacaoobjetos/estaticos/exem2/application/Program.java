package _06.orientacaoobjetos.estaticos.exem2.application;

import java.util.Locale;
import java.util.Scanner;

import _06.orientacaoobjetos.estaticos.exem2.util.Calculator;

public class Program {
	
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	Calculator calc = new Calculator();
	
	System.out.println("Enter radius: ");
	double radios = sc.nextDouble();
	
	double c = calc.circumference(radios);
	double v = calc.volume(radios);
	
	System.out.printf("Circumference: %.2f%n", c);
	System.out.printf("Volume: %.2f%n", v);
	System.out.printf("PI value: %.2f%n", calc.PI);
	
	
	sc.close();
}
}
