package _11.enumeracoes_composicao.enumeracoes.application;

import java.util.Date;

import _11.enumeracoes_composicao.enumeracoes.entities.Order;
import _11.enumeracoes_composicao.enumeracoes.entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
	}
}
