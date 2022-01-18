package practicaunidad3;
/**
 * Clase que permite crear una cuenta bancaria y realizar operaciones de ingreso o retirada
 * @author Iv�nManso
 * @version v1.0
 * @since 30/11/2021
 */
public class CCuenta {
/**
 * 
 */
	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInter�s;
/**
 * Constructor de una cuenta
 */
	public CCuenta() {
	}
/**
 * Constructor de una cuenta 
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInter�s = tipo;
	}
/**
 * M�todo que le da valor al nombre de una cuenta
 * @param nom
 */
	public void asignarNombre(String nom) {
		nombre = nom;
	}
/**
 * M�todo que devuelve el nombre asociado a una cuenta
 * @return nombre
 */
	public String obtenerNombre() {
		return nombre;
	}
/**
 * M�todo para saber el saldo de una cuenta
 * @return saldo
 */
	public double estado() {
		return saldo;
	}
/**
 * M�todo para ingresar dinero en una cuenta
 * Lanza una excepci�n si se intenta ingresar una cantidad negativa
 * @param cantidad
 * @throws Exception
 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}
/**
 * M�todo para retirar dinero de una cuenta
 * Si la cantidad a retirar es negativa lanza una excepci�n 
 * o si se intenta retirar m�s de lo que hay en la cuenta lo muestra en pantalla
 * @param cantidad
 * @throws Exception
 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}
/**
 * M�todo que devuelve la cuenta
 * @return cuenta
 */
	public String obtenerCuenta() {
		return cuenta;
	}
/**
 * M�todo que le da un valor a la cuenta
 * @param cuenta
 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * M�todo que le da un valor al saldo
 * @param saldo
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * M�todo que devuelve el tipo de inter�s
 * @return tipoInter�s
 */
	public double getTipoInter�s() {
		return tipoInter�s;
	}
/**
 * M�todo que le da un valor al tipo de inter�s
 * @param tipoInter�s
 */
	public void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}
}
