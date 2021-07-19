package curso_programacaoExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    cod1 = teclado.nextInt();
	    qte1 = teclado.nextInt();
	    preco1 = teclado.nextDouble();
	    
	    cod2 = teclado.nextInt();
	    qte2 = teclado.nextInt();
	    preco2 = teclado.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		teclado.close();
	}

}
