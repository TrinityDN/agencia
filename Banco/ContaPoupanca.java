package Banco;

public class ContaPoupanca extends Conta{
	
	//Identificando a classe super/mãe.

	public ContaPoupanca(int agencia, int numero, double saldo, Cadastro titular) {
		super(agencia, numero, saldo, titular);
		
		
	}
}
