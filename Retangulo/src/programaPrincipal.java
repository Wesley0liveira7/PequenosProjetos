import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

import retangle.Retangle;

public class programaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fazer um programa para ler os valores da largura e altura de um ratângulo.
		// Em seguida, mostrar na tela o valor de sua área, perimetro e diagonal.
		// Usar uma classe como mostrado no projeto ao lado.

		Locale.setDefault(Locale.US);
		;

		Scanner teclado = new Scanner(System.in);

		Retangle retangle = new Retangle();
		System.out.println("Enter retangle width and height: ");
		
		retangle.width = teclado.nextDouble();
		retangle.height = teclado.nextDouble();
		
		System.out.println();
		
		System.out.printf("AREA = %.2f\n", retangle.area());
		System.out.printf("PERIMETER = %.2f\n" , retangle.perimeter());
		System.out.printf("DIAGONAL = %.2f\n", retangle.diagonal());
		
		teclado.close();

	}

}
