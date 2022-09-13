package _17.funcional_lambda.predicate.util;

import java.util.function.Predicate;

import _17.funcional_lambda.predicate.entities.Product;

public class ProductPredicate  implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}