package _04.estruturarepetitivas.lab;

import java.util.Scanner;

public class ExerFor01 {
public static void main(String[] args) {
	
	Scanner sc  = new Scanner(System.in); 
		
	System.out.print("Deseja a tabuada para qual valor? ");
	
	int N = sc.nextInt();
	
	for (int i = 1; i <= 10; i++) {
	int resulta =	N *i;
		System.out.println(N +" x "+i+" = "+resulta);
	}
	
	sc.close();
}
}
