package _03.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Condicaoternária {
 public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
	 
	 double preco = sc.nextDouble();
	 
	 double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
	 
	 System.out.println(desconto);
	 
	 System.out.printf("Valor total é %.2f%n", (preco - desconto));
	 
	 
	 sc.close();
	 
}
}
