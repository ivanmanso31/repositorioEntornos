
/**
 * Clase que permite crear una cuenta bancaria y realizar operaciones de ingreso o retirada
 * @author IvánManso
 * @version v1.0
 * @since 30/11/2021
 */
public class CuentaCorriente implements InterfazCuentaCorriente {
private static final int ZERO = 0;
/**
 * 
 */
	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;
/**
 * Constructor de una cuenta
 */
	public CuentaCorriente() {
	}
/**
 * Constructor de una cuenta 
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
	public CuentaCorriente(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}
/**
 * Método que le da valor al nombre de una cuenta
 * @param nom
 */
	@Override
	public void setNombre(String nom) {
		nombre = nom;
	}
/**
 * Método que devuelve el nombre asociado a una cuenta
 * @return nombre
 */
	@Override
	public String getNombre() {
		return nombre;
	}
/**
 * Método para saber el saldo de una cuenta
 * @return saldo
 */
	@Override
	public double getSaldo() {
		return saldo;
	}
/**
 * Método para ingresar dinero en una cuenta
 * Lanza una excepción si se intenta ingresar una cantidad negativa
 * @param cantidad
 * @throws Exception
 */
	@Override
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < ZERO) {
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
	@Override
	public void retirar(double cantidad) throws Exception {
		if (cantidad < ZERO) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (getSaldo() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}
/**
 * Método que devuelve la cuenta
 * @return cuenta
 */
	@Override
	public String getCuenta() {
		return cuenta;
	}
/**
 * Método que le da un valor a la cuenta
 * @param cuenta
 */
	@Override
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * Método que le da un valor al saldo
 * @param saldo
 */
	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Método que devuelve el tipo de interés
 * @return tipoInterés
 */
	@Override
	public double getTipoInteres() {
		return tipoInteres;
	}
/**
 * Método que le da un valor al tipo de interés
 * @param tipoInterés
 */
	@Override
	public void setTipoInteres(double tipoInterés) {
		this.tipoInteres = tipoInterés;
	}
/**
 * Método que devuelve el valor de ZERO
 * @return ZERO
 */
public static int getZero() {
	return ZERO;
}
}
