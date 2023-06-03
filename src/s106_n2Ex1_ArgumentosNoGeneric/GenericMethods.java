package s106_n2Ex1_ArgumentosNoGeneric;

public class GenericMethods {
	     // T y U son los argumentos de tipo genéricos y i es un tipo primitivo
		  public static <T, U> void imprimirArgumentos(T tan, U ton, int argu) { //El método printTwoGenerics() simplemente imprime los valores de los argumentos que ha recibido
		    System.out.println("Argumento 1 (tipo generico): " + tan);
		    System.out.println("Argumento 2 (tipo generico): " + ton);
		    System.out.println("Argumento 3 (tipo primitivo): " + argu);
		  }
}

