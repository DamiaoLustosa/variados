package OO;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {	//Construtor da Classe Produto. Por convenção, os argumentos dos métodos possuem os mesmos nomes dos atributos
																//Construtores possuem o mesmo nome da classe e pode ser declarado mais de um construtor para a classe além do construtor padrão
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	
	public void adicionaProduto(int quantidade) {
		this.quantidade += quantidade;	
	}
	
	public void removeProdutos (int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+ ", $ "
				+ String.format("%.2f", preco) //Usando saida formatada
				+ ", "
				+ quantidade
				+ " Unidades, "
				+ "R$ "
				+ String.format("%.2f",valorTotalEstoque()); //Usando saida formatada
	}
	
}
