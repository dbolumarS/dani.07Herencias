package _02ejemplos._06Genericidad._01equipos._01singenericidad;

import java.util.ArrayList;

import _02ejemplos._06Genericidad._01equipos.Baloncestista;

public class EquipoBaloncesto {
	private String nombre;
	private ArrayList<Baloncestista> miembros;
	private Baloncestista capitan;
	
	public EquipoBaloncesto(String nombre){
		this.nombre = nombre;
		miembros = new ArrayList<>();
	}
	public void anyadir(Baloncestista f){
		if(!miembros.contains(f)){
			miembros.add(f);
		}
	}
	public void quitar(Baloncestista f){
		if(capitan.equals(f)){
			capitan = null;
		}
		miembros.remove(f);
	}
	public void setCapitan(Baloncestista f){
		capitan = f;
	}
	public String toString(){
		return "Equipo: " + nombre + "\n" + 
				"Capitan: " + capitan + "\n" +
				"Miembros: " + miembros;
	}
	
	
}
