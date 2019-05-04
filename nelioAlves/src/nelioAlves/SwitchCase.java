package nelioAlves;

import java.util.Scanner;

public class SwitchCase {
	public static void main (String args []) {
		Scanner sic = new Scanner(System.in);
		int x = sic.nextInt();
		
		String dia;
		
		
		switch (x) {
		case 1: dia = "Domingo";
		break;
		
		case 2: dia= "Segunda";
		break;
		
		case 3: dia = "Terça";
		break;
		
		case 4: dia = "Quarta";
		break;
		
		case 5: dia = "Quinta";
		break;
		
		
		default: dia = "dia inválido";
		
		}
		
		System.out.println(dia);
		
		sic.close();
	
	}
	
	

}
