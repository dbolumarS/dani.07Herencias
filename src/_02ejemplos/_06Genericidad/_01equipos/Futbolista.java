package _02ejemplos._06Genericidad._01equipos;

public class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	private boolean esPortero;
	
	public Futbolista(String nombre,boolean esPortero){
		this.nombre = nombre;
		this.esPortero = false;
	}
	
	public String toString(){
		if(esPortero) return nombre + " (P)";
		else return nombre;
	}
	
	public boolean equals(Object o){
		return this == o && o instanceof Futbolista 
				&& this.nombre.equals(((Futbolista)o).nombre);
	}

	@Override
	public int compareTo(Futbolista o) {
		return this.nombre.compareTo(o.nombre);
	}
}
