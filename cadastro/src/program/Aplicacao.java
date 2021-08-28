package program;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
		//nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
		//método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
		//da pessoa.
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner (System.in);
		
		
		
		System.out.print("Nome: ");
		String nome = teclado.nextLine();
		System.out.print("Nascimento: ");
		int nascimento = teclado.nextInt();
		System.out.print("Altura: ");
		double altura = teclado.nextDouble();
		
		System.out.println();
		
		Pessoa pessoa = new Pessoa (nome, nascimento, altura);
		
		System.out.println(pessoa);
		
		System.out.println();
		System.out.println("Idade: " + pessoa.idade(nascimento));

	}

}
