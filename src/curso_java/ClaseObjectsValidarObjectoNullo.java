package curso_java;

import java.util.Objects;

import model.Persona;

public class ClaseObjectsValidarObjectoNullo {
	public static void main(String[] args) {

		Persona per = new Persona();
		per.setId(1l);
		
		if(Objects.isNull(per.getId())) {
			System.err.println("persona.id es null");
		}else {
			System.err.println("persona.id NO es null");
		}
	}
}
