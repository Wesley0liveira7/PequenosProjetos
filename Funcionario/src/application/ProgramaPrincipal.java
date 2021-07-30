package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
		//Em seguida, mostrar os dados do funcionário (nome e salário liquido).
		//Em seguida, aumentar o salário do funcionário com base em uma porcetagem dada
		//(somente o salário bruto é afetado pela porcetagem)
		//e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.

		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner (System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name : ");
		employee.name = teclado.nextLine();
		System.out.print("Gross salary : ");
		employee.grossSalary = teclado.nextDouble();
		System.out.print("Tax : ");
		employee.tax = teclado.nextDouble();
		
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = teclado.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee.name + ", " + employee.grossSalary);
		
		teclado.close();
	}

}
