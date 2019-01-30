import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListAgenda {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Agenda> contactos = new ArrayList<Agenda>();

	public static void main(String[] args) {

		int opcion;

		do {

			System.out.println("\n");
			System.out.println("Menú:");
			System.out.println(" 1. Añadir nuevo contacto");
			System.out.println(" 2. Buscar contacto");
			System.out.println(" 3. Eliminar contacto");
			System.out.println(" 4. Ver lista de contactos");
			System.out.println(" 5. Salir");
			System.out.println("Introduzca opción");

			opcion = scan.nextInt();
			scan.nextLine();
			switch (opcion) {
			case 1:
				aniadirContacto();
				break;
			case 2:
				System.out.println("Introduce un nombre");
				String nombreBuscar = scan.nextLine();
				buscarContacto(nombreBuscar);

				break;
			case 3:
				System.out.println("Introduce un nombre");
				String borrarContacto = scan.nextLine();
				eliminarContacto(borrarContacto);
				break;
			case 4:

				listarContactos();
				break;
			case 5:
				break;
			default:
				System.out.println("Opción incorrecta. Elija otra");
			}
		} while (opcion != 6);

	}

	private static void aniadirContacto() {
		System.out.println("Introduce el nombre del contacto");
		String nombre = scan.nextLine();

		System.out.println("Introduce un numero de telefono");
		int numTel = scan.nextInt();

		if (existeContacto(nombre) == false) {
			Agenda contacto = new Agenda();
			contacto.setNombre(nombre);
			contacto.setTelefono(numTel);
			contactos.add(contacto);
		} else {
			System.out.println("Contacto duplicado imposible crear contacto");
		}

	}

	private static boolean existeContacto(String nombre) {

		for (int i = 0; i < contactos.size(); i++) {
			if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) { // equalsIgnoreCase: si pasamos Asier y asier
																			// funciona igual, sino no es el mismo
																			// nombre
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public static void listarContactos() {

		Iterator it = contactos.iterator();
		while (it.hasNext()) {
			Agenda obj = (Agenda) it.next();
			System.out.println(obj);
		}

	}

	public static void buscarContacto(String nombre) {

		for (Agenda mostrarContacto : contactos) // Recorre el arraylist y cada contacto por cada vuelta el que toque lo
													// guarda en una variable mostrarContacto
		{
			if (mostrarContacto.getNombre().equalsIgnoreCase(nombre)) { // Compara el nombre del objeto en la variable
																		// con el nombre que le pasamos y si son iguales
																		// los muestra en pantalla
				System.out.println(mostrarContacto.toStringTelefono());
			}
		}
	}

	public static void eliminarContacto(String nombre) {

		for (int i = 0; i < contactos.size(); i++) {
			if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				contactos.remove(i);
				System.out.println("Contacto con el nombre " + nombre + " ha sido eliminado");
			}
		}

	}

}