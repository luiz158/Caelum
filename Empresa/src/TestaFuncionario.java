/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:37:45
 * 
 */
public class TestaFuncionario {
	public static void main(String[] args) {
		ControleBonus cb = new ControleBonus();

		Funcionario ana = new Gerente();
		ana.setSalario(5000.0);
		ana.setNome("Ana");
		cb.registra(ana);
		ana.mostra();

		Funcionario leo = new Secretario();
		leo.setSalario(1000.0);
		leo.setNome("Leo");
		cb.registra(leo);
		leo.mostra();

		System.out.println("Total de bonus: " + cb.getTotalBonus());
		

	}
}
