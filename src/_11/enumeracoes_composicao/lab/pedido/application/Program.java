package _11.enumeracoes_composicao.lab.pedido.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import _11.enumeracoes_composicao.lab.pedido.entities.Client;
import _11.enumeracoes_composicao.lab.pedido.entities.Order;
import _11.enumeracoes_composicao.lab.pedido.entities.OrderItem;
import _11.enumeracoes_composicao.lab.pedido.entities.Product;
import _11.enumeracoes_composicao.lab.pedido.entities.enums.OrderStatus;

public class Program {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter client data:");
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("Email: ");
	String email = sc.next();
	System.out.print("Birth date (DD/MM/YYYY): ");
	Date birthDate = sdf.parse(sc.next());
	//Estanciando o cliente para receber os dados acima
	Client client = new Client(name, email, birthDate);
		
	System.out.println("Enter order data:");
	System.out.print("Status: ");
	OrderStatus status = OrderStatus.valueOf(sc.next());
	//Estanciado a class OrderStatus
	Order order = new Order(new Date(), status, client);
	
	System.out.print("How many items to this order? ");
	int num = sc.nextInt();
	for (int i=0; i<num; i++) {
		System.out.println("Enter #"+(i+1)+ " item data:");
		System.out.print("Product name: ");
		sc.nextLine();
		String productName = sc.nextLine();
		System.out.print("Product price: ");
		double productPrice = sc.nextDouble();
		//Estanciando a class produto para receber os dados acima
		Product product = new Product(productName, productPrice);

		System.out.print("Quantity: ");
		int quantity = sc.nextInt();

		OrderItem orderItem = new OrderItem(quantity, productPrice, product); 

		order.addItem(orderItem);
	}

	
	System.out.println();
	System.out.println(order);
	
	
	sc.close();
}
}
