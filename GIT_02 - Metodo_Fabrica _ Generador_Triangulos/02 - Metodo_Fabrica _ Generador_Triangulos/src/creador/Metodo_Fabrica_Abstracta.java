/************************************************************
 * Clase: Metodo_Fabrica_Abstracta
 * Descripción: Esta clase es la fabrica abstacta.
 * @author Erick Brenes
 ************************************************************/
package creador;

import producto.Triangulo;

public interface Metodo_Fabrica_Abstracta {
	public Triangulo crearTriangulo (int pLadoA,int pLadoB,int pLadoC);
}
