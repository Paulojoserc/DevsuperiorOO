package _02.estruturasequencial.lab;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	
	double base = sc.nextDouble();
	
	double altura = sc.nextDouble();
	
	double area = base * altura;
	
	double perimetro = 2* (base + altura);
	
	double diagonal = Math.sqrt(Math.pow(base, 2.0)+Math.pow(altura, 2.0)); 
	
	System.out.println("----------------------------");
	System.out.printf(" Largura do terreno � : %.1f%n",base);
	System.out.printf(" Comprimento do terreno � : %.1f%n",altura);
	System.out.printf(" Valor do metro quadrado � : %.4f%n",area);
	System.out.printf(" A area do terreno �: %.4f%n",perimetro);
	System.out.printf(" Pre�o do terreno � R$: %.4f%n",diagonal);
	
	sc.close();
	
}
}
