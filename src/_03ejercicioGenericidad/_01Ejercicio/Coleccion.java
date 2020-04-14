package _03ejercicioGenericidad._01Ejercicio;

public interface Coleccion <T> {
	void agregar(T x);
	void eliminar(T x);
	boolean estaVacia(T x);
	int talla();
	boolean	contiene(T x);
}
