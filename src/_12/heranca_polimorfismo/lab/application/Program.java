package _12.heranca_polimorfismo.lab.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import _12.heranca_polimorfismo.lab.entities.Company;
import _12.heranca_polimorfismo.lab.entities.Individual;
import _12.heranca_polimorfismo.lab.entities.TaxPayer;

public class Program {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	List<TaxPayer> list = new ArrayList<>();
	
	System.out.print("Enter the number of tax payers: ");
	int num = sc.nextInt();
	
	for (int i=1; i<=num; i++) {
		System.out.println("Tax payer #"+i+" data:");
		System.out.print("Individual or company (i/c)? ");
		char ch = sc.next().charAt(0);
		if( ch == 'i') {
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			System.out.print("Health expenditures: ");
			double helthExpenditures = sc.nextDouble();
			
			list.add(new Individual(name, anualIncome, helthExpenditures));
		}else {
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			System.out.print("Number of employees: ");
			int numberOfEmployees = sc.nextInt();
			list.add(new Company(name, anualIncome, numberOfEmployees));
		}
	}
	System.out.println();
	System.out.println("TAXES PAID");
	for (TaxPayer tax : list) {
		System.out.println(tax.getName() + ": $ "+String.format("%.2f", tax.tax()));
	}
	
	double sum=0.0;
	for (TaxPayer tp : list) {
		sum += tp.tax();
	}
	System.out.println();
	System.out.print("TOTAL PAGO: $ "+String.format("%.2f", sum));
	sc.close();
}
}
