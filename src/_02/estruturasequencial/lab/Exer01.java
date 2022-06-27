package _02.estruturasequencial.lab;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double LarguraT;
	double ComprimentoT;
	double MetroQuadrado;
	double AreaT;
	double PrecoT;
	
	
	System.out.println("Digite a largura do terreni: ");
	LarguraT = sc.nextDouble();
	System.out.println("Digite o comprimento do terreno: ");
	ComprimentoT = sc.nextDouble();
	System.out.println("Digite o valor do metro quadrado: ");
	MetroQuadrado = sc.nextDouble();
	
	AreaT = LarguraT * ComprimentoT;
	
	PrecoT = AreaT * MetroQuadrado;
	
	System.out.println("----------------------------");
	System.out.printf(" Largura do terreno é : %.1f%n",LarguraT);
	System.out.printf(" Comprimento do terreno é : %.1f%n",ComprimentoT);
	System.out.printf(" Valor do metro quadrado é : %.2f%n",MetroQuadrado);
	System.out.printf(" A area do terreno é: %.2f%n",AreaT);
	System.out.printf(" Preço do terreno é R$: %.2f%n",PrecoT);
	
	sc.close();
}
}
