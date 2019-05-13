package aplicacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



//Leitura de arquivo com a classe scanner
public class BlocoFinally {

	public static void main(String[] args) {

		File arq = new File("C:\\Users\\Fam�lia Lustosa\\Documents\\in.txt"); // Declarando uma variavel do tipo arquivo, passando o caminho
														// como parametro
		Scanner sc = null;
		try {
			sc = new Scanner(arq);//lendo o arquivo com a classe Scanner
			while (sc.hasNextLine()) {//Equanto houver uma proxima linha no arquivo a leitura continua
				System.out.println(sc.nextLine());	//Imprimindo as linhas do arquivo
			}
		}
		
		catch (FileNotFoundException e) {	//Exce��o caso o arquivo n�o seja encontrado
			System.out.println("Erro ao procurar arquivo!!!" + e.getMessage());
		}
		
		finally {	//O bloco dentro do finally vai ser executado independente de haver exce��o ou n�o
			if(sc != null) {
				sc.close();
			}
			
			System.out.println("Aplica��o encerrada!");
		}

	}

}
;