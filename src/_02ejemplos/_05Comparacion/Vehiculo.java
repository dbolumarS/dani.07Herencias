package _02ejemplos._05Comparacion;

public class Vehiculo implements Comparable<Vehiculo>{
	private String matricula;
	private String marca;
	public Vehiculo(String matricula, String marca){
		this.matricula = matricula;
		this.marca = marca;
		
	}
	public String toString(){
		return matricula + " - " + marca;
	}
	
	
	public int compareTo(Vehiculo v){
		return this.matricula.compareTo(v.matricula);
	}
}
