import java.util.Locale;
import java.util.Scanner;

import produto.Product;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fazer um programa para ler os dados de um produto em estoque
		//(nome, preço e quantidade no estoque).args
		//Em seguida:
		//- Mostrar os dados do produto 
		//(nome, preço, quantidade no estoque, valor total no estoque)
		//- Realizar uma entrada no estoque e mostrar novamente os dados do produto
		//- Realizar a saída no estoque e mostrar novamente os dados do produto.
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("name: ");
		product.name = teclado.nextLine();
		System.out.print("Price: ");
		product.price = teclado.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = teclado.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		
		System.out.print("Enter the o number of products to be added in stock: ");
		int quantity = teclado.nextInt();
		product.addProduct(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.print("Enter the o number of products to be removed from stock: ");
		quantity = teclado.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		teclado.close();
	}

}
