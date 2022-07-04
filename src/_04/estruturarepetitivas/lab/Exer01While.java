package _04.estruturarepetitivas.lab;

import java.util.Scanner;

public class Exer01While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 1;
		
		
		while (x != y) {
			System.out.println("Digite dois números");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x>y) {
				System.out.println("DECRESCENTE!");
			}else if(x<y){
				System.out.println("CRESCENTE!");
			}else {
				
			}
		}
		
		sc.close();
		
	}
}
