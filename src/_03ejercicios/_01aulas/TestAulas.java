package _03ejercicios._01aulas;

public class TestAulas {
	public static void main(String[] args) {
		Aula a1 = new Aula(1,10,10);
		System.out.println(a1);
		
		AulaInformatica ai1 = new AulaInformatica(2,10,10,20);
		System.out.println(ai1);
		
		AulaMusica am1 = new AulaMusica(3,10,10,true);
		System.out.println(am1);
	}

}
