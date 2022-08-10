package _09.matriz.lab;

import java.util.Scanner;

public class Negativos_Matriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int linha, coluna;

		System.out.print("Qual a quantidade de linhas da matriz? ");
		linha = sc.nextInt();

		System.out.print("Qual a quantidade de colunas da matriz? ");
		coluna = sc.nextInt();

		int[][] mat = new int[linha][coluna];

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("VALORES NEGATIVOS:");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if (mat[i][j]<0) {
					System.out.println(mat[i][j]);
				}
			}
		}

		sc.close();
	}
}
