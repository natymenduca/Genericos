package s106_n2Ex1_ArgumentosNoGeneric;

public class Persona {
	//TODO Crear la clase Persona con los atributos nombre, apellido y edad
	private String nombre;
    private String apellido;
    private int edad;
    
    //metodo constructor
    public Persona(String nombre, String apellido, int edad) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
    }
    //getters 
	public String getNombre() {
		return nombre;
	}
    public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	
	//setters
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
    
  

