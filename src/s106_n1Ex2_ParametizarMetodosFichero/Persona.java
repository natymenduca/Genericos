package s106_n1Ex2_ParametizarMetodosFichero;

public class Persona {
	//TODO Crear una clase llamada Persona con los atributos nombre, apellido y edad
	
	    private String nombre;
	    private String apellido;
	    private int edad;

	    public Persona(String nombre, String apellido, int edad) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.edad = edad;
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
