package _02ejemplos._04animales;

public class TestAnimales {
	public static void main(String[] args) {
		Perro p = new Perro("Toby");
		Gato g = new Gato("Tom");
		Conejo c = new Conejo("Amadeo");
		
		p.llevarALaPelu();
		g.llevarALaPelu();
		
		Animal[] misAnimales = {p,g,c};
		for(int i = 0; i< misAnimales.length; i++){
			misAnimales[i].darDeComer();
			// misAnimales[i].llevarALaPelu(); No compila: tipo estático Animal
			
			//Una solucion mala sería la siguiente 
			if(misAnimales[i] instanceof Perro)
				((Perro)misAnimales[i]).llevarALaPelu();
			else if(misAnimales[i] instanceof Gato){
				((Gato)misAnimales[i]).llevarALaPelu();
			}
		}
		
		for (int i = 0; i < misAnimales.length; i++) {
			((Mascota) misAnimales[i]).llevarALaPelu();
		}
	}
}
