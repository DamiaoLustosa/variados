package nelioAlves;

import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char resp;
		
		//A estrutura do-whilw executa o loop pelo menos uma vez antes de analisar se a condi��o � V ou F

		do {
			System.out.println("Entre com um n�mero: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Raiz quadrada = %.3f%n", sq); // Sa�da formatada para tr�s casa decimais

			System.out.printf("Repetir (y/n)?");
			resp = sc.next().charAt(0);

		} while (resp != 'n');	//Condi��o a ser analisada ap�s o primeiro la�o

		sc.close();

	}

}
