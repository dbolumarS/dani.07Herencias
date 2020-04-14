package _02ejemplos._06Genericidad._01equipos._02congenericidad;

import java.util.ArrayList;

import _03ejercicios._03figuras.Figura;

public class Equipo <T> {
	private String nombre;
	private ArrayList<T> miembros;
	private T capitan;
	
	public Equipo(String nombre){
		this.nombre = nombre;
		miembros = new ArrayList<>();
	}
	public void anyadir(T f){
		if(!miembros.contains(f)){
			miembros.add(f);
		}
	}
	public void quitar(T f){
		if(capitan.equals(f)){
			capitan = null;
		}
		miembros.remove(f);
	}
	public String toString(){
		return "Equipo: " + nombre + "\n" + 
				"Capitan: " + capitan + "\n" +
				"Miembros: " + miembros;
	}
	
	public void setCapitan(T f){
		capitan = f;
	}
}
