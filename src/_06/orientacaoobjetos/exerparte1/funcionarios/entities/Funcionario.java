package _06.orientacaoobjetos.exerparte1.funcionarios.entities;

public class Funcionario {
public String Name;
public double GrossSalary;
public double Tax;

public double NetSalary() {
	return GrossSalary - Tax;
}
public void Salary(double percentage) {
	GrossSalary+= GrossSalary * percentage/100.00;
}
public String toString() {
	return "Funcionario:, "
			+Name
			+", R$"
			+String.format("%.2f%n", NetSalary());
}
}
