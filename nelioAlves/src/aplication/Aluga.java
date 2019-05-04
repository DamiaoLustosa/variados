package aplication;

import java.util.Scanner;

import OO.Aluguel;

public class Aluga {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		
		
		Aluguel alug [] = new Aluguel [10];
		
		System.out.println("Informe a quantidade a ser alugada: ");
		int quant = sc.nextInt();
		
		for (int i=1; i <= quant; i++) {
			
			System.out.println("Informe o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Informe o email: ");
			String email = sc.nextLine();
			System.out.println("Informe o quarto: ");
			int quarto = sc.nextInt();
			
			alug [quarto] = new Aluguel (nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos alugados! ");
		
		for (int i =1; i<10; i++) {
			if (alug [i] != null) {
				System.out.println(i + ": " + alug [i]);
			}
			
		}						
		
		sc.close();	
		
	}

}
