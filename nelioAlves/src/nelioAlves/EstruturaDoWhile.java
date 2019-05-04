package nelioAlves;

import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char resp;
		
		//A estrutura do-whilw executa o loop pelo menos uma vez antes de analisar se a condição é V ou F

		do {
			System.out.println("Entre com um número: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Raiz quadrada = %.3f%n", sq); // Saída formatada para três casa decimais

			System.out.printf("Repetir (y/n)?");
			resp = sc.next().charAt(0);

		} while (resp != 'n');	//Condição a ser analisada após o primeiro laço

		sc.close();

	}

}
