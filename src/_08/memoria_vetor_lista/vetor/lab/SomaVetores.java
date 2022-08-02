package _08.memoria_vetor_lista.vetor.lab;

import java.util.Scanner;

public class SomaVetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("Quantos valores vai ter cada vetor? ");
		num = sc.nextInt();

		int[] vecta = new int[num];

		int[] vectb = new int[num];

		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vecta.length; i++) {
			vecta[i]=sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vectb.length; i++) {
			vectb[i]=sc.nextInt();
		}
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < num; i++) {
			System.out.println((vecta[i] + vectb[i]));
		}

		sc.close();
	}
}
