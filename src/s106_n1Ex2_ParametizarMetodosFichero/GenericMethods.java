package s106_n1Ex2_ParametizarMetodosFichero;

public class GenericMethods {
	/*TODO Crear una clase llamada GenericMethods con un método genérico que acepte tres argumentos de tipo genérico. 
	Este método solo tiene que imprimir por pantalla los argumentos que ha recibido*/
	
	 public static <T> void printGeneric(T arg1, T arg2, T arg3){
	        System.out.println(arg1);
	        System.out.println(arg2);
	        System.out.println(arg3);
	 }
}

