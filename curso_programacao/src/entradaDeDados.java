import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);

		String x;
		x = teclado.next();
		System.out.println("Voc� digitou : " + x);
		int y;
		y = teclado.nextInt();
		System.out.println("Sua idade �: " + y);
		double w;
		w = teclado.nextDouble();
		System.out.printf("Sua altura �: %.2f\n ", w);

		teclado.close();

	}

}
