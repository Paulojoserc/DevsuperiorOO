package _16.generics_set_map.genericsdelimitados.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import _16.generics_set_map.genericsdelimitados.model.entities.Product;
import _16.generics_set_map.genericsdelimitados.model.service.CalculatiomService;

public class Program {
public static void main(String[] args) {
	List<Product> list = new ArrayList<>();
	String path = "D:\\arquivos\\in.txt";
	
	try (BufferedReader br = new BufferedReader(new FileReader(path))){ //abrindo arquivo
		
		String line = br.readLine(); //ler toda lista ou arquivo do arquivo
		while(line != null) {
			String[] fields = line.split(",");//Vertor para receber linha do arquivos csv
			list.add(new Product(fields[0], Double.parseDouble(fields[1])));// Varre a lista de produto e armazena todos os produtos na lista
			line = br.readLine();
		}
		Product x = CalculatiomService.max(list);
		System.out.println("MOst expensive: ");
		System.out.println(x);
	}catch (Exception e) {
		System.out.println("Error: "+ e.getMessage());
	}
}
}
