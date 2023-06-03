package s106_n1Ex1_NoGenericsMethods;

public class NoGenericMethods<T> { //la clase NoGenericMethods es genérica porque se utiliza la letra "T" para indicar que se trabajará con objetos de un tipo desconocido
	
	/*Para crear una clase con tres objetos del mismo tipo se puede utilizar la programación genérica. 
	La programación genérica permite crear clases, interfaces y métodos que funcionan con diferentes tipos de objetos*/
	
	    private T objeto1;//crea tres objetos del mismo tipo
	    private T objeto2;
	    private T objeto3;
    
	    /*Crear un constructor que inicialice los tres objetos de tipo T
	    Los argumentos del constructor deben ser intercambiables*/
	    public NoGenericMethods(T objeto1, T objeto2, T objeto3) {
	        this.objeto1 = objeto1;
	        this.objeto2 = objeto2;
	        this.objeto3 = objeto3;
	    }
        //el método almacenar se reciben tres objetos de tipo T y se asignan a los atributos de la clase
	    public void almacenar(T objeto1, T objeto2, T objeto3) {
	        this.objeto1 = objeto1;
	        this.objeto2 = objeto2;
	        this.objeto3 = objeto3;
	    }
	    //el método extraer se devuelve una cadena de caracteres con los tres objetos almacenados
	    public String extraer() {
	        return objeto1.toString() + " " + objeto2.toString() + " " + objeto3.toString();
	    }

}
