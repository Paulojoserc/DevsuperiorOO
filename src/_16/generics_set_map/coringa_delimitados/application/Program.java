package _16.generics_set_map.coringa_delimitados.application;

import java.util.ArrayList;
import java.util.List;

import _16.generics_set_map.coringa_delimitados.model.entities.Circle;
import _16.generics_set_map.coringa_delimitados.model.entities.Rectangle;
import _16.generics_set_map.coringa_delimitados.model.service.Shape;

public class Program {
public static void main(String[] args) {
	List<Shape> myShapes = new ArrayList<>();
	myShapes.add( new Rectangle(3.0, 2.0));
	myShapes.add( new Circle(2.0));
	//Se add uma sublista de Circle ou rectangle não é aceito
	List<Circle> myCircles = new ArrayList<>();
	myCircles.add(new Circle(2.0));
	myCircles.add(new Circle(3.0));
	
	System.out.println("Total area: "+totalArea(myCircles)); // se não extender o totalArea vai da erro 
}
public static double totalArea(List<? extends Shape> list) { // Quando coloco "?" e "extends" o erro some pois estou disendo que a
	//classe extende da classe coringa
	double sum = 0;
	for(Shape s : list) {
		sum+= s.area();
	}
	return sum;
	
}
}
