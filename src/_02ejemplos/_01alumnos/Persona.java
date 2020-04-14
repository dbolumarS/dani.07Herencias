package _02ejemplos._01alumnos;

public class Persona implements Comparable<Persona>/* extends Object */{
	private String dni;
	private String nombre;
	
	public Persona(String dni, String nombre){
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString(){
		return dni + " - " + nombre.toUpperCase();
	}
	
	@Override
	public boolean equals (Object o){
		if(this == o) return true;
		if(!(o instanceof Persona)) return false;
		if(o == null) return false;
		
		Persona p = (Persona)o;
		return this.dni.equals(p.dni);
	}
	
	public int compareTo(Persona p){
		return this.dni.compareTo(p.dni);
	}
	
	
	
	
	
	
	
	
	
	
}
