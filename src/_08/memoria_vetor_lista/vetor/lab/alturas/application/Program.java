package _08.memoria_vetor_lista.vetor.lab.alturas.application;

import java.util.Locale;
import java.util.Scanner;


import _08.memoria_vetor_lista.vetor.lab.alturas.entities.Pessoas;

public class Program {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Quantas pessoas serão digitadas? ");
	int num = sc.nextInt();
	
	
	
	Pessoas[] vect = new Pessoas[num];
	for (int i=0; i<vect.length; i++) {
		sc.nextLine();
		System.out.println("Dados da "+ (i+1) +"a pessoa:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		vect[i] = new Pessoas(name, idade, altura);
	}
	double sumAlturas =0.0;
	for (int i=0; i<num; i++) {
		sumAlturas+= vect[i].getAltura();
	}
	double avgAlturas =sumAlturas/num;
	
	System.out.printf("Altura média: %.2f%n", avgAlturas);
	
	int menosres = 0;
	
	System.out.println("Pessoas com menos de 16 anos: ");
	int idade=0;
	for(int i=0; i<vect.length; i++) {
		if(idade<16) {
			menosres++;
		}
	}
	
	sc.close();
}
}
