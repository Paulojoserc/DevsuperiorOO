package _08.memoria_vetor_lista.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// add elemento na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// add um elemento na lista
		list.add(2, "Marcos");

		// visualizar o tamanho da lista
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------");
		// deletar elemento da lista
		// list.remove("Anna");// remoção por comparação
		// list.remove(1); // remoção por indice
		list.removeIf(x -> x.charAt(0) == 'M');// remoção por letra

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------");
		// Listar por index
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------");
		// listar inicial
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------");
		// Listar pelo primeior elemento

		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}
