package dados;

public class JuegoDeDados {
	private Dado dado1, dado2, dado3;

	public JuegoDeDados() {
		dado1 = new Dado();
		dado2 = new Dado();
		dado3 = new Dado();
	}

	public void jugar() {
		dado1.tirar();
		dado1.imprimir();
		dado2.tirar();
		dado2.imprimir();
		dado3.tirar();
		dado3.imprimir();
		if (dado1.retornarValor() == dado2.retornarValor() && dado1.retornarValor() == dado3.retornarValor()) {
			System.out.println("Ganó");
		} else {
			System.out.println("Perdió");
		}
	}
}
//Clase Juego de dados, en su constructor llama al constructor por defecto que tiene la clase Dado.
//Ese constructor no lo hemos definido lo genera por defecto el compilador. 
