package _04.estruturarepetitivas.lab;

import java.util.Locale;
import java.util.Scanner;

public class ExerFor07 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.print("Quantos casos voc� vai digitar? ");
	int n = sc.nextInt();
	
	for (int i = 0; i < n; i++) {
		System.out.print("Entre com o n�merador: ");
		double numerador = sc.nextDouble();
		System.out.println("Entre com o denominador: ");
		double denominador = sc.nextDouble();
		if (denominador == 0) {
			System.out.println("DIVISAO IMPOSSIVEL");
		}else {
			double divisao = numerador/denominador;
			System.out.printf("DIVIS�O = %.2f%n",divisao);
		}
		
		
	}
	
	sc.close();
}
}
