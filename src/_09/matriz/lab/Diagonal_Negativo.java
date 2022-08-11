package _09.matriz.lab;

import java.util.Scanner;

public class Diagonal_Negativo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Qual a ordem da matriz? ");
	int num = sc.nextInt();
	int[][] mat = new int[num][num];
	for(int i =0; i < mat.length ; i++) {
		for(int j=0; j< mat[i].length; j++) {
			System.out.print("Elemento "+"["+i+","+j+"]:");
			mat[i][j]= sc.nextInt();
		}
	}
	
	System.out.println();
	int somaPo=0;
	for(int i= 0;i<mat.length; i++) {
		for(int j=0; j< mat[i].length; j++) {
			if(mat[i][j]<0) {
				somaPo++;
			}
		}
	}
	System.out.println("QUANTIDADE DE NEGATIVOS = "+somaPo);
	System.out.println();
	System.out.print("Escolha uma linha ");
	int linha = sc.nextInt();
	System.out.println("LINHA ESCOLHIDA: ");
	for(int i=0; i< num; i++) {
		System.out.printf("%.1f ", mat[linha][i]);
	}
	System.out.printf("\n\nEscolha uma coluna: ");
	int coluna = sc.nextInt();
	System.out.println("COLUNA ESCOLHIDA: ");
	for(int i=0; i< num; i++) {
		System.out.printf("%.1f ", mat[coluna][i]);
	}
	System.out.println("DIAGONAL PRINCIPAL:");
	for(int i =0; i<mat.length; i++) {
		System.out.print(mat[i][i]+" ");
	}
	for(int i= 0;i<num; i++) {
		for(int j=0; j< num; j++) {
			if(mat[i][j]<0.0) {
				mat[i][j] =  (int) Math.pow(mat[i][j], 2);
			}
			
		}
	}
	System.out.println("Matriz Alterada:");
	for(int i= 0;i<mat.length; i++) {
		for(int j=0; j< mat[i].length; j++) {
			System.out.printf("%.1f ", mat[i][j]);
		}
		System.out.println();
	}
	
	sc.close();
}
}
