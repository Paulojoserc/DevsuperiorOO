package _12.heranca_polimorfismo.polimorfismo.lab.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import _12.heranca_polimorfismo.polimorfismo.lab.entities.ImportedProduct;
import _12.heranca_polimorfismo.polimorfismo.lab.entities.Product;
import _12.heranca_polimorfismo.polimorfismo.lab.entities.UsedProduct;

public class Program {
public static void main(String[] args) throws ParseException {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	List<Product> list = new ArrayList<>();
	
	System.out.print("Enter the mumber of products: ");
	int num = sc.nextInt();
	
	for (int i =1; i<=num; i++) {
		System.out.println("Product #"+i+" data:");
		System.out.print("Common, used or imported (c/u/i)? ");
		char ch = sc.next().charAt(0);
		System.out.print("Name: ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		if(ch == 'i' || ch == 'I' ) {
			System.out.print("Customs fee: ");
			double priceImpost = sc.nextDouble();
			list.add(new ImportedProduct(name, price, priceImpost));
		}else if (ch == 'u' || ch == 'U') {
			System.out.print("Manufacture date (DD/MM/YYYY): ");
			Date dateManufacture = sdf.parse(sc.next());
			list.add(new UsedProduct(name, price, dateManufacture));
		}else {
			list.add(new Product(name, price));
		}
	}
	System.out.println();
	System.out.println("PRICE TAGS");
	for (Product product : list) {
		System.out.println(product.priceTag());
	}
	sc.close();
}
}
