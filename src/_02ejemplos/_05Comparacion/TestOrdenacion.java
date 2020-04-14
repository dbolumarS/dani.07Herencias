package _02ejemplos._05Comparacion;

import java.util.Arrays;

public class TestOrdenacion {
	public static void main(String[] args) {
		int [] v = {8,3,4,2,1,9,5,6};
		Ordenacion.ordenar(v);
		System.out.println(Arrays.toString(v));
	}
}
