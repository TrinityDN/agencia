package Banco;

import CartaoDeCredito.CartaoVisa;

public class CriarConta {
	public static void main(String[] args) {

		Cadastro cad1 = new Cadastro("Dio Brando", "57769503-1", "(11)95445-0987", 2300);
		Cadastro cadg1 = new Cadastro("Jolyne Kujo", "787435798-10", "(11)98569-0089", 2.000);
		Cadastro cad2 = new Cadastro("Jonathan Joestar", "39835948", "(11)4859495", 2300);
		
		GerenteGeral gCC = new GerenteGeral(1000, 201, 5.000, cadg1);
		ContaCorrente cc1 = new ContaCorrente(101, 189, 100.00, cad2);
		ContaCorrente cc2 = new ContaCorrente(101, 190, 100.00, cadg1);
		ContaPoupanca cp1 = new ContaPoupanca(101, 189, 200.00, cadg1);
		

		CartaoVisa cartaoDio = new CartaoVisa(cad1);
		// Imprimir os dados do cliente.

		System.out.println("AGÊNCIA: " + cc2.getAgencia());
		System.out.println(" ");
		System.out.println("Saldo: " + "R$" + cc1.getSaldo());
		System.out.println(" ");
		System.out.println("Saldo: " + "R$" + cc2.getSaldo());
		System.out.println(" ");

		// Depositando R$500,00 para a conta corrente 1.
		cc1.deposito(500);

		// Impressão do depósito
		System.out.println("Depósito de R$500.00");
		System.out.println("Saldo: " + "R$" + cc1.getSaldo());

		System.out.println(" ");

		// Transferência de 300 para a conta corrente 2.
		cc1.transfere(300, cc2);

		// Impressão da transferência
		System.out.println("Transferência de R$300.00");
		System.out.println("Saldo:" + "R$" + cc2.getSaldo());
		System.out.println(" ");

		// Tranferência da CC 1 para CC2

		cc1.transfere(300.1, cc2);
		System.out.println(
				"Transferência de R$301.00 para Conta Corrente: " + cc2.getNumero() + ", agência " + cc2.getAgencia());
		System.out.println("Saldo de " + cc1.titular.getNome() + ": " + "R$" + cc1.getSaldo());
		System.out.println("Saldo de: " + cc2.titular + "R$" + cc2.getSaldo());

		System.out.println(" ");
		System.out.println("Titular: " + cc1.titular.getNome());
		System.out.println("CPF: " + cc1.titular.getCpf());
		System.out.println("Telefone: " + cc1.titular.getTelefone());
		System.out.println("Renda Bruta: " + cc1.titular.getRendaBruta());
		System.out.println(" ");
		System.out.println("Titular: " + cc2.titular.getNome());
		System.out.println("CPF: " + cc2.titular.getCpf());
		System.out.println("Telefone: " + cc2.titular.getTelefone());
		System.out.println("Renda Bruta: " + cc2.titular.getRendaBruta());

		System.out.println(" ");

		System.out.println("Limite do C.Visa de Abel: R$" + cartaoDio.getLimite());

		if (cartaoDio.usarCartao(3000)) {
			System.out.println("Compra Autorizada no valor de R$3000");
		} else {
			System.out.println("Contate a sua administradora de cartão");
		}

		System.out.println(" ");

		if (cartaoDio.usarCartao(2000)) {
			System.out.println("Compra Autorizada no valor de 2000");
		} else {
			System.out.println("Contate a sua administradora de cartão");
		}

		System.out.println(" ");
		if (cartaoDio.usarCartao(1000)) {
			System.out.println("Compra Autorizada no valor de R$1000");
		} else {
			System.out.println("Contate a sua administradora de cartão");
		}

		System.out.println(" ");
		if (cartaoDio.usarCartao(0.10)) {
			System.out.println("Compra Autorizada no valor de R$0,10");
		} else {
			System.out.println("Contate a sua administradora de cartão");
		}

		// Acesso ao Gerente Geral ao Sistema Interno.

		System.out.println(" ");
		System.out.println("_________________________________");
		System.out.println(" ");
		System.out.println("CONTROLE DE ACESSO AO GERENTE GERAL!");
		// gg1.setSenha(1588);
		System.out.println(" ");
		gCC.acessoSistemaInterno(1888);
		System.out.println("");
		System.out.println("_________________________________");

	}
}
