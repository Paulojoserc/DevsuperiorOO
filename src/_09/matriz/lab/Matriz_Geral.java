package _09.matriz.lab;

import java.util.Locale;
import java.util.Scanner;

public class Matriz_Geral {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double somaPositivo = 0.0;

		System.out.print("Qual a ordem da matriz? ");
		int num = sc.nextInt();

		double[][] mat = new double[num][num];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextDouble();
				if (mat[i][j] > 0) {
					somaPositivo += mat[i][j];
				}
			}
		}
		System.out.print("SOMA DOS POSITIVOS: " + somaPositivo);
		System.out.println();
		System.out.print("Escolha uma linha: ");
		int linha = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
		for (int i = 0; i < num; i++) {
			System.out.print(mat[linha][i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.print("Escolha uma coluna: ");
		int coluna = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < num; i++) {
			System.out.print(mat[i][coluna]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < num; i++) {
			System.out.print(mat[i][i]+" ");
		}
		System.out.println();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (mat[i][j] < 0) {

					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}
		}
		System.out.println();
		System.out.println("Matriz ALTERNADA: ");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
