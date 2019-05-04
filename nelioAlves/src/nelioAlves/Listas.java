package nelioAlves;

import java.util.ArrayList;
import java.util.List;	//Necessária a importação para trabalhar com listas
import java.util.stream.Collectors;

public class Listas {
	
	//Em Java, listas não são classes, mas interfaces. Por esse motivo elas não podem ser instanciadas

	public static void main(String[] args) {
		List <String> lista = new ArrayList<> ();			//Listas não aceitam tipos primitivos. Deve-se usar as wrapper classes
		lista.add("Maria");	// Adicionando item à lista		//ArrayList é o tipo de lista mais usado para instanciar uma lista
		lista.add("Pedro");
		lista.add("João");
		lista.add("André");
		lista.add("Adriano");
		lista.add("Daniel");
		lista.add("Marco");
		lista.add(2,"Antonio"); //Adicionando elemento na posição 2. Lembrar: os indices iniciam em zero
		
		System.out.println("Tamanho da Lista: " + lista.size()); //Imprimindo o tamanho da lista

		for (String x : lista){		//Usando forEach para percorrer a lista
			System.out.println(x);
		}
		
		lista.remove(3); 		//Removendo elemento pelo índice
		lista.remove("João");	//Removendo elemento pelo nome
		
		
		System.out.println("--------------------------------------");
		for (String x : lista){		//Usando forEach para percorrer a lista atualizada
			System.out.println(x);
		}
		
		
		lista.removeIf(x -> x.charAt(0) == 'M'); //Removendo por meio predicado/condição (função)
		
		
		System.out.println("--------------------------------------");
		for (String x : lista){		//Usando forEach para percorrer a lista atualizada
			System.out.println(x);
		}
		
		
		System.out.println("Posição do elemento Antonio: " + lista.indexOf("Antonio")); //Encontrando a posição de um elemento. Quando o elemento não é encontrado é retornado o valor -1
		
		
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
