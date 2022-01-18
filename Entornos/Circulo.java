package utilidades;
/**
 * Clase que realiza funciones con círculos
 * @author IvánManso
 * @version v1.0
 * @since 23/11/2021
 */
public class Circulo {
	/**
	 * variable double referida al radio
	 */
	private double rad;
/**
 * constructor de un círculo
 * @param radio double
 */
	public Circulo(double radio) {
		this.rad = radio;
	}
/**
 * método que obtiene el radio
 * @return rad
 */
	public double getRad() {
		return rad;
	}
/**
 * método que le da un valor al radio
 * @param rad double
 */
	public void setRad(double rad) {
		this.rad = rad;
	}
/**
 * método que muestra los valores de color, diámetro y área del círculo
 */
	/**
	 * calculamos el área con 2*pi*rad^2
	 */
	public void imprimir() {
		String color = "rojo";
		System.out.println("Diámetro: " + 2 * rad);
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * rad * rad;
		System.out.println(area);
	}
/**
 * método que compara un círculo con otro de dos formas distintas dependiendo
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
