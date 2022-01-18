
/**
 * Clase que permite crear una cuenta bancaria y realizar operaciones de ingreso o retirada
 * @author Iv�nManso
 * @version v1.0
 * @since 30/11/2021
 */
public class CuentaCorriente implements InterfazCuentaCorriente {//comentario dev
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
 * M�todo que le da valor al nombre de una cuenta
 * @param nom
 */
	@Override
	public void setNombre(String nom) {
		nombre = nom;
	}
/**
 * M�todo que devuelve el nombre asociado a una cuenta
 * @return nombre
 */
	@Override
	public String getNombre() {
		return nombre;
	}
/**
 * M�todo para saber el saldo de una cuenta
 * @return saldo
 */
	@Override
	public double getSaldo() {
		return saldo;
	}
/**
 * M�todo para ingresar dinero en una cuenta
 * Lanza una excepci�n si se intenta ingresar una cantidad negativa
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
 * M�todo para retirar dinero de una cuenta
 * Si la cantidad a retirar es negativa lanza una excepci�n 
 * o si se intenta retirar m�s de lo que hay en la cuenta lo muestra en pantalla
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
 * M�todo que devuelve la cuenta
 * @return cuenta
 */
	@Override
	public String getCuenta() {
		return cuenta;
	}
/**
 * M�todo que le da un valor a la cuenta
 * @param cuenta
 */
	@Override
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * M�todo que le da un valor al saldo
 * @param saldo
 */
	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * M�todo que devuelve el tipo de inter�s
 * @return tipoInter�s
 */
	@Override
	public double getTipoInteres() {
		return tipoInteres;
	}
/**
 * M�todo que le da un valor al tipo de inter�s
 * @param tipoInter�s
 */
	@Override
	public void setTipoInteres(double tipoInter�s) {
		this.tipoInteres = tipoInter�s;
	}
/**
 * M�todo que devuelve el valor de ZERO
 * @return ZERO
 */
public static int getZero() {
	return ZERO;
}
}
