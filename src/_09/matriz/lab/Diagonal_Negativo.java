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
	System.out.println("DIAGONAL PRINCIPAL:");
	for(int i =0; i<mat.length; i++) {
		System.out.print(mat[i][i]+" ");
	}
	System.out.println();
	int cont=0;
	for(int i= 0;i<mat.length; i++) {
		for(int j=0; j< mat[i].length; j++) {
			if(mat[i][j]<0) {
				cont++;
			}
		}
	}
	System.out.println("QUANTIDADE DE NEGATIVOS = "+cont);
	
	sc.close();
}
}
