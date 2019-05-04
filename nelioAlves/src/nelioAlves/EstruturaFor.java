package nelioAlves;

import java.util.Scanner;

public class EstruturaFor {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números serão informados? ");
		int n = sc.nextInt();

		int soma = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Valor #" + i + ": ");

			int x = sc.nextInt();
			soma += x;
		}

		System.out.println("Soma: " + soma);

		/*
		 * EXERCICIO: Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os
		 * ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
		 */

		System.out.println("------------------------- EXERCICIO ------------------------- ");

		System.out.println("Informe um numero");
		int m = sc.nextInt();

		for (int j = 1; j <= m; j++) {

			if (j % 2 != 0) {
				System.out.println(j);
			}
		}

		sc.close();

	}

}
