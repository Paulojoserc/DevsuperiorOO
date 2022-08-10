package _09.matriz.lab;

import java.util.Locale;
import java.util.Scanner;

public class Matriz_Geral {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double somaPositivo =0.0;
		System.out.print("Qual a ordem da matriz? ");
		int num = sc.nextInt();

		double[][] mat = new double[num][num];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <num; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextDouble();
				if( mat[i][j] > 0) {
					somaPositivo += mat[i][j];
				}
			}
		}
		System.out.print("SOMA DOS POSITIVOS: "+somaPositivo);

		sc.close();
	}
}
