package nelioAlves;

import java.util.Scanner;

public class Matrizes {
	public static void main (String args []) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int mat [][] = new int [n][n];	//Declarando uma matriz bidimensional
		
		//Uma sequencia dupla de for é usada para percorrer os elementos de uma matriz
		for (int i =0; i<n; i++) { 		//O 'i' representa as linhas da matriz. O 'n' pode ser substituido pelo atributo mat.length
			for (int j=0; j<n; j++) {	//O 'j' representa as colunas da matriz. O tamanho da coluna pode ser acessado por mat[i].length
				mat[i][j]=sc.nextInt();
			}
			
		}
		
		
		System.out.println("Diagonal Principal: ");
		for (int i=0; i<n; i++) {				
			System.out.print(mat [i][i] + " ");	//Gerando a diagonal principal da matriz
		}
		
		System.out.println();
		
		int contagem = 0;
		for (int i =0; i<n; i++) { 		//O 'i' representa as linhas da matriz
			for (int j=0; j<n; j++) {	//O 'j' representa as colunas da matriz
				if (mat[i][j]<0) {
					contagem ++;
				}
			}
			
		}
		
		System.out.println("Quantidade de números negatios: " + contagem);
		
		sc.close();		
		
	}

}
