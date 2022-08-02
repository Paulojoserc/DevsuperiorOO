package _08.memoria_vetor_lista.vetor.lab;

import java.util.Scanner;

public class MaisVelho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String[] vectNome = new String[num];
		int[] vectIdade = new int[num];
		String maisVelho= null;
		int maior =vectIdade[0];

		for (int i = 0; i < num; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			vectNome[i] = sc.next();
			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();
			if (vectIdade[i]>maior) {
				maior = vectIdade[i];
				maisVelho = vectNome[i];
			}
		}
		System.out.print("PESSOA MAIS VELHA: "+maisVelho);
	
		

		sc.close();
	}
}
