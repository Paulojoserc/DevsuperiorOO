package _16.generics_set_map.tiposcoringa.application;

import java.util.ArrayList;
import java.util.List;

public class ProgramExplication {
	public static void main(String[] args) {
		/*
		 * List<Object> myObjs = new ArrayList<Object>(); List<Integer> myNumbers = new
		 * ArrayList<Integer>(); myObjs = myNumbers; // lista de Object não recebe uma
		 * lista de Inteiro diferente.
		 */
		Object obj;
		Integer x = 10;
		obj = x; // já aqui o Object receber um Integer
		System.out.println(obj);

		List<?> myObjs = new ArrayList<Object>(); // Já com o tipo "?" ele recebe uma lista de qualquer tipo 
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers; 
		System.out.println(myObjs);

	}
}
