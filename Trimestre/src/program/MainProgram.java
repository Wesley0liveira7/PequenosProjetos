package program;

import java.util.Locale;
import java.util.Scanner;

import entity.Student;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fazer um programa para ler o nome e as tr�s notas que
		// ele obteve nos tr�s trimestres do ano (primeiro trimestre
		// vale 30 e o segundo e terceiro valem 35 cada).
		// Ao final, mostrar qual a nota final do aluno no ano.
		// Dizer tamb�m se o aluno est� aprovado (PASS) ou
		// n�o (FAILED) e, em caso negativo,
		// quantos pontos faltam para o aluno obter o minimo
		// para ser aprovado (que � 60% da nota).
		// Voc� deve criar uma classe Studente para resolver
		// este problema.

		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);

		Student student = new Student();

		student.Name = teclado.nextLine();


		student.n1 = teclado.nextDouble();
		student.n2 = teclado.nextDouble();
		student.n3 = teclado.nextDouble();

		if (student.n1 >= 0 && student.n1 <= 30 && student.n2 >= 0 && student.n2 <= 35 && student.n3 >= 0
				&& student.n3 <= 35 && student.finalGrade() >= student.note()) {
			System.out.printf("Final Grade = %.2f\n", student.finalGrade());
			System.out.println("PASS");
			System.out.println();
		} else if (student.finalGrade() < student.note()) {
			System.out.printf("Final Grade = %.2f\n ", student.finalGrade());
			System.out.printf("Failed \nMissing %.2f Points\n", 60 - student.finalGrade());
		}
		teclado.close();
	}

}
