package _06.orientacaoobjetos.exerparte1.funcionarios.application;

import java.util.Locale;
import java.util.Scanner;

import _06.orientacaoobjetos.exerparte1.funcionarios.entities.Funcionario;

public class Program {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Funcionario funcionario = new Funcionario();
	
	System.out.print("Nome: ");
	funcionario.Name = sc.nextLine();
	System.out.print("Salário bruto: ");
	funcionario.GrossSalary = sc.nextDouble();
	System.out.print("Imposto: ");
	funcionario.Tax = sc.nextDouble();
	
	System.out.println();
	System.out.print("Funcionário: "+funcionario);
	
	System.out.println();
	System.out.print("Qual a porcentagem para aumentar o salário?");
	funcionario.Salary(sc.nextDouble());
	
	System.out.println();
	System.out.print("Dados atualizados: "+funcionario);
			
	sc.close();		
}
}
