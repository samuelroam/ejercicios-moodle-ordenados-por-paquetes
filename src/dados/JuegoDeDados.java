package dados;

public class JuegoDeDados {
	private Dado dado1, dado2, dado3, dado4, dado5, dado6;
	private int resultado1, resultado2;

	public JuegoDeDados() {
		dado1 = new Dado();
		dado2 = new Dado();
		dado3 = new Dado();

		dado4 = new Dado();
		dado5 = new Dado();
		dado6 = new Dado();

	}

	public void jugar() {
		dado1.tirar();
		dado1.imprimir();
		dado2.tirar();
		dado2.imprimir();
		dado3.tirar();
		dado3.imprimir();
		dado4.tirar();
		dado4.imprimir();
		dado5.tirar();
		dado5.imprimir();
		dado6.tirar();
		dado6.imprimir();

		resultado1 = dado1.retornarValor() + dado2.retornarValor() + dado3.retornarValor();
		resultado2 = dado4.retornarValor() + dado5.retornarValor() + dado6.retornarValor();
		
		System.out.println("La suma de los dados de J1 es: "+resultado1);
		System.out.println("La suma de los dados de J2 es: "+resultado2);

		if (dado1.retornarValor() == dado2.retornarValor() && dado2.retornarValor() == dado3.retornarValor()) {
			resultado1 = resultado1 + 10;
		} else if (dado1.retornarValor() == dado2.retornarValor() || dado2.retornarValor() == dado3.retornarValor()
				|| dado3.retornarValor() == dado1.retornarValor()) {
			resultado1 = resultado1 + 5;
		}

		if (dado4.retornarValor() == dado5.retornarValor() && dado5.retornarValor() == dado6.retornarValor()) {
			resultado2 = resultado2 + 10;
		} else if (dado4.retornarValor() == dado5.retornarValor() || dado5.retornarValor() == dado6.retornarValor()
				|| dado6.retornarValor() == dado4.retornarValor()) {
			resultado2 = resultado2 + 5;
		}

		System.out.println("El valor final de J1 es: " + resultado1);
		System.out.println("El valor final de J2 es: " + resultado2);
		if (resultado1 > resultado2) {
			System.out.println("Gana jugador 1");
		} else {
			System.out.println("Gana jugador 2");
		}
	}
}
//Clase Juego de dados, en su constructor llama al constructor por defecto que tiene la clase Dado.
//Ese constructor no lo hemos definido lo genera por defecto el compilador. 
