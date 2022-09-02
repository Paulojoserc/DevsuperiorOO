package _16.generics_set_map.generics.application;

import java.util.Scanner;

import _16.generics_set_map.generics.model.service.PrintService;

public class Program {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	PrintService<Integer> ps = new PrintService<>();
	//PrintService com o T vc só muda para <String>
	System.out.print("How many values? ");
	int n = sc.nextInt();
	
	for (int i = 0; i < n; i++) {
		int value = sc.nextInt();
		ps.addValue(value);
	}
	
	ps.print();
	System.out.print("First: "+ ps.first());
	sc.close();
}
}
