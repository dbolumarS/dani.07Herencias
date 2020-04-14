package _02ejemplos._02polimorfismo;

import _02ejemplos._01alumnos.Alumno;
import _02ejemplos._01alumnos.Persona;

public class PolimorfismoForzado {
	public static void main(String[] args) {
		//En las siguientes instrucciones NO HAY polimorfismo
		Persona p = new Persona ("34348389K","Miguel");
		Alumno a = new Alumno("34747222M","Luis",3344);
		
		//En la siguiente instruccion SI LO HAY
		
		Persona p2 = new Alumno("48737377Z","Rosa",477477);
		
		//El tipo estatico es Persona
		//El tipo dinamico es Alumno
		
		//Par compilar java usa el tipo dinamico
		p2.setNombre("Rosa Gonzalez"); //Compila, porque Persona tiene metodo setNombre
		//p2.setNumExpediente(13134); //No compila, porque Persona no tiene setNumExpediente
		
		System.out.println(p2.toString());
		
		
	}

}
