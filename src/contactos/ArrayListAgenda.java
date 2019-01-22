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
	public void existeContacto(ArrayList<Agenda>contacto) {
		
	}
	
}
