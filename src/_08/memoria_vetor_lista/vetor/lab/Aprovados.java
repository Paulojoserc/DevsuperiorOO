package _08.memoria_vetor_lista.vetor.lab;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Quantos alunos serão digitados? ");
	int num = sc.nextInt();
		
	String[] vectNome = new String[num];
	double[] vectNota1 = new double[num];
	double[] vectNota2 = new double[num];
	
	double media = 0;
	
	for(int i =0; i< num ; i++) {
		System.out.println("Digite nome, primeira e segunda nota do "+ (i +1) +"º aluno:");
		sc.nextLine();
		vectNome[i] = sc.nextLine();
		vectNota1[i] = sc.nextDouble();
		vectNota2[i] = sc.nextDouble();
		
		
		
	}
	System.out.println("Alunos aprovados");
	for(int i =0; i<num; i++ ) {
		media = (vectNota1[i] + vectNota2[i]) /2;
		if(media>= 6.0) {
			System.out.println(vectNome[i]);
		}
	}
	
	sc.close();
}
}
