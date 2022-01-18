package figuras;
/**
 * Clase que prueba las funcion comparar de la clase círculo
 * @author IvánManso
 * @version V.1
 * @since 23/11/2021
 */

import utilidades.Circulo;

public class Test {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Circulo c1 = new Circulo(5.5);
		Circulo c2 = new Circulo(10.1);
		Circulo c3 = new Circulo(10.9);

		if (c2.esIgual(c3, false)) {
			System.out.println("c2 y c3: iguales sin considerar decimales");
		} else {
			System.out.println("c2 y c3: distintos sin considerar decimales");
		}
		if (c2.esIgual(c3, true)) {
			System.out.println("c2 y c3: iguales considerando decimales");
		} else {
			System.out.println("c2 y c3: distintos considerando decimales");
		}
		if (c1.esIgual(c3, false)) {
			System.out.println("c1 y c3: iguales sin considerar decimales");
		} else {
			System.out.println("c1 y c3: distintos sin considerar decimales");
		}
	}
}

