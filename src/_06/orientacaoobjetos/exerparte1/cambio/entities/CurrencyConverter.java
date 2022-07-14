package _06.orientacaoobjetos.exerparte1.cambio.entities;

import _06.orientacaoobjetos.exerparte1.cambio.util.IOF;

public class CurrencyConverter {
	public double valorDolar;
	public double dolarComprado;

	public double cambio() {
		return dolarComprado * valorDolar  + IOF.taxa();

	}

	public String toString() {
		return "Valor a ser pago em reais = " + String.format("%.2f%n", cambio());
	}
}
