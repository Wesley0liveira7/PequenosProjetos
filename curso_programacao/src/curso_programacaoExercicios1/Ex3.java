package curso_programacaoExercicios1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		int A, B , C , D, diferenca;
		
		Scanner teclado = new Scanner (System.in);
		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();
		D = teclado.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		teclado.close();
		
	}

}
