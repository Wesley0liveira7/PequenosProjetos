package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de
		//N funcion�rios. N�o deve haver repeti��o de id.
		//Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
		//Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma
		//mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios,
		//conforme exemplos.
		//Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
		//ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
		//aumento por porcentagem dada.
		//(exemplo na pr�xima p�gina)

	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner (System.in);
	
	List<Employee> list = new ArrayList<>();
	int n = 0;
	
	System.out.print("How many employees will be registered? ");
	n = teclado.nextInt();
	
	for (int i = 1; i <= n; i++) {
		System.out.println ("Emplyoee #" + i);
		System.out.print("ID: ");
		int id = teclado.nextInt();
		while (hasId(list, id)) {
			System.out.print("Id already taken. Try again: ");
			id = teclado.nextInt();
		}
		teclado.nextLine();
		System.out.print("Name: ");
		String name = teclado.nextLine();
		System.out.print("Salary: ");
		double salary = teclado.nextDouble();
		list.add(new Employee (id,name,salary));
	}
	
	System.out.println();
	System.out.print("Enter the employee id that will have salary increase:");
	int id = teclado.nextInt();
	Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	if (emp == null) {
		System.out.println("This id does not exist!");
	}
	else {
		System.out.println("Enter the percentage:");
		double percent = teclado.nextDouble();
		emp.increaseSalary(percent);
	}
	System.out.println();
	System.out.println("List of employees:");
	for (Employee obj : list) {
		System.out.println(obj);
	}
	teclado.close();
	}

	private static boolean hasId(List<Employee> list, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
