package nelioAlves;

import java.util.Scanner;

public class ExpressaoTernaria {
	public static void main (String args []) {
		
		
		
	//Uma express�o tern�ria Funciona como um if-else simplificado
	//Sintaxe: (express�o) ? valor_se_verdadeiro : valor_se_falso
	
	
	Scanner sc = new Scanner (System.in);
	System.out.println ("Informe o pre�o!");
	double preco;
	preco = sc.nextDouble();
	
	double desconto = (preco < 20) ? preco * 0.01 : preco * 0.05;  //Express�o Tern�ria
	System.out.println ("Desconto: " + desconto);
	
	
	
	sc.close();
	
}
	
}
