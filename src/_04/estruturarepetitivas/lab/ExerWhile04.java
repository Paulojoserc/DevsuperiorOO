package _04.estruturarepetitivas.lab;

import java.util.Scanner;

public class ExerWhile04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x , y ;
	
	System.out.println("Digite os valores das coordenadas X e Y: ");
	x = sc.nextInt();
	y = sc.nextInt();
	
	while ( x != 0 && y !=0) {
		
					
			if(x > 0 && y >0 ) {
				System.out.println("QUADRANTE Q1");
			}
			if (x < 0 && y >0) {
				System.out.println("QUADRANTE Q2");
			}
			if (x< 0 && y<0) {
				System.out.println("QUADRANTE Q3");
			}
			if (x>0 && y<0) {
				System.out.println("QUADRANTE Q4");
			}
			System.out.println("Digite os valores das coordenadas X e Y: ");
			x = sc.nextInt();
			y = sc.nextInt();
	}
	
	
	sc.close();
}
}
