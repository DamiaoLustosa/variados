package aplication;

import java.util.Locale;
import java.util.Scanner;

import OO.ProdutoVetor;

public class Vetor {
	public static void main (String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		ProdutoVetor vetor[] = new ProdutoVetor [n];
		
		for (int i=0; i<= n; i++) { //O 'n' pode ser substituido pelo operador "length", para determinar o tamanho do vetor. Exemplo: vetor.length
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			
			vetor [i] = new ProdutoVetor(nome,preco);
		}
		
		double soma = 0.0;
		 for (int i =0; i<=n; i++) {
			 soma += vetor [i].getPreco();
		 }
		
		 
		 double media = soma/n;
		 
		System.out.printf("Média de preços: %.2f%n",  media);
		 
		
		
		
		sc.close();
	}

}
