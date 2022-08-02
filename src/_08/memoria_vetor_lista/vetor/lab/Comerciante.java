package _08.memoria_vetor_lista.vetor.lab;

import java.util.Locale;
import java.util.Scanner;

public class Comerciante {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Serão digitados dados de quantos produtos? ");
	int num = sc.nextInt();
	
	String[] vectNome = new String[num];
	double[] vectVCompra = new double[num];
	double[] vectVVenda = new double[num];
	double[] vectPorcentagem = new double[num];
	
	
	for (int i = 0; i < num ; i++ ) {
		System.out.println("Produto "+ (i+1));
		System.out.print("Name: ");
		vectNome[i] = sc.next();
		System.out.print("Preço de compra: ");
		vectVCompra[i] = sc.nextDouble();
		System.out.print("Preço de venda: ");
		vectVVenda[i] = sc.nextDouble();
	}
	
	for (int i =0; i<num; i++) {
		vectPorcentagem[i] = (vectVVenda[i] - vectVCompra[i]) / vectVCompra[i]/100;
	}
	
	
	
	
	sc.close();
}
}
