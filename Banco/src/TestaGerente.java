
public class TestaGerente {

	public static void main(String[] args) {
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);
		//System.out.println(funcionario1.getBonificacao());
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000.0);
		controle.registra(funcionario2);
		
		System.out.println(controle.getTotalDeBonificacoes());
		//gerente.setNome("João da Silva");
		//gerente.setSenha("4321");

	}

}
