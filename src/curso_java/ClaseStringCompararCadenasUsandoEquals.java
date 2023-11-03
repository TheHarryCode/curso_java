package curso_java;

import model.Persona;

public class ClaseStringCompararCadenasUsandoEquals {
	public static void main(String[] args) {
		Persona per = new Persona();
		per.setNombre(null);
//		String nombre = null;
		//Solución (FIX): Java: Null pointer access: The variable nombre can only be null at this location
		//Solución (FIX): Sonar - Java: A "NullPointerException" could be thrown; "XX" is nullable here.
		//Solución (FIX): Java: Cannot invoke "String.equals(Object)" because the return value of "XX" is null
		if("Harry".equals(per.getNombre())) {
			System.err.println("Son iguales");
		}else {
			System.err.println("NO Son iguales");
		}
	}
}
