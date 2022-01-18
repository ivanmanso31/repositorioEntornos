
public interface InterfazCuentaCorriente {

	/**
	 * M�todo que le da valor al nombre de una cuenta
	 * @param nom
	 */
	void setNombre(String nom);

	/**
	 * M�todo que devuelve el nombre asociado a una cuenta
	 * @return nombre
	 */
	String getNombre();

	/**
	 * M�todo para saber el saldo de una cuenta
	 * @return saldo
	 */
	double getSaldo();

	/**
	 * M�todo para ingresar dinero en una cuenta
	 * Lanza una excepci�n si se intenta ingresar una cantidad negativa
	 * @param cantidad
	 * @throws Exception
	 */
	void ingresar(double cantidad) throws Exception;

	/**
	 * M�todo para retirar dinero de una cuenta
	 * Si la cantidad a retirar es negativa lanza una excepci�n 
	 * o si se intenta retirar m�s de lo que hay en la cuenta lo muestra en pantalla
	 * @param cantidad
	 * @throws Exception
	 */
	void retirar(double cantidad) throws Exception;

	/**
	 * M�todo que devuelve la cuenta
	 * @return cuenta
	 */
	String getCuenta();

	/**
	 * M�todo que le da un valor a la cuenta
	 * @param cuenta
	 */
	void setCuenta(String cuenta);

	/**
	 * M�todo que le da un valor al saldo
	 * @param saldo
	 */
	void setSaldo(double saldo);

	/**
	 * M�todo que devuelve el tipo de inter�s
	 * @return tipoInter�s
	 */
	double getTipoInteres();

	/**
	 * M�todo que le da un valor al tipo de inter�s
	 * @param tipoInter�s
	 */
	void setTipoInteres(double tipoInter�s);

}