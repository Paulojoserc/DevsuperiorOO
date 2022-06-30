package _03.estruturacondicional;

import java.util.Scanner;

public class SwichCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "ter�a";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}

		System.out.println("Dia da semana: " + dia);

		sc.close();
	}
}
