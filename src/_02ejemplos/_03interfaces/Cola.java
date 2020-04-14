package _02ejemplos._03interfaces;

public interface Cola {
	//Solo se definen las cabeceras de los métodos.
	//Todos los métodos se suponen public y abstract
	// (no hace falta ponerlo)
	
	void encolar(Object o);
	Object desencolar();
	int getTamanyo();

}
