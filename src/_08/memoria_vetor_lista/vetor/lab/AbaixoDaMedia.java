package _08.memoria_vetor_lista.vetor.lab;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double sum =0.0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int num = sc.nextInt();
		
		
		double[] vect = new double[num];
		
		for (int i =0; i< vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum+= vect[i];
		}
		double avg = sum / num;
		System.out.printf("MEDIA DO VETOR = %.3f%n",avg);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		for (int i =0; i< vect.length; i++) {
			if(vect[i]< avg) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}
