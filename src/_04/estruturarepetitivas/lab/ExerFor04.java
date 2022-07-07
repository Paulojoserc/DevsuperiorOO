package _04.estruturarepetitivas.lab;

import java.util.Scanner;

public class ExerFor04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x;
		int dentro = 0;
		int fora = 0;
		System.out.println("Quantos números você vai digitar? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			x =sc.nextInt();
			if (x>=10 && x<=20 ) {
			
			dentro++;
			}else {
			fora++;	
			}
		
		}
		System.out.println(dentro+" DENTRO" );
		System.out.println(fora+ " FORA");
		sc.close();
	}
}
