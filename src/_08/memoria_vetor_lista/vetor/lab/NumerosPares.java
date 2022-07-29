package _08.memoria_vetor_lista.vetor.lab;

import java.util.Scanner;

public class NumerosPares {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num, pares, cont = 0;
	System.out.print("Quantos números você vai digitar? ");
	num = sc.nextInt();
	
	int[] vect = new int[num];
	
	for(int i=0;i<vect.length;i++) {
		System.out.print("Digite um número: ");
		vect[i] = sc.nextInt();
	}
	
	System.out.print("NUMEROS PAREs: "); 
	System.out.println();
	for(int i=0;i<vect.length;i++) {
		if(vect[i] %2 ==0) {
			System.out.print(vect[i]+" ");
			cont++;
		}
	}
	System.out.println();
	System.out.print("QUANTIDADE DE PARES = "); 
	System.out.println(cont);
	sc.close();
}
}
