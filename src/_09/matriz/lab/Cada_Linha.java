package _09.matriz.lab;

import java.util.Scanner;

public class Cada_Linha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont0 = 0, cont1 = 0, cont2 = 0, cont3 = 0;
		System.out.print("Qual a ordem da matriz? ");
		int num = sc.nextInt();

		int[][] mat = new int[num][num];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
				if (i == 0) {
					if (cont0 < mat[i][j]) {
						cont0 = mat[i][j];
					}
				} else if (i == 1) {
					if (cont1 < mat[i][j]) {
						cont1 = mat[i][j];
					}
				} else if (i == 2) {
					if (cont2 < mat[i][j]) {
						cont2 = mat[i][j];
					}
				} else {
					if (cont3 < mat[i][j]) {
						cont3 = mat[i][j];
					}
				}
			}
		}
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
		System.out.println(cont0);
		System.out.println(cont1);
		System.out.println(cont2);
		System.out.println(cont3);
		sc.close();
	}
}
