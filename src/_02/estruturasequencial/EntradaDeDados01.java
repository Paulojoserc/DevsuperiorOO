package _02.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados01 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	String nome;
	int num;
	double valor;
	char genero;
	
	
	System.out.println("Digite o Genero");
	genero = sc.next().charAt(0);
	System.out.println("Digite o nome");
	nome = sc.next();
	System.out.println();
	System.out.println("Entre com o número");
	num = sc.nextInt();
	System.out.println();
	System.out.println("Entre com o valor");
	valor = sc.nextDouble();	
	System.out.printf("Nome é: "+nome+" Genero "+genero+ " número "+num+" valor R$: %.2f%n",valor );
	
	
	sc.close();
}
}
