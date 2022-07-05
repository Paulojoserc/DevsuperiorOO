package _04.estruturarepetitivas.lab;

import java.util.Scanner;

public class Exer07While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 1;
		int cont=0, soma=0;

		while (x != 0) {

			System.out.print("Digite um número inteiro: ");
			x = sc.nextInt();
			
			while(cont< 5 ) {
			if(x  %2==0)	{
			soma=	x +=2;
				cont++;
			}
			
			}
		}
		System.out.println("SOma = "+soma);

		sc.close();
	}
}