package _12.heranca_polimorfismo.polimorfismo.exer.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import _12.heranca_polimorfismo.polimorfismo.exer.entities.Employee;
import _12.heranca_polimorfismo.polimorfismo.exer.entities.OutsourceEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the mumber of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int qHoras = sc.nextInt();
			System.out.print("Value per hour: ");
			double valorHora = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				// Employee emp = new OutsourceEmployee (name, qHoras, valorHora,
				// additionalCharge);
				list.add(new OutsourceEmployee(name, qHoras, valorHora, additionalCharge));
			} else {
				// Employee emp = new Employee(name, qHoras, valorHora );
				list.add(new Employee(name, qHoras, valorHora));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();
	}
}
