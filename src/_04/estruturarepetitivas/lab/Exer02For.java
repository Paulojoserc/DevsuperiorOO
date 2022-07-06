package _04.estruturarepetitivas.lab;

import java.util.Scanner;

public class Exer02For {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int x, y, soma = 0;
	
	System.out.println("Digite dois números: ");
	x = sc.nextInt();
	y = sc.nextInt();
	
	if (x<y) {
		for (int i = x+1; i < y; i++) {
			if(i%2==1) {
				soma+=i;
			}
		}
		
	}else if(x>y){
		for (int i = y+1; i < x; i++) {
			if(i%2!=0) {
				soma+=i;
			}
		}
	}
	System.out.print("SOMA DOS IMPARES = "+soma);
	
	sc.close();
}
}
