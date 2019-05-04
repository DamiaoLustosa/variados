package nelioAlves;

import java.util.Scanner;

public class ExpressaoTernaria {
	public static void main (String args []) {
		
		
		
	//Uma expressão ternária Funciona como um if-else simplificado
	//Sintaxe: (expressão) ? valor_se_verdadeiro : valor_se_falso
	
	
	Scanner sc = new Scanner (System.in);
	System.out.println ("Informe o preço!");
	double preco;
	preco = sc.nextDouble();
	
	double desconto = (preco < 20) ? preco * 0.01 : preco * 0.05;  //Expressão Ternária
	System.out.println ("Desconto: " + desconto);
	
	
	
	sc.close();
	
}
	
}
