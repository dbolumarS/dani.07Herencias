package _02ejemplos._01alumnos;

public class Alumno extends Persona{
	private int numExpediente;
	
	public Alumno(String dni, String nombre, int numExpediente){
		//La primera instrucción tiene que llamar al constructor
		//de la clase padre (Persona)
		super(dni,nombre);
		this.numExpediente = numExpediente;
	}

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}
	public String toString(){
		//Reescritura total
		//return "Alumno con numero de expediente " + numExpediente;
		
		//Reescritura parcial
		return super.toString() + " - " + numExpediente;
		
	}
	

}
