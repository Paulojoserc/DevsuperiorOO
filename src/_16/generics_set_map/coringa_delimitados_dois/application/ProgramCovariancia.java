package _16.generics_set_map.coringa_delimitados_dois.application;

import java.util.ArrayList;
import java.util.List;
//Covariância
public class ProgramCovariancia {
public static void main(String[] args) {
	List<Integer> intList = new ArrayList<Integer>();
	intList.add(10);
	intList.add(5);
	
	List<? extends Number> list = intList;
	Number x = list.get(0);
	System.out.println(x);
	//list.add(20); erro
}
}
