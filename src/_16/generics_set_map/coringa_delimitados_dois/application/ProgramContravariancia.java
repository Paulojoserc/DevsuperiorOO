package _16.generics_set_map.coringa_delimitados_dois.application;

import java.util.ArrayList;
import java.util.List;

public class ProgramContravariancia {
public static void main(String[] args) {
	List<Object> myObjs = new ArrayList<Object>();
	myObjs.add("Maria");
	myObjs.add("Alex");
	
	List<? super Number> myNums = myObjs;
	
	myNums.add(10);
	myNums.add(3.14);
	
	//Number x = myNums.get(0); //erro de compilação 
}
}
