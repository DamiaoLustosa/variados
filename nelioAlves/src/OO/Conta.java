package OO;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	
	//Construturoes
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposita(depositoInicial); 	//Chama o m�todo de dep�sito passando a variavel depositoInicial como argumento
	}
	
	//Getters e Setters
	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//Demais m�todos
	public void deposita(double montante) {
		saldo += montante;
	}
	
	
	public void saque(double montante) {
		saldo -= montante + 5; //A taxa de saque � R$ 5,00
	}

	public String toString() {
		return "Conta: "
				+ numero
				+ ", titular: "
				+ titular
				+ ", Saldo: "
				+ String.format("%.2f", saldo);
				
	}
	
}
