package contraseña;

public class Password {

	private String contraseña;
	private int valor;
	private boolean fuerte;
	private int contadorMayus;
	private int contadorMinus;
	private int contadorNums;

	public boolean esFuerte() {

		for (int i = 0; i <= contraseña.length(); i++) {
			valor = contraseña.charAt(i);

			if (valor <= 90 && valor >= 65) {
				contadorMayus++;
			} else if (valor <= 122 && valor >= 97) {
				contadorMinus++;
			} else if (valor <= 57 && valor >= 48) {
				contadorNums++;
			}
		}

		if (contadorMayus > 1 && contadorMinus > 2 && contadorNums > 5) {
			fuerte = true;
		}else {
			fuerte = false;
		}
		return fuerte;
	}

}
