package _09.matriz.lab;

import java.util.Scanner;

public class Soma_Matrizes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a quantidade de linhas da matriz? ");
		int linha = sc.nextInt();

		System.out.print("Qual a quantidade de colunas da matriz? ");
		int coluna = sc.nextInt();

		int[][] matA = new int[linha][coluna];
		int[][] matB = new int[linha][coluna];
		int[][] matC = new int[linha][coluna];
		System.out.println("Digite os valores da matriz B:");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matA[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite os valores da matriz B:");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matB[i][j] = sc.nextInt();
			}
		}
	
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];

			}
		}
		System.out.println("Matriz Soma:");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
			System.out.printf("%d ", matC[i][j]);	
			}
			System.out.println();
		}

		sc.close();
	}
}
