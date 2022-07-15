package _06.orientacaoobjetos.exerparte1.cambio.application;

import java.util.Locale;
import java.util.Scanner;

import _06.orientacaoobjetos.exerparte1.cambio.entities.CurrencyConverter;

public class Program {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	CurrencyConverter dolar = new CurrencyConverter();
	
	System.out.print("Qual o valor do dólar? ");
	dolar.valorDolar = sc.nextDouble();
	
	System.out.print("Quantos dólares serão comprados? ");
	dolar.dolarComprado = sc.nextDouble();
	
	System.out.print("Valor a ser pago em reais = "+dolar.compra());
	
	sc.close();
}
}
