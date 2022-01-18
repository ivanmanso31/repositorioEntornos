


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Clase que prueba los métodos de la clase CCuenta
 * @author IvánManso
 * @version v1.0
 * @since 30/11/2021
 */
public class Main {
	static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		InterfazCuentaCorriente cuenta1;
		double saldoActual;
		int opcion = 0;
		cuenta1 = new CuentaCorriente("Juan López", "1000-2365-85-123456789", 2500, 0);
		do {
			try {
				System.out.println("MENÚ DE OPERACIONES");
				System.out.println("-------------------");
				System.out.println("1 - Ingresar");
				System.out.println("2 - Retirar");
				System.out.println("3 - Finalizar");
				opcion = Integer.parseInt(dato.readLine());
				if (opcion == 1) {
					System.out.println("¿Cuánto desea ingresar?: ");
					float ingresar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, ingresar, opcion);
				} else if (opcion == 2) {
					System.out.println("¿Cuátno desea retirar?: ");
					float retirar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, retirar, opcion);
				} else if (opcion == 3) {
					System.out.println("Finalizamos la ejecución");
				} else {
					System.err.println("Opción errónea");
				}
/*               switch(opcion){
                case 1:
                    System.out.println("¿Cuánto desea ingresar?: ");
                    float ingresar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,ingresar,opcion);
                    break;
                case 2:
                    System.out.println("¿Cuátno desea retirar?: ");
                    float retirar=Integer.parseInt(dato.readLine());
                    operativa_cuenta(cuenta1,retirar,opcion);
                    break;
                case 3:
                    System.out.println("Finalizamos la ejecución");
            }
*/
			} catch (IOException ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		} while (opcion != 3);
		saldoActual = cuenta1.getSaldo();
		System.out.println("El saldo actual es: " + saldoActual);
		InterfazCuentaCorriente cuenta2 = new CuentaCorriente("Jaime López", "1444-2445-84-123456789", 1000, 0);
		visualizarDatosCuenta(cuenta1, cuenta2, "Buenos días");
	}
/**
 * @param cuenta1
 * @param cuenta2
 * @param bienvenida TODO
 */
private static void visualizarDatosCuenta(InterfazCuentaCorriente cuenta1, InterfazCuentaCorriente cuenta2, String bienvenida) {
	System.out.println("Datos clientes");
	System.out.println(cuenta1.toString());
	System.out.println(cuenta2.toString());
}
/**
 * Método para retirar o ingresar dinero en una cuenta
 * @param cuenta1
 * @param cantidad
 * @param opcion
 */
	public static void operativa_cuenta(InterfazCuentaCorriente cuenta1, float cantidad, int opcion) {
		if (opcion == 2) {
			try {
				cuenta1.retirar(cantidad);
			} catch (Exception e) {
				System.out.println("Fallo al retirar");
			}
		} else if (opcion == 1) {
			try {
				System.out.println("Ingreso en cuenta");
				cuenta1.ingresar(cantidad);
			} catch (Exception e) {
				System.out.println("Fallo al ingresar");
			}
		}
	}
}