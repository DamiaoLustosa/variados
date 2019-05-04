package aplication;

import java.util.Locale;
import java.util.Scanner;

import OO.Conta;


//Criado para interagir com a classe Conta
public class Programa2 {
	
	public static void main (String args []) {
		Locale.setDefault(Locale.US);	
		Scanner sc =  new Scanner (System.in);
		Conta conta;
		
		System.out.print("Entre com o número da Conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o nome do Titular da Conta: ");
		sc.nextLine();	//Inserido para consumir a quebra de linha que ficou do nextInt anterior
		String nome = sc.nextLine();
		System.out.print("Deseja realizar depósito inicial: y/n?");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			System.out.print("Informe o valor do depóstio");
			double valorInicial = sc.nextDouble();
			conta = new Conta(numero, nome, valorInicial);
		}
		else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println();
		System.out.print("Dados da Conta ");
		System.out.print(conta);
		
		System.out.println();
		System.out.print("Entre com um valor de depósito: ");
		double deposito = sc.nextDouble();
		conta.deposita(deposito);
		
		System.out.print("Dados Atualizados da Conta ");
		System.out.print(conta);
		
		
		
		System.out.println();
		System.out.print("Entre com um valor de Saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		
		System.out.print("Dados Atualizados da Conta ");
		System.out.print(conta);
		sc.close();
		
	}
}
