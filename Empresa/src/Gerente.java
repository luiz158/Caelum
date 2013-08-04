/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:36:40
 * 
 */
public class Gerente extends Funcionario {
	private int senha;
	//int numeroDeFuncionariosGerenciados;

	@Override
	public double getBonus() {
		return this.salario * 0.15;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false; 
	}
	/*public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}*/
}
