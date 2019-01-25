package contactos;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAgenda {

	static Scanner scan =new Scanner(System.in);
	
	public static void mainf(String[] args) {
	
		ArrayList<Agenda> contacto = new ArrayList<Agenda>();
	
		int opcion= scan.nextInt();
	
		switch (opcion) {
		case 1:
			añadirContacto(contacto);
			break;
		}
	}
	public static void añadirContacto(ArrayList<Agenda> contacto) {
		System.out.println("Introduce nombre del contacto");
		String nombre =scan.nextLine();
		System.out.println("Introduce numero de telefono");
		int telefono = scan.nextInt();
		
		Agenda c = new Agenda (nombre, telefono);
		contacto.add(c);
	}
	public boolean existeContacto(String nombre) {
		if(Agenda.nombre==nombre)
		return true;
	}
	
	public void listarContactos(ArrayList<Agenda>contacto){
		for (Agenda contact: contacto) {
			System.out.println(" - "+contact.toString());
		}
	}
	
	public void buscarContacto(ArrayList<Agenda>contacto) {
		
		System.out.println("Introduzca el nombre del contacto");
		String nombre = scan.nextLine();
		System.out.println("Introduzca el número de teléfono");
		int telefono = scan.nextInt();
		
		Agenda c = new Agenda(nombre, telefono);
		int posicion = contacto.indexOf(c);
		if(posicion >=0) {
			System.out.println("está en la posicion"+posicion);
		}else {
			System.out.println("no está en la lista");
		}
	}
	
}
