package cotacaoDolar;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Fa�a um programa para ler a cota��o do d�lar, e depois um
	//	valor em d�lares a ser comprado por uma pessoa em reais
	//	Informar quantos reais a pessoa vai pagar pelos d�lares,
	//	considerando ainda que a pessoa ter� que pagar 6% de IOF
	//	sobre o valor em d�lar. Criar uma classe CurrencyConverter
	//	para ser respons�vel pelos c�lculos.

		Locale.setDefault(Locale.US);
	
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("What is the dollar prince? ");
		double dolar = teclado.nextDouble();
		
		System.out.print("How many dolars will be bought? ");
		double qttDolar = teclado.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(dolar, qttDolar));
		
		
	}

}
