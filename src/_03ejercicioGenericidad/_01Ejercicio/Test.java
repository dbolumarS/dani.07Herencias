package _03ejercicioGenericidad._01Ejercicio;

public class Test {
	public static void main(String[] args) {
		Conjunto<String> c1 = new Conjunto<>();
		
		c1.agregar("casa");
		c1.agregar("casa");
		c1.agregar("coche");
		c1.agregar("avion");
		
		System.out.println(c1);
	}
}
