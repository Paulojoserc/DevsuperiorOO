package _17.funcional_lambda.consumer.mestatico.util;

import java.util.function.Consumer;

import _17.funcional_lambda.consumer.foreach.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice()*1.1);
		
	}

}
