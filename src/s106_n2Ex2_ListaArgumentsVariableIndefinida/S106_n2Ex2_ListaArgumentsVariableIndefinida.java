package s106_n2Ex2_ListaArgumentsVariableIndefinida;

import java.util.ArrayList;
import java.util.List;

public class S106_n2Ex2_ListaArgumentsVariableIndefinida {

	public static void main(String[] args) {
		//Llamar al método genérico printList de la clase GenericMethods y pasarle la lista de objetos Persona
		
	        List<Persona> listaPersonas = new ArrayList<>();
	        listaPersonas.add(new Persona("Alex", "Fuego", 5));
	        listaPersonas.add(new Persona("Lua", "Sol", 2));
	        listaPersonas.add(new Persona("Peter", "Pam", 18));
	        
	        GenericMethods.printList(listaPersonas);
	}
    /*Este código imprimirá en la consola los objetos de la lista, llamando al método toString de cada objeto Persona
	Cabe destacar que este método genérico se puede utilizar con cualquier tipo de lista, no solo con Persona*/
}
