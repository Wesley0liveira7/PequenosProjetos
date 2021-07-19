package curso_programacaoExercicios1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		//mensagem explicativa, conforme exemplos.
		
		Scanner teclado = new Scanner(System.in);
		
		int a, b, soma;
		
		a = teclado.nextInt();
		b = teclado.nextInt();
		
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		teclado.close();
	}

}
