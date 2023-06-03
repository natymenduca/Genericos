package s106_n1Ex1_NoGenericsMethods;

public class S106_n1Ex1_NoGenericsMethods {

	public static void main(String[] args) {
		
		/*Para comprobar que los argumentos se pueden poner en cualquier posición en el llamamiento al constructor, creamos un obj de la clase NoGenericMethods
		 con tres objetos de diferentes tipos y luego intercambiar los argumentos del constructor en el llamamiento*/
		
		NoGenericMethods<String> noGenericMethods = new NoGenericMethods<>("objeto1", "objeto2", "objeto3");
		System.out.println(noGenericMethods.extraer());

		NoGenericMethods<String> noGenericMethods1 = new NoGenericMethods<>("objeto3", "objeto1", "objeto2");
		System.out.println(noGenericMethods1.extraer());
	}
}






