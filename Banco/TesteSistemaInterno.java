package Banco;

public class TesteSistemaInterno {

	public static void main(String[] args) {
		Cadastro cadg1 = new Cadastro("Jolyne Kujo", "787435798-10", "(11)98569-0089", 2.000);
		Cadastro cadg2 = new Cadastro("Kakyoin", "887466698-11", "(11)94349-7864", 28.200);
		GerenteGeral gCC = new GerenteGeral(1000, 201, 5.000, cadg1);
		GerenteDeTI gTI = new GerenteDeTI(1001, 202, 22.000, cadg2);
		
		boolean senhaGerente = gTI.acessoSistemaInterno(1888);
		
		if(senhaGerente) {
			System.out.println("Acesso permitido :)");
		}else{
			System.out.println("Acesso negado :(");
		}
		
		System.out.println("");
		
		boolean senhaGerenteTI = gTI.acessoSistemaInterno(1868);
		
		if(senhaGerenteTI) {
			System.out.println("Acesso permitido :)");
		}else{
			System.out.println("Acesso negado :(");
		}
		
	

	}

}
