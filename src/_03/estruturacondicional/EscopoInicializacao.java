package _03.estruturacondicional;

public class EscopoInicializacao {
	public static void main(String[] args) {
		double price = 400.00;

		// Precisa ser iniciada para usar fora do if
		double discount = 0;

		if (price < 200.00) {
			discount = price * 0.1;
		}

		System.out.println(discount);
	}
}
