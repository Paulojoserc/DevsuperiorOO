package _16.generics_set_map.tiposcoringa.application;

import java.util.Arrays;
import java.util.List;

public class ProgramLerTiposCoringas {
public static void main(String[] args) {
	List<Integer> myInts = Arrays.asList(5, 2, 10);// macete para já informa os valores com o Arrays.asList
	printList(myInts);
	
	List<String> myStrs = Arrays.asList("Maria","Alex", "Bob");
	printList(myStrs);
}

public static void printList(List<?> list) { // transformando as classes em coringa com <?>
	for (Object obj : list) {
		System.out.println(obj);
	}
}
}
