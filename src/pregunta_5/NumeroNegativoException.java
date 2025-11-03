package pregunta_5;

//Excepción personalizada
public class NumeroNegativoException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

 public NumeroNegativoException(String mensaje) {
     super(mensaje);
 }
}