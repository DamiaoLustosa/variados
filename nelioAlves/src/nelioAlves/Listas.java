package nelioAlves;

import java.util.ArrayList;
import java.util.List;	//Necess�ria a importa��o para trabalhar com listas
import java.util.stream.Collectors;

public class Listas {
	
	//Em Java, listas n�o s�o classes, mas interfaces. Por esse motivo elas n�o podem ser instanciadas

	public static void main(String[] args) {
		List <String> lista = new ArrayList<> ();			//Listas n�o aceitam tipos primitivos. Deve-se usar as wrapper classes
		lista.add("Maria");	// Adicionando item � lista		//ArrayList � o tipo de lista mais usado para instanciar uma lista
		lista.add("Pedro");
		lista.add("Jo�o");
		lista.add("Andr�");
		lista.add("Adriano");
		lista.add("Daniel");
		lista.add("Marco");
		lista.add(2,"Antonio"); //Adicionando elemento na posi��o 2. Lembrar: os indices iniciam em zero
		
		System.out.println("Tamanho da Lista: " + lista.size()); //Imprimindo o tamanho da lista

		for (String x : lista){		//Usando forEach para percorrer a lista
			System.out.println(x);
		}
		
		lista.remove(3); 		//Removendo elemento pelo �ndice
		lista.remove("Jo�o");	//Removendo elemento pelo nome
		
		
		System.out.println("--------------------------------------");
		for (String x : lista){		//Usando forEach para percorrer a lista atualizada
			System.out.println(x);
		}
		
		
		lista.removeIf(x -> x.charAt(0) == 'M'); //Removendo por meio predicado/condi��o (fun��o)
		
		
		System.out.println("--------------------------------------");
		for (String x : lista){		//Usando forEach para percorrer a lista atualizada
			System.out.println(x);
		}
		
		
		System.out.println("Posi��o do elemento Antonio: " + lista.indexOf("Antonio")); //Encontrando a posi��o de um elemento. Quando o elemento n�o � encontrado � retornado o valor -1
		
		
		System.out.println("--------------------------------------");
		
		List <String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Criando uma nova lista para filtrar os elementos que inician com a letra 'M'	
		for (String x : result){		//Usando forEach para percorrer a lista atualizada
			System.out.println("Iniciando com a leta A: " + x);
		}
		
		
		System.out.println("--------------------------------------");
		String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); //Procurando indice que iniciam coma letra 'A'
		System.out.println(nome); //Imprimindo os nomes encontrados pelo filto da String

	}

}
