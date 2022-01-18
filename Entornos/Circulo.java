package utilidades;
/**
 * Clase que realiza funciones con c�rculos
 * @author Iv�nManso
 * @version v1.0
 * @since 23/11/2021
 */
public class Circulo {
	/**
	 * variable double referida al radio
	 */
	private double rad;
/**
 * constructor de un c�rculo
 * @param radio double
 */
	public Circulo(double radio) {
		this.rad = radio;
	}
/**
 * m�todo que obtiene el radio
 * @return rad
 */
	public double getRad() {
		return rad;
	}
/**
 * m�todo que le da un valor al radio
 * @param rad double
 */
	public void setRad(double rad) {
		this.rad = rad;
	}
/**
 * m�todo que muestra los valores de color, di�metro y �rea del c�rculo
 */
	/**
	 * calculamos el �rea con 2*pi*rad^2
	 */
	public void imprimir() {
		String color = "rojo";
		System.out.println("Di�metro: " + 2 * rad);
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * rad * rad;
		System.out.println(area);
	}
/**
 * m�todo que compara un c�rculo con otro de dos formas distintas dependiendo
 *  de si tienen decimales o no
 * @param otro
 * @param conDecimales
 * @return true si son iguales y false si no
 */
	public boolean esIgual(Circulo otro, boolean conDecimales) {
		double radio1 = this.rad;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
