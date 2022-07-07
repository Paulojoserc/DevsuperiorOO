package _04.estruturarepetitivas.lab;

import java.util.Locale;
import java.util.Scanner;

public class ExerFor06 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Quatos casos você vai digitar? ");
	int nCasos =sc.nextInt();
	
	for (int i = 0; i < nCasos; i++) {
		
			System.out.println("Digite três números:");
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			double media = (n1*2.0+n2*3.0+n3*5.0)/10.0;
			System.out.printf("MEDIA = %.1f%n ",media);
			
		
	}
	
	sc.close();
}
}
