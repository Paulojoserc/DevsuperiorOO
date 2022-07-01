package _04.estruturarepetitivas;

import java.util.Scanner;

public class While {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	int x = sc.nextInt();
	int cont =0;
	while (x !=0) {
		x = sc.nextInt();
		cont++;
		if (cont >= 3) {
			x=0;
		}
	}
	
	System.out.println("Quantas tentativas foram feitas "+cont);
	sc.close();
}
}
