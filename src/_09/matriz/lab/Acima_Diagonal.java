package _09.matriz.lab;

import java.util.Scanner;

public class Acima_Diagonal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Qual a ordem da matriz? ");
	int num = sc.nextInt();

	int[][] mat = new int[num][num];
	int somaIMenor=0;
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			System.out.print("Elemento [" + i + "," + j + "]: ");
			mat[i][j] = sc.nextInt();
			if(i<j) {
				somaIMenor += mat[i][j];
			}
		}
	}
	
	System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = "+somaIMenor);
	sc.close();
}
}
