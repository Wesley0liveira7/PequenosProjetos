package program;

import java.util.Locale;
import java.util.Scanner;

import entity.account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Em um banco, para se cadastrar um conta bancária, é necessário
	//	informar um número da conta, o nome do titular da conta,
	//e o valor de depósito inicial que o titular depositou ao abrir
	//	a conta. Este valor de depósito inicial, entretando, é opcional,
	//	ou seja: se o titular não tiver dinheiro a depositar no momento
	//	de abrir sua conta, o depósito inicial não será feito e o saldo
	//	inicial da conta será, naturalmente, zero.
		
	//	Importante: uma vez que uma conta bancária foi aberta, o número
	//	da conta nunca poderá ser alterado. Já o nome do titular pode ser
	//	alterado (pois uma pessoa pode mudar de nome por ocasião de
	//	casamento, por exemplo).
		
	//	Por fim, o saldo da conta não pode ser alterado livremete, é
	//	preciso haver um mecanismo para proteger isso. 
	//	O saldo só aumenta por meio de depósitos, e se diminui
	//	por meio de saques. Para cada saque realizado, o banco cobra
	//	uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo
	//	se o saldo não for suficiente para realizar o saque e/ou pagar
	//	a taxa.
		
	//	você deve fazer um programa que realize o cadastro de uma conta,
	//	dando a opção para que seja ou não informado o valor de depósito
	//	inicial. Em seguida, realizar um depósito e depois um saque,
	//	sempre mpstrando os dados da conta após cada operação

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
