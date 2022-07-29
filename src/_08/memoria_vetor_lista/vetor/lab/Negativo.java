package _08.memoria_vetor_lista.vetor.lab;

import java.util.Scanner;

public class Negativo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Quantos números você vai digitar? ");
	int num = sc.nextInt();
	
	if(num>10) {
		System.out.println("Limite não suportado digite novamente no maximo até 10");
		System.out.print("Quantos números você vai digitar? ");
		num = sc.nextInt();
	}
	int[] vect = new int[num];
	
	for(int i=0; i< vect.length; i++) {
		System.out.print("Digite um numero: ");
		vect[i] = sc.nextInt();
	}
	System.out.println("NÚMEROS NEGATIVOS: ");
	
	for(int i=0; i<vect.length; i++) {
		if(vect[i]<0) {
			System.out.println(vect[i]);
		}
	}
	
	sc.close();
}
}
