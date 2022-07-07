package _04.estruturarepetitivas.lab;

import java.util.Scanner;

public class ExerFor05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Quantos números você vai digitar? ");
	int n = sc.nextInt();
	
	for (int i = 0; i < n; i++) {
		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		if(x>0 && x%2==0) {
			System.out.println("PAR POSITO");
		}else if(x<0 && x%2==0) {
			System.out.println("PAR NEGATIVO");
		}else if(x>0 && x%2!=0) {
			System.out.println("IMPAR POSITIVO");
		}else if (x==0) {
			System.out.println("NULO");
		}else {
			System.out.println("IMPAR NEGATIVO");
		}
	}
	
	
	sc.close();
}
}
