package curso_programacaoExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.14159
		
		Scanner teclado = new Scanner (System.in);
		
		double raio, area, pi;
		pi = 3.14159;
		
		raio = teclado.nextDouble();
		
		area = pi * (raio * raio);
		Locale.setDefault(Locale.US);
		
		System.out.printf("A = %.4f\n" ,area);
		
		teclado.close();
	}

}
