package _08.memoria_vetor_lista.vetor.lab;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int num = sc.nextInt();
		sc.nextLine();

		double[] vectAltura = new double[num];
		String[] vectGenero = new String[num];

		int contM = 0, contF = 0;
		double menorAltura, maiorAltura, sumAlturaF = 0;

		for (int i = 0; i < num; i++) {
			System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
			vectAltura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "ª pessoa: ");
			vectGenero[i] = sc.next();
			if (vectGenero[i].equalsIgnoreCase("F")) {
				sumAlturaF += vectAltura[i];
				contF++;
			} else {
				contM++;
			}
		}
		menorAltura = vectAltura[0];
		maiorAltura = vectAltura[0];
		for (int i = 1; i < num; i++) {
			if (vectAltura[i] > maiorAltura) {
				maiorAltura = vectAltura[i];
			}
			if (vectAltura[i] < menorAltura) {
				menorAltura = vectAltura[i];
			}
		}
		double  mediaAlturaF = sumAlturaF/contF; 
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura= %.2f%n", maiorAltura);
		System.out.printf("Media das alturas  das mulheres= %.2f%n", mediaAlturaF );
		System.out.print("Número de homens = "+contM);

		sc.close();
	}
}
