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
		vectPorcentagem[i] = (vectVVenda[i] - vectVCompra[i]) / vectVCompra[i] * 100;
	}
	
	int abaixo=0, entre=0, acima=0;
	
	for (int i=0; i<num; i++) {
		if (vectPorcentagem[i]<10.0) {
			abaixo++;
		}
		else if (vectPorcentagem[i]<20.0) {
			entre++;
		}else {
			acima++;
		}
	}
	
	double vTotalCompra =0, vTotalVenda=0, lucroTotal;
	
	for (int i =0; i<num; i++) {
		vTotalCompra += vectVCompra[i];
		vTotalVenda+= vectVVenda[i];
	}
	lucroTotal = vTotalVenda - vTotalCompra;
	
	  System.out.println("\nRELATORIO:");
	    System.out.printf("Lucro abaixo de 10%%: %d\n", abaixo);
	    System.out.printf("Lucro entre 10%% e 20%%: %d\n", entre);
	    System.out.printf("Lucro acima de 20%%: %d\n", acima);
	    System.out.printf("Valor total de compra: %.2f\n", vTotalCompra);
	    System.out.printf("Valor total de venda: %.2f\n", vTotalVenda);
	    System.out.printf("Lucro total: %.2f\n", lucroTotal);
	
	sc.close();
}
}
