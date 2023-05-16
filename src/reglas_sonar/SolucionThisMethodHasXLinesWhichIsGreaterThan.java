package reglas_sonar;

import javax.swing.JOptionPane;

import model.Persona;

public class SolucionThisMethodHasXLinesWhichIsGreaterThan {
	public static void main(String[] args) {
		Persona persona = crearPersona();
		guardarPersona(persona);
	}

	private static Persona crearPersona() {
		Persona per = new Persona();
		per.setNombre("Harry");
		per.setApellido("Mesa");
		return per;
	}

	//Solución (FIX): Sonar - Java: This method has XX lines, which is greater than the XX lines autorized. Split it into smaller methods.
	private static void guardarPersona(Persona persona) {
		boolean permitirGuardado = false;
		permitirGuardado = validarCampos(persona);
		if(permitirGuardado) {
			JOptionPane.showMessageDialog(null, "Se guardo la información correctamente");
		}else {
			JOptionPane.showMessageDialog(null, "Hay datos vacios, debe ingresarlos para poder guardar la información");
		}
	}

	private static boolean validarCampos(Persona persona) {
		boolean permitirGuardado;
		if(persona.getNombre().isBlank()) {
			permitirGuardado = false;
		}else if(persona.getApellido().isBlank()) {
			permitirGuardado = false;
		}else if(persona.getDireccion().isBlank()) {
			permitirGuardado = false;
		}else if(persona.getCelular().isBlank()) {
			permitirGuardado = false;
		}else if(persona.getTelefono().isBlank()) {
			permitirGuardado = false;
		}else if(persona.getGenero().isBlank()) {
			permitirGuardado = false;
		}else if(persona.getTipoDocumento().isBlank()) {
			permitirGuardado = false;
		}else if(persona.getFechaNacimiento()==null) {
			permitirGuardado = false;
		}else if(persona.getDocumento().isBlank()) {
			permitirGuardado = false;
		}else if(persona.getFechaExpedicionDocumento()==null) {
			permitirGuardado = false;
		}else if(persona.getIngresosMensuales()==null) {
			permitirGuardado = false;
		} else {
			permitirGuardado = validarCamposParte2(persona);
		}
		return permitirGuardado;
	}

	private static boolean validarCamposParte2(Persona persona) {
		boolean permitirGuardado;
		
		//Solución (FIX): Sonar - Java: Missing curly brace.
		if(persona.getEgresosMensuales()==null) 
			permitirGuardado = false;
		else 
			permitirGuardado = true;

		return permitirGuardado;
	}
}
