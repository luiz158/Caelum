/**
 * 
 */

/**
 * @author glauco
 *
 * @Date 04/08/2013 11:50:11
 * 
 */
public class ValorInvalidoException extends RuntimeException{
	
	public ValorInvalidoException() {
		super("Valor Inválido!");
	}

	public ValorInvalidoException(String mensagem) {
		super(mensagem);
	}

}
