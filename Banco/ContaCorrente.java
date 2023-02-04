package Banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero, double saldo, Cadastro titular) {
		super(agencia, numero, saldo, titular);
	}
	
	//Criando uma condição para pagar tributos apenas e somente na classe Conta Corrente. Trazendo os métodos para a classe instanciada.
	public boolean saca(double valor) {
		return super.saca(valor += 1.50);
	}
	
	public boolean transfere(double valor, Conta destino) {
		return super.transfere(valor +=1.50, destino);
	}
	
}
