package _04.estruturarepetitivas.lab;

import java.util.Scanner;

public class Exer06While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cod = 0;

		int Alcool = 0, Gasolina = 0, Diesel = 0;

		while (cod != 4) {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			cod = sc.nextInt();

			if (cod == 1) {
				Alcool += cod;
			} else if (cod == 2) {
				Gasolina += cod;
			} else if (cod == 3) {
				Diesel += cod;
			} else if (cod == 4) {
				System.out.println("MUITO OBRIGADO");
			} else {
				System.out.println("Código invalido (fora da faiza de 1 a 4");
			}

		}
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel: " + Diesel);
		sc.close();
	}
}
