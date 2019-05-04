package aplication;

import java.util.Locale;
import java.util.Scanner;

import OO.ProdutoEncapsulamento;

public class ProgramaEncapsulamento {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Entre com os dados do Produto!");
		System.out.println("Nome do Produto: ");
		String nome = sc.nextLine();
		
		System.out.println("Pre�o do Produto: ");
		double preco = sc.nextDouble();		
		
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		
		ProdutoEncapsulamento produto = new ProdutoEncapsulamento(nome, preco, quantidade); //Inst�ncia do obejto Produto, com o construtor definido como n�o nulo
		
		produto.setNome("Carro"); //Alterando o nome pelo m�todo setNome
		produto.setPreco(30000.00); //alterando o preco pelo metodo setPreco
		System.out.println ("Dados do Produto: " + produto.getNome()); //Acessando o nome pelo m�todo getNome
		
		System.out.println();
		System.out.println("informe o n�mero de produtos que devem ser adicionados!");
		
		quantidade = sc.nextInt();
		produto.adicionaProduto(quantidade);
		
		System.out.println ("Dados atualizados: " + produto);
		
		
		System.out.println();
		System.out.println("informe o n�mero de produtos que devem ser Removidos!");
		
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);
		System.out.println ("Dados atualizados: " + produto);
		
		sc.close(); //fechando o Scanner
	
	}

}
