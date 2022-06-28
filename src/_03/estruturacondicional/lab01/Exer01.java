package _03.estruturacondicional.lab01;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = sc.nextDouble();

		double nFinal = nota1 + nota2;

		if (nFinal >= 60) {
			System.out.printf("Nota final é : %.1f%n", nFinal);
		} else {
			System.out.printf("Nota final é : %.1f%n", nFinal);
			System.out.println("REPROVADO");
		}
		sc.close();

	}
}
