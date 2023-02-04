package Banco;

//Superclasse

abstract class Conta {
	
	//Alterações

	Cadastro titular;
	private int agencia;
	private int numero;
	private double saldo = 100.00;

	
	// Construtor

	public Conta(int agencia, int numero, double saldo, Cadastro titular) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Criando MÉTODOS. Método void não devolve.
	// Valor a ser jogado no saldo.
	public void deposito(double valor) {
		this.saldo += valor;
	}

	// MÉTODO saca com boolean. Sem void pois o método devolve, retorna.
	public boolean saca(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	//MÉTODO transfere com boolean, pois apenas movimenta dinheiro, não retorna.
		
		public boolean transfere(double valor, Conta destino){
			if(saca(valor)) {
				destino.deposito(valor);
				return true;
			}else {
				return false;
			}
		}
	}