
class Gerente extends Funcionario {
	int senha;
	int numeroDeFuncionariosGerenciados;
	
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
}
