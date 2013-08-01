
class Funcionario {
	protected String nome;
	protected String cpf;
	private double salario;
	
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonificacao() {
		return this.getSalario() * 0.10;
	}
}
