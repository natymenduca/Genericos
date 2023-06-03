package s106_n2Ex1_ArgumentosNoGeneric;

public class S106_n2Ex2_ListArgumentosVariableIndefinida {

	public static void main(String[] args) {
		//podemos llamar al método imprimirArgumentos() con diferentes tipos de parametros
		
		Persona humano = new Persona("Alex", "Can", 5); //nombre y apellido son genericos
		  String string = "Sigue la magia";
		  int edad = 50; //argumento no generico

		  GenericMethods.imprimirArgumentos(humano, string, edad);
	}
}

