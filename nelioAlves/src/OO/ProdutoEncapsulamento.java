package OO;

public class ProdutoEncapsulamento {
	private String nome;	//Tipo de acesso 'private' significa que os atributos são acessados apenas pela propria classe
	private double preco;
	private int quantidade;
	
	public ProdutoEncapsulamento(String nome, double preco, int quantidade) {	//Construtor da Classe Produto. Por convenção, os argumentos dos métodos possuem os mesmos nomes dos atributos
																				//Construtores possuem o mesmo nome da classe e pode ser declarado mais de um construtor para a classe além do construtor padrão
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	//Por convenção os gets e setts são colocados após os métodos coonstrutores das classes
	//Alt+shift+S >> Source >> Generate constructor using fields: insere construtores automaticamente no código
	//Alt+shift+S >> Source >> Getters and Setters: insere getse setts automaticamente no código
	
	public String getNome() {
		return nome;
	}
		
	public void setNome(String nome) {	//Métodos com void não retornam valores
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	/*O método 'setQuantidade' não deve ser implementado, pois, por regra de negócio,a quantidade de itens
	 * não pode ser alterada, senão por entradas e saídas de estoque, o que fica a cargo dos métodos
	 * adicionaProdutos e removeProdutos;
	*/
	
	
	//Métodos diversos
	
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
