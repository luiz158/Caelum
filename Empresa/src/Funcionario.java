/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:36:16
 * 
 */
public abstract class Funcionario {
	private String nome;
	//protected String cpf;
	protected double salario;

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario
	 *            the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract double getBonus();
	
	void mostra () {
		System.out.println("Bonificacao de " + getNome() + ": " + this.getBonus());
		//System.out.println(this.getBonus());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
