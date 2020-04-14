package _03ejercicios._03figuras;

import java.util.ArrayList;

public class TestFiguras {
	public static void main(String[] args) {
		ArrayList<Figura> listaFiguras = new ArrayList<>();
		listaFiguras.add(new Circulo(10,10,"AZUL",20));
		listaFiguras.add(new Rectangulo(10,10,"VERDE",20,30));
		listaFiguras.add(new Circulo(10,12,"BLANCO",20));
		listaFiguras.add(new Rectangulo(12,10,"AZUL",20,40));
		
		for(Figura f: listaFiguras){
			System.out.println(f);
			System.out.println("Area: " + f.area());
		}
		
		Circulo c = new Circulo(10,10,"AZUL",20);
		System.out.println(c.area());
		Rectangulo r =  new Rectangulo(10,10,"VERDE",20,30);
		System.out.println(r.area());
	}
}
