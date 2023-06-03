package s106_n1Ex2_ParametizarMetodosFichero;

public class S106_n1Ex2_ParametizarMetodosFichero {
	
	public static void main(String[] args) {
		//TODO llamar el método genérico con diferentes tipos de parámetros. Ejemplo: un objeto de la clase Persona, un String y un tipo primitivo
		
		    Persona humano = new Persona("Ana", "Luz", 30);
		    String cadena = "Hola";
		    int numero = 5;

		    GenericMethods.printGeneric(humano, cadena, numero);
	}
}
