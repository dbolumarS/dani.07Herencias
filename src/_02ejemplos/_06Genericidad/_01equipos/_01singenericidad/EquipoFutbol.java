package _02ejemplos._06Genericidad._01equipos._01singenericidad;

import java.util.ArrayList;

import _02ejemplos._06Genericidad._01equipos.Futbolista;

public class EquipoFutbol {
	private String nombre;
	private ArrayList<Futbolista> miembros;
	private Futbolista capitan;
	
	public EquipoFutbol(String nombre){
		this.nombre = nombre;
		miembros = new ArrayList<>();
	}
	public void anyadir(Futbolista f){
		if(!miembros.contains(f)){
			miembros.add(f);
		}
	}
	public void quitar(Futbolista f){
		if(capitan.equals(f)){
			capitan = null;
		}
		miembros.remove(f);
	}
	public void setCapitan(Futbolista f){
		capitan = f;
	}
	public String toString(){
		return "Equipo: " + nombre + "\n" + 
				"Capitan: " + capitan + "\n" +
				"Miembros: " + miembros;
	}
	
	
}
