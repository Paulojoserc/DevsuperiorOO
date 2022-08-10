package _09.matriz.lab;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Linhas {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	double somaLinha1 =0.0, somaLinha2 =0.0;
	
	System.out.print("Qual a quantidade de linhas da matriz? ");
	int linha = sc.nextInt();
	
	System.out.print("Qual a quantidade de colunas da matriz? ");
	int coluna = sc.nextInt();
	
	double[][] mat= new double [linha][coluna];
	for(int i =0; i<linha; i++) {
		System.out.println("Digite os elementos da "+(i+1)+"ª. linha:");
		for (int j =0; j<coluna; j++) {
			mat[i][j] = sc.nextDouble();
			if(i==0) {
				somaLinha1 += mat[i][j];
			}else {
				somaLinha2 += mat[i][j];
			}
		}
	}
	System.out.println("VETOR GERADO:");
	System.out.println(somaLinha1);
	System.out.println(somaLinha2);
	sc.close();
}
}
