package _07.const_this_sobre_encap.lab.application;


import java.util.Locale;
import java.util.Scanner;

import _07.const_this_sobre_encap.lab.entities.Account;

public class Program {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Account account = null;
	
	
	System.out.print("Enter account number: ");
	int number = sc.nextInt();
	
	System.out.print("Enter account holder: ");
	sc.nextLine();
	String name = sc.nextLine();
	System.out.println("IS there na initial deposit (y/n)");
	char resposta = sc.next().charAt(0);
	
	if(resposta == 'y') {
		System.out.print("Enter initial deposit value: ");
		double deposito = sc.nextDouble();
		account = new Account(resposta, name, deposito);
	}else {
	 account = new Account(resposta, name);
	}
	System.out.println();
	System.out.println("Account data:");
	System.out.println(account);
	
	System.out.println();
	System.out.print("Enter a deposit value: ");
	double deposito = sc.nextDouble();
	System.out.println("Account data:");
	System.out.println(account);
	
	System.out.println();
	System.out.print("Enter a withdraw value: ");
	double sacar = sc.nextDouble();
	System.out.println("Account data:");
	System.out.println(account);
	
	sc.close();
}
}
