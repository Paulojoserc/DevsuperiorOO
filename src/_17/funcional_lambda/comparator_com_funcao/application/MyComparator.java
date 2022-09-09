package _17.funcional_lambda.comparator_com_funcao.application;import java.util.Comparator;

import _17.funcional_lambda.comparator_com_funcao.model.entities.Product;

public class MyComparator  implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
