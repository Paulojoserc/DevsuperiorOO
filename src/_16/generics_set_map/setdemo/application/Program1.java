package _16.generics_set_map.setdemo.application;

import java.util.HashSet;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		//Hashset mais r�pido porem n�o ordenado
		//TreeSet mais lento e ordenado pelo compareTo do objeto
		//LinkedHashSet velocidade intermedi�ria e elementos na ordem em que s�o adicionados
		Set<String> set = new HashSet<>();
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}
	}
	
}
