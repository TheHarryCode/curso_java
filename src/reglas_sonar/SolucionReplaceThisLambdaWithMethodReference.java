package reglas_sonar;

import java.util.ArrayList;
import java.util.List;

import model.Persona;

public class SolucionReplaceThisLambdaWithMethodReference {
	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<>();
		
		Persona per1 = new Persona();
		per1.setNombre("Harry");
		per1.setPersonaPublica(false);
		
		Persona per2 = new Persona();
		per2.setNombre("Laura");
		per2.setPersonaPublica(true);
		
		Persona per3 = new Persona();
		per3.setNombre("Sergio");
		per3.setPersonaPublica(true);
		
		personas.add(per1);
		personas.add(per2);
		personas.add(per3);
		
		
		List<Persona> personasPublicas = personas.stream()
				//Solución (FIX): Sonar - Java: Replace this lambda with method reference 'XX::XX'.
				.filter(Persona::isPersonaPublica)
				
				//Solución (FIX): Sonar - Java: Replace this usage of 'Stream.collect(Collectors.toList())' with 'Stream.toList()'
				.toList();
		
		personasPublicas.stream().forEach(c -> System.err.println(c.toString()));
		
	}
}
