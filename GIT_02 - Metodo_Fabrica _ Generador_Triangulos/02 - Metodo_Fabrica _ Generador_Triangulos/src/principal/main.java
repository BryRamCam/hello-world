2/************************************************************
 * Clase: main
 * Descripción: Esta clase es la principal del programa.
 * @author Erick Brenes
 ************************************************************/
package principal;

import creador_Concreto.Fabrica_Triangulos;
import producto.Triangulo;

public class main {

	public static void main(String[] args) {

		Fabrica_Triangulos mFab = new Fabrica_Triangulos();
		imprimir(mFab.crearTriangulo(10, 10, 10));
		imprimir(mFab.crearTriangulo(10, 20, 30));
		imprimir(mFab.crearTriangulo(10, 20, 10));
		imprimir(mFab.crearTriangulo(ramdomize(), ramdomize(), ramdomize()));
		
	}
	
/************************************************************
 * Metodo:		ramdomize
 * 
 * Descripción:	Esta funcion permite generar un número aleatorio
 * 				entre 1 y 4.
 * 
 * Parametros:	N/A
 * 
 * @return:		Random // Número aleatorio
 *************************************************************/
	private static int ramdomize() {
		return (int) (Math.random() * 4) + 1;
	}

/************************************************************
 * Metodo:		imprimir
 * 
 * Descripción:	Esta funcion imprime los datos de un objeto 
 * 				de tipo triangulo.
 * 
 * Parametros:	Triangulo tr // Objeto tipo triangulo
 * 
 * @return:		N/A
 *************************************************************/	
	private static void imprimir(Triangulo tr) {
		System.out.println(tr.getDescripcion());
		System.out.println("Su area es de: " + tr.getSuperficie());
		System.out.println(tr.dibujar());
	}
}

/***************************************************************************
 * TAREA: 
 * 
 * 1. Terminar las getSuperficie faltantes
 * 
 * 2. Terminar las dibujar faltantes.
 * 
 * 3. Hacer una fabrica para cuadrado o rectangulo.
 ****************************************************************************/

