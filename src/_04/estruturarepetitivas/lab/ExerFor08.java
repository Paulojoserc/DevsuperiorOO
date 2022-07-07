package _04.estruturarepetitivas.lab;

import java.util.Scanner;

public class ExerFor08 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int  fatorial;
	System.out.print("Digite o valor de N: ");
	int n = sc.nextInt();
	fatorial=1;
	for (int i = n; i > 0; i--) {
	fatorial *= i;
	}
	System.out.printf("FATORIAL = %d\n", fatorial);
	sc.close();
}
}
