package _04.estruturarepetitivas.lab;

import java.util.Locale;
import java.util.Scanner;

public class ExerWhile02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int idade = 0;
		double media = 0;
		double soma = 0;

		while (idade >= 0) {
			System.out.println("Digite as idades: ");
			idade = sc.nextInt();
			if (idade > 0) {
				soma += idade;
				media++;
				
			} else {
				System.out.println("IMPOSSIVEL CALCULAR");
			}
			
		}
		if (media > 0) {
			System.out.printf("MEDIA = %.2f%n",  soma / media);
		}
	
		sc.close();
	}
}
