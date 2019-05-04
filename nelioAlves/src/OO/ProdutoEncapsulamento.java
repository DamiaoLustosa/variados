package OO;

public class ProdutoEncapsulamento {
	private String nome;	//Tipo de acesso 'private' significa que os atributos s�o acessados apenas pela propria classe
	private double preco;
	private int quantidade;
	
	public ProdutoEncapsulamento(String nome, double preco, int quantidade) {	//Construtor da Classe Produto. Por conven��o, os argumentos dos m�todos possuem os mesmos nomes dos atributos
																				//Construtores possuem o mesmo nome da classe e pode ser declarado mais de um construtor para a classe al�m do construtor padr�o
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	//Por conven��o os gets e setts s�o colocados ap�s os m�todos coonstrutores das classes
	//Alt+shift+S >> Source >> Generate constructor using fields: insere construtores automaticamente no c�digo
	//Alt+shift+S >> Source >> Getters and Setters: insere getse setts automaticamente no c�digo
	
	public String getNome() {
		return nome;
	}
		
	public void setNome(String nome) {	//M�todos com void n�o retornam valores
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
	
	/*O m�todo 'setQuantidade' n�o deve ser implementado, pois, por regra de neg�cio,a quantidade de itens
	 * n�o pode ser alterada, sen�o por entradas e sa�das de estoque, o que fica a cargo dos m�todos
	 * adicionaProdutos e removeProdutos;
	*/
	
	
	//M�todos diversos
	
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
