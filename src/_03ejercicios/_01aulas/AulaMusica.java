package _03ejercicios._01aulas;



public class AulaMusica extends Aula{
	
	private boolean piano;
	
	public AulaMusica(int codigo, double longitud, double anchura, boolean piano){
		super(codigo, longitud, anchura);
		this.piano = piano;
	}

	@Override
	public String toString(){
		return "Aula musica: " + super.toString();
	}
	
	@Override
	public int capacidad(){
		//Reescritura total
//		if(piano){
//			return (int) (getLongitud() * getAnchura() / 1.4) - 2;
//		} else {
//			return (int) (getLongitud() * getAnchura() / 1.4);
//		}
		//Reescritura parcial
		if(piano){
			return super.capacidad() - 2;
		} else {
			return super.capacidad();
		}
	}
}
