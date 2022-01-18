package practicaunidad3;
/**
 * Clase que permite crear una cuenta bancaria y realizar operaciones de ingreso o retirada
 * @author IvánManso
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
	private double tipoInterés;
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
		tipoInterés = tipo;
	}
/**
 * Método que le da valor al nombre de una cuenta
 * @param nom
 */
	public void asignarNombre(String nom) {
		nombre = nom;
	}
/**
 * Método que devuelve el nombre asociado a una cuenta
 * @return nombre
 */
	public String obtenerNombre() {
		return nombre;
	}
/**
 * Método para saber el saldo de una cuenta
 * @return saldo
 */
	public double estado() {
		return saldo;
	}
/**
 * Método para ingresar dinero en una cuenta
 * Lanza una excepción si se intenta ingresar una cantidad negativa
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
 * Método para retirar dinero de una cuenta
 * Si la cantidad a retirar es negativa lanza una excepción 
 * o si se intenta retirar más de lo que hay en la cuenta lo muestra en pantalla
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
 * Método que devuelve la cuenta
 * @return cuenta
 */
	public String obtenerCuenta() {
		return cuenta;
	}
/**
 * Método que le da un valor a la cuenta
 * @param cuenta
 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * Método que le da un valor al saldo
 * @param saldo
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Método que devuelve el tipo de interés
 * @return tipoInterés
 */
	public double getTipoInterés() {
		return tipoInterés;
	}
/**
 * Método que le da un valor al tipo de interés
 * @param tipoInterés
 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
