
public interface InterfazCuentaCorriente {

	/**
	 * Método que le da valor al nombre de una cuenta
	 * @param nom
	 */
	void setNombre(String nom);

	/**
	 * Método que devuelve el nombre asociado a una cuenta
	 * @return nombre
	 */
	String getNombre();

	/**
	 * Método para saber el saldo de una cuenta
	 * @return saldo
	 */
	double getSaldo();

	/**
	 * Método para ingresar dinero en una cuenta
	 * Lanza una excepción si se intenta ingresar una cantidad negativa
	 * @param cantidad
	 * @throws Exception
	 */
	void ingresar(double cantidad) throws Exception;

	/**
	 * Método para retirar dinero de una cuenta
	 * Si la cantidad a retirar es negativa lanza una excepción 
	 * o si se intenta retirar más de lo que hay en la cuenta lo muestra en pantalla
	 * @param cantidad
	 * @throws Exception
	 */
	void retirar(double cantidad) throws Exception;

	/**
	 * Método que devuelve la cuenta
	 * @return cuenta
	 */
	String getCuenta();

	/**
	 * Método que le da un valor a la cuenta
	 * @param cuenta
	 */
	void setCuenta(String cuenta);

	/**
	 * Método que le da un valor al saldo
	 * @param saldo
	 */
	void setSaldo(double saldo);

	/**
	 * Método que devuelve el tipo de interés
	 * @return tipoInterés
	 */
	double getTipoInteres();

	/**
	 * Método que le da un valor al tipo de interés
	 * @param tipoInterés
	 */
	void setTipoInteres(double tipoInterés);

}