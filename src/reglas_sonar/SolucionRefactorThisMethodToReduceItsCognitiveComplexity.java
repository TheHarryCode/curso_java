package reglas_sonar;

import model.Persona;

public class SolucionRefactorThisMethodToReduceItsCognitiveComplexity {
	public static void main(String[] args) {
		Persona persona = crearPersona();
		System.err.println("Info Completa de Persona: "+validarInfoPersonaBasic(persona));
	}

	private static Persona crearPersona() {
		Persona per = new Persona();
		per.setNombre("Harry");
		per.setApellido("Mesa");
		return per;
	}

	//Solución (FIX): Sonar - Java: Refactor this method to reduce its Cognitive Complexity from 18 to the 15 allowed.
	private static boolean validarInfoPersonaBasic(Persona persona) {
		boolean respuesta = false;
		if(persona.getNombre().isBlank()) {
			respuesta = false;
		}else if(persona.getNombre2().isBlank()) {
			respuesta = false;
		}else if(persona.getApellido().isBlank()) {
			respuesta = false;
		}else if(persona.getApellido2().isBlank()) {
			respuesta = false;
		}else if(persona.getDireccion().isBlank()) {
			respuesta = false;
		}else if(persona.getDireccion2().isBlank()) {
			respuesta = false;
		}else if(persona.getGenero().isBlank()) {
			respuesta = false;
		}else if(persona.getTipoDocumento().isBlank()) {
			respuesta = false;
		}else if(persona.getDocumento().isBlank()) {
			respuesta = false;
		}else if(persona.getDocumentoEquivalente().isBlank()) {
			respuesta = false;
		} else {
			respuesta = true;
		}
		return respuesta;
	}

}
