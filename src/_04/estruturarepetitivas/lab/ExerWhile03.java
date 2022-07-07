package _04.estruturarepetitivas.lab;

import java.util.Scanner;

public class ExerWhile03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int senha = 0;
	
	do {
		System.out.print("Digite a senha: ");
		senha = sc.nextInt();
			if (senha != 2002) {
					System.out.println("Senha Invalida! Tente novamente: ");
			}else {
				System.out.println("Acesso permitido!");
			}
		
	}while(senha != 2002); 
	
	sc.close();
}
}
