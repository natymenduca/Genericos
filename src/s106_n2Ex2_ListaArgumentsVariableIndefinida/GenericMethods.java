package s106_n2Ex2_ListaArgumentsVariableIndefinida;

import java.util.List;

public class GenericMethods {
	// Todo Crear la clase GenericMethods con un método genérico que acepte una lista de argumentos de variable indefinida
	 public static <T> void printList(List<T> lista) {
	        for (T elemento : lista) {
	            System.out.println(elemento);
	        }
	 }

}
