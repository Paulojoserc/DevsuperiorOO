package _04.estruturarepetitivas.lab;

import java.util.Scanner;

public class ExerWhile07 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	         
	        int contadorY = 1, soma = 0, armazenaX = 0;
	        while(true)
	        {
	         System.out.print("Digite um numero inteiro: ");
	        	int x = sc.nextInt();
	                armazenaX = x;
	                if(x % 2 == 0)
	                    soma += x;
	                else{
	                    armazenaX = x + 1;
	                    soma+= armazenaX;
	                }
	                while(contadorY < 5)
	                {
	                    armazenaX += 2;
	                    soma += armazenaX;
	                    contadorY++;
	                }   
	                if(x == 0)
	                    break;
	                System.out.println(soma);
	                contadorY = 1;
	                soma = 0;                
	        }
	        sc.close();
	    }
}