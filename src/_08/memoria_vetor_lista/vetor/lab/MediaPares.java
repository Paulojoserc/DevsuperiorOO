package _08.memoria_vetor_lista.vetor.lab;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Quantos Elementos vai ter o vetor? ");
	int num = sc.nextInt();
	
	double sumPar=0, cont=0;
	
	double[] vect = new double[num];
	
	for(int i=0; i < vect.length; i++) {
		System.out.print("DIgite um número: ");
		vect[i] = sc.nextDouble();
		
		if(vect[i] %2 == 0) {
			sumPar+= vect[i];
			cont++;
		}
	
	}
	if (sumPar<= 0) {
		System.out.println("NENHUM NÚMERO PAR");
	}else {
		System.out.println("MÉDIA DOS PARES = "+(sumPar/cont));
	}
	
	sc.close();
}
}
