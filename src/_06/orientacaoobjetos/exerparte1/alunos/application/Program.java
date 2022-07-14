package _06.orientacaoobjetos.exerparte1.alunos.application;

import java.util.Locale;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

import _06.orientacaoobjetos.exerparte1.alunos.entities.Student;

public class Program {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Student student = new Student();
	
	System.out.println("Nome do Aluno");
	student.nome = sc.nextLine();
	System.out.println("Digite as notas do primeiro trimestre");
	student.n1 = sc.nextDouble();
	System.out.println("Digite as notas do segundo trimestre");
	student.n2 = sc.nextDouble();
	System.out.println("Digite as notas do terceiro trimestre");
	student.n3 = sc.nextDouble();
	
	if(student.media()>=60){
		System.out.printf("Nota Final = %.2f%n",student.media());
		System.out.println("PASS");
	}else {
		System.out.printf("Nota Final = %.2f%n",student.media());
		System.out.println("FAILED");
		System.out.printf("Faltaram %.2f%n", student.situacao(), "Pontos");
	}
	
	sc.close();
}
}
