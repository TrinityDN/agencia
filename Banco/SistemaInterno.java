package Banco;

public class SistemaInterno extends Conta {

	public SistemaInterno(int agencia, int numero, double saldo, Cadastro titular) {
		super(agencia, numero, saldo, titular);
	}

	private int SENHADEACESSO = 1888;
//	private int senha;
	
	//Método: Acessar o sistema interno. acessoSistemaInterno.
	
	public boolean acessoSistemaInterno(int senha){
		if(SENHADEACESSO == senha) {
			System.out.println("Acesso permitido!");
			return true; 
		}else{
			System.out.println("Acesso negado!");
			return false;
		}
		
	}

//	public int getSenha() {
//		return senha;
//	}
//
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}
}
