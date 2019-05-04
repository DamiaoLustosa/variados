package aplication;

import java.util.Locale;
import java.util.Scanner;

import OO.Produto;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Entre com os dados do Produto!");
		System.out.println("Nome do Produto: ");
		String nome = sc.nextLine();
		
		System.out.println("Preço do Produto: ");
		double preco = sc.nextDouble();		
		
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade); //Instância do obejto Produto, com o construtor definido como não nulo
		
		
		System.out.println ("Dados do Produto" + produto);
		
		System.out.println();
		System.out.println("informe o número de produtos que devem ser adicionados!");
		
		quantidade = sc.nextInt();
		produto.adicionaProduto(quantidade);
		
		System.out.println ("Dados atualizados: " + produto);
		
		
		System.out.println();
		System.out.println("informe o número de produtos que devem ser Removidos!");
		
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);
		System.out.println ("Dados atualizados: " + produto);
		
		sc.close(); //fechando o Scanner
	
	}

}
