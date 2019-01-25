package contactos;

public class Agenda {
	private static String nombre;
	private int telefono;
	
	public Agenda(String nombre, int telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
	}
	
	public static String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return nombre + telefono;
	}

}
