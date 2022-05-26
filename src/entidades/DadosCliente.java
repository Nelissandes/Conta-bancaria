package entidades;

public class DadosCliente {
	
	private String nome;
	private int numero;
	private double corrente;
	private double poupanca;

	public DadosCliente(String nome, int numero, double depositoInicial) {
		this.nome = nome;
		this.numero = numero;
		this.corrente = depositoInicial;
	}

	public DadosCliente(String nome, int numero, float depositoInicial) {
		this.nome = nome;
		this.numero = numero;
		this.poupanca = depositoInicial;
	}
	
	public DadosCliente(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public double getCorrente() {
		return corrente;
	}

	public double getPoupanca() {
		return poupanca;
	}

	public void depositoCorrente(double deposito) {
		corrente += deposito;
	}
	
	public void depositoPoupanca(double deposito) {
		poupanca += deposito;
	}
	
	//saque possui taxas de 5 reais
	public void saqueCorrente(double saque) {
		corrente -= (saque + 5.00);
	}
	
	public void saquePoupanca(double saque) {
		poupanca -= (saque + 5.00);
	}
	
	@Override
	public String toString() {
		return "Dados Cliente: "
	           + "Nome do titular da conta: "
	           + nome + ", numero da conta: "
	           + numero
	           + ", Valor em conta corrente: "
	           + corrente
	           + ", valor em conta poupança: " 
	           + poupanca;
			   
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

	

	}


