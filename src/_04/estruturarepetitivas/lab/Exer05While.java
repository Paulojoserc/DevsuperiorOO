package _04.estruturarepetitivas.lab;

import java.util.Locale;
import java.util.Scanner;

public class Exer05While {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double nota1;
	double nota2;
	double media=0;
	while (media <= 0) {
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		if (nota1<0 || nota1 >10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota1 = sc.nextDouble();
		}
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		if(nota2<0 || nota2 >10) {
			System.out.println("Valor invalido! Tente novamente: ");
			nota2 = sc.nextDouble();
		}
		media = (nota1 + nota2)/2;
		System.out.printf("MEDIA = %.2f%n", media);
	}
	
	sc.close();
}
}
