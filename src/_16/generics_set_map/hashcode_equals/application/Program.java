package _16.generics_set_map.hashcode_equals.application;

import _16.generics_set_map.hashcode_equals.model.entities.Client;

public class Program {
public static void main(String[] args) {
	Client c1 = new Client("Maria", "maria@gmail.com");
	Client c2 = new Client("Alex", "alex@gmail.com");
	
	String s1 = "Test";
	String s2 = "Test";
	
	String s3 = new String("Test");
	String s4 = new String("Test");
	
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c1.equals(c2));
	System.out.println(c1 == c2); // compara onde esta alocado na memoria 
	System.out.println(s1 == s2); // o compilador interpreta literalmente o texto
	System.out.println(s3 == s4); // aqui eu instaciei o metado por isso vai da false
}
}
