package s106_n2Ex2_ListaArgumentsVariableIndefinida;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
	}
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;

	}
	public int getEdad() {
		return edad;
	}
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
