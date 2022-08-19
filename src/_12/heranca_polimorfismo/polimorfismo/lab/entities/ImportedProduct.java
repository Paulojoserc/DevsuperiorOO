package _12.heranca_polimorfismo.polimorfismo.lab.entities;

public class ImportedProduct extends Product {
	public Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName() +" $ "
						+ String.format("%.2f", totalPrice()) 
						+  "(Customs fee: $ "+ customsFee+")";
	}
}
