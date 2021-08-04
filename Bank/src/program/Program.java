package program;

import java.util.Locale;
import java.util.Scanner;

import entity.account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Em um banco, para se cadastrar um conta banc�ria, � necess�rio
	//	informar um n�mero da conta, o nome do titular da conta,
	//e o valor de dep�sito inicial que o titular depositou ao abrir
	//	a conta. Este valor de dep�sito inicial, entretando, � opcional,
	//	ou seja: se o titular n�o tiver dinheiro a depositar no momento
	//	de abrir sua conta, o dep�sito inicial n�o ser� feito e o saldo
	//	inicial da conta ser�, naturalmente, zero.
		
	//	Importante: uma vez que uma conta banc�ria foi aberta, o n�mero
	//	da conta nunca poder� ser alterado. J� o nome do titular pode ser
	//	alterado (pois uma pessoa pode mudar de nome por ocasi�o de
	//	casamento, por exemplo).
		
	//	Por fim, o saldo da conta n�o pode ser alterado livremete, �
	//	preciso haver um mecanismo para proteger isso. 
	//	O saldo s� aumenta por meio de dep�sitos, e se diminui
	//	por meio de saques. Para cada saque realizado, o banco cobra
	//	uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo
	//	se o saldo n�o for suficiente para realizar o saque e/ou pagar
	//	a taxa.
		
	//	voc� deve fazer um programa que realize o cadastro de uma conta,
	//	dando a op��o para que seja ou n�o informado o valor de dep�sito
	//	inicial. Em seguida, realizar um dep�sito e depois um saque,
	//	sempre mpstrando os dados da conta ap�s cada opera��o

		Locale.setDefault(Locale.US);
		
		account conta;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.printf("Enter account number: ");
		int numberAccount = teclado.nextInt();
		teclado.nextLine();
		System.out.printf("Enter account holder: ");
		String holder = teclado.nextLine();
		System.out.printf("Is there an initial deposit (y/n)? ");
		char response = teclado.next().charAt(0);
		
		if (response == 'y') {
			System.out.printf("Enter initial deposit value: ");
			double initialDeposit = teclado.nextDouble();
			conta = new account(numberAccount, holder, initialDeposit);
		}
		else {
			conta  = new account(numberAccount, holder);
		}
		
		System.out.println();
		
		System.out.println("Account data:");
		
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = teclado.nextDouble();
		
		conta.deposit(deposit);
		
		
		System.out.println("Update account data: ");
		System.out.println(conta);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = teclado.nextDouble();
		
		conta.withdraw(withdraw);
		
		
		System.out.println("Update account data: ");
		System.out.println(conta);
		
		
	
		teclado.close();
		
	}

}
