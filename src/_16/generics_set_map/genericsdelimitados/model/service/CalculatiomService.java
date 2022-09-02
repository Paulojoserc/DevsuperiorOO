package _16.generics_set_map.genericsdelimitados.model.service;

import java.util.List;

public class CalculatiomService {
	//public static Integer max(List<Integer> list) {
	public static  <T extends Comparable<T>> T max(List<T> list) {	// <T> na frente do T significa que a classe vai trabalhar com algum tipo <T> 
	if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");//Lista não pode ser vazia
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) { // tive que declara <T extends Comparable<T>>
				max = item;
			}
		}
		return max;
	}
}
